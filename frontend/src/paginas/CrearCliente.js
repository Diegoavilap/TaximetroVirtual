import React from 'react';

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
    
    fetch(
        'http://localhost:8080/api/cliente',
        {
            method: 'POST',
            headers: {
                'Content-Type':'application/json'
            },
            body: JSON.stringify(this.state.form)
        }
    ).then(response => {
        if (!response.ok) {
            throw Error(JSON.parse(response));
        }
        this.setState({ loading: false });
       // this.props.history.push('/cliente');
    }).catch(error =>{
        console.log(error);
        this.setState({ loading: false, error: error });
    });
  };

  render() {
    if (this.state.loading) {
        return <PageLoading />;
    }
    return (
      <React.Fragment>
        <div className="ClienteNuevo__hero">
          
        </div>

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
