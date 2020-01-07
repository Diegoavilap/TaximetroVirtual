import React, { Component } from 'react';
import { Link } from 'react-router-dom';

import './estilos/Inicio.css';

export default class Home extends Component {
  render() {
    return (
      <div className="Home">
            <div className="Home__col col-12 col-md-6">
              <h1>Taximetro Virtual</h1>
              <div className="row">
                <Link className="btn btn-primary mr-4" to="/carrera/crear">
                  Iniciar Carrera
                </Link>

                <Link className="btn btn-primary mr-4" to="/cliente/crear">
                  Crear Cliente
                </Link>

                <Link className="btn btn-primary mr-4" to="/cliente">
                  Listar Clientes
                </Link>
              </div>
              
            </div>
      </div>
    );
  }
}
