import React from 'react';
import { Link } from 'react-router-dom';

import './estilos/ListaClientes.css';

function ListaClientes(props) {
  const clientes = props.clientes;

  if (clientes.length === 0) {
    return (
      <div>
        <h3>No hay Clientes Registrados</h3>
        <Link className="btn btn-primary" to="/cliente">
          Crear Nuevo Cliente
        </Link>
      </div>
    );
  }

  return (
    <div className="ListaCliente">
      <ul className="list-unstyled">
        {clientes.map(cliente => {
          return (
            <li className="item-lista" key={cliente.id}>
              <Link
                className="text-reset text-decoration-none"
                to={`/cliente/${cliente.id}`}
              >
                <ListaClientesItem cliente={cliente} />
              </Link>
            </li>
          );
        })}
      </ul>
    </div>
  );
}

class ListaClientesItem extends React.Component {
    render() {
        return (
        <div className="ListaClientesItem mt-3">
            <div>
                <h4>
                    Nombre: <span /> 
                    <strong>
                        {this.props.cliente.nombre} {this.props.cliente.apellido}
                    </strong>
                </h4>
                <br />
                <h4>
                    Cedula: <span /> 
                    <strong>
                        {this.props.cliente.cedula}
                    </strong>
                </h4>
            </div>
        </div>
        );
    }
}

export default ListaClientes;


