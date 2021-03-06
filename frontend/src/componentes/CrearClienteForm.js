import React from 'react';

class CrearClienteForm extends React.Component {
  
  render() {
    return (
      <div>
        <form onSubmit={this.props.onSubmit}>
          <div className="form-group">
            <label>Nombre</label>
            <input
              id="nombre"
              onChange={this.props.onChange}
              className="form-control"
              type="text"
              name="nombre"
              required
              value={this.props.formValues.nombre}
            />
          </div>

          <div className="form-group">
            <label>Apellido</label>
            <input
              id="apellido"
              onChange={this.props.onChange}
              className="form-control"
              type="text"
              name="apellido"
              required
              value={this.props.formValues.apellido}
            />
          </div>

          <div className="form-group">
            <label>Cedula</label>
            <input
              id="cedula"
              onChange={this.props.onChange}
              className="form-control"
              type="number"
              name="cedula"
              required
              value={this.props.formValues.cedula}
            />
          </div>

          <button id="btn-crear-cliente" onClick={this.handleClick} className="btn btn-primary">
            Registrar
          </button>

          {this.props.error && (
            <p className="text-danger">{this.props.error.message}</p>
          )}
        </form>
      </div>
    );
  }
}

export default CrearClienteForm;
