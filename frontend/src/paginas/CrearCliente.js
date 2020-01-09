import React from 'react';
import Axios from 'axios';

import CrearClienteForm from '../componentes/CrearClienteForm';
import PageLoading from '../componentes/PageLoading';
import './estilos/ClienteNuevo.css';

class CrearCliente extends React.Component {
  state = {
    loading: false,
    error: null,
    form: {
      nombre: '',
      apellido: '',
      cedula: '',
    },
  };

  handleChange = e => {
    this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
  };

  handleSubmit = async e => {
    e.preventDefault();
    this.setState({ loading: true, error: null });
    
    Axios.post(
        'http://localhost:8080/api/cliente',
         this.state.form
        
    ).then(response => {
       this.setState({ loading: false });
       this.props.history.push('/cliente');
    }).catch(error =>{
        this.setState({ loading: false, error: {message: error.response.data.message} });
    });
  };

  render() {
    if (this.state.loading) {
        return <PageLoading />;
    }
    return (
      <React.Fragment>
        <div className="ClienteNuevo__hero"></div>

        <div className="container">
          <div className="row">
            <div className="col-6 offset-md-3">
              <h1>Cliente Nuevo</h1>
              <CrearClienteForm
                onChange={this.handleChange}
                onSubmit={this.handleSubmit}
                formValues={this.state.form}
                error={this.state.error}
              />
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default CrearCliente;
