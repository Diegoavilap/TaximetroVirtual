import React from 'react';
import Axios from 'axios';

import CrearCarreraForm from '../componentes/CrearCarreraForm';
import PageLoading from '../componentes/PageLoading';
import './estilos/ClienteNuevo.css';

class CrearCarrera extends React.Component {
  state = {
    loading: false,
    error: null,
    btn_start: false,
    btn_end: true,
    form: {
      clienteId: '',
    },
    carrera: null,
    costoCarrera: null,
  };

  handleChange = e => {
    this.setState({
      form: {
        ...this.state.form,
        [e.target.name]: e.target.value,
      },
    });
  };
  
  handleSubmitInit = async e => {
    e.preventDefault();
    this.setState({ loading: true, error: null });
    
    Axios.post('http://localhost:8080/api/carrera', this.state.form)
    .then(response => {        
        this.setState({ loading: false });
        this.setState({ btn_start: true });
        this.setState({ btn_end: false });
        console.log(response.data);
        this.setState({ carrera: response.data });    

    }).catch(error =>{        
        console.log(error);
        this.setState({ loading: false, error: {message: error.response.data.message} });
    });
  };

  handleClickEnd = async e => {
    this.setState({ loading: true, error: null });
    Axios.post(
        'http://localhost:8080/api/detalleCarrera',
        {carreraId: this.state.carrera.id}        
    ).then(response => {        
        this.setState({ loading: false });
        this.setState({ btn_start: false });
        this.setState({ btn_end: true });
        this.setState({ costoCarrera: response.data.costo });
    }).catch(error =>{        
        console.log(error.response.data.message);
        this.setState({ loading: false, error: {message: error.response.data.message}  });
    });
  };

  render() {
    return (
      <React.Fragment>
        <div className="ClienteNuevo__hero"></div>

        <div className="container">
          <div className="row">
            <div className="col-6 offset-md-3">
              <h1>Iniciar Carrera</h1>
              <CrearCarreraForm
                onChange={this.handleChange}
                onSubmit={this.handleSubmitInit}
                onClickEnd={this.handleClickEnd}
                formValues={this.state.form}
                error={this.state.error}
                btn_start={this.state.btn_start}
                btn_end={this.state.btn_end}
                carrera={this.state.carrera}
                costoCarrera={this.state.costoCarrera}
              />
            </div>
          </div>
        </div>
      </React.Fragment>
    );
  }
}

export default CrearCarrera;
