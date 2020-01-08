import React from 'react';
import Axios from 'axios';
import { Link } from 'react-router-dom';

import './estilos/Cliente.css';
import ListaClientes from '../componentes/ListaClientes';
import PageLoading from '../componentes/PageLoading';

class Clientes extends React.Component {
  state = {
    loading: true,
    error: null,
    data: undefined,
  };

  componentDidMount() {
    this.fetchData();
  }

  fetchData = async () => {
    this.setState({ loading: true, error: null });

    try {
        Axios.get('http://localhost:8080/api/cliente')
        .then(response => {
           this.setState({ loading: false, data: response.data });
        }).catch(error =>{
            this.setState({ loading: false, error: {message: error.response.data.message} });
        });
    } catch (error) {
      this.setState({ loading: false, error: error });
    }
  };

  render() {
    if (this.state.loading === true && !this.state.data) {
      return <PageLoading />;
    }
    return (
      <React.Fragment>
        <div className="Clientes">
          <div className="Clientes__hero">
            <div className="Clientes__container">
            </div>
          </div>
        </div>

        <div className="Clientes__container">
          <div className="Clientes__buttons">
            <Link to="/Cliente/crear" className="btn btn-primary">
              Crear Cliente
            </Link>
          </div>

          <ListaClientes clientes={this.state.data} />
        </div>
      </React.Fragment>
    );
  }
}

export default Clientes;