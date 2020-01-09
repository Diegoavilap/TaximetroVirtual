import React from 'react';

class CrearClienteForm extends React.Component {
  
  render() {
    return (
      <div>
        <form onSubmit={this.props.onSubmit}>
          <div className="form-group">
            <label>Cedula Cliente</label>
            <input
              id="cliente_id"
              onChange={this.props.onChange}
              className="form-control"
              type="text"
              name="clienteId"
              required
              value={this.props.formValues.clienteId}
              disabled={this.props.btn_start }
            />
          </div>
          <div className="row">
              <div className="col text-left ">
                <button id="crear_carrera" className="btn btn-primary" disabled={this.props.btn_start }>
                    Iniciar
                </button>
              </div>
              <div className="col text-right ">
                <button onClick={this.props.onClickEnd} className="btn btn-danger" disabled={this.props.btn_end}>
                    Terminar
                </button>
              </div>            
          </div>
          

          {this.props.error && (
            <p className="text-danger">{this.props.error.message}</p>
          )}
        </form>
        {this.props.carrera && (
          <div id="msg_iniciar_carrera" className="alert alert-success alert-dismissible fade show mt-4" role="alert">
            <p>
              <strong>Su Carrera a iniciado, ¡Que tenga buen Viaje!</strong>
            </p>
            <p>
              Cuando haya llegado a su destino oprima el botón terminar
            </p>
            <button type="button" className="close" data-dismiss="alert" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
        )}
        {this.props.costoCarrera && (
          <div className="alert alert-warning alert-dismissible fade show mt-4" role="alert">
            <p>
              <strong>Gracias por usar nuestros servicios</strong>
            </p>
            <p>
              el costo de su carrera es de ${this.props.costoCarrera}.
            </p>
            <button type="button" className="close" data-dismiss="alert" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
        )}
      </div>
    );
  }
}

export default CrearClienteForm;
