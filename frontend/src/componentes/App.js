import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Layout from './Layout';
import Inicio from '../paginas/Inicio';
import CrearCliente from '../paginas/CrearCliente';
import ListarClientes from '../paginas/ListarClientes';
import CrearCarrera from '../paginas/CrearCarrera';

function App() {
  return (
    <BrowserRouter>
      <Layout>
        <Switch>
          <Route exact path="/" component={Inicio} />
          <Route exact path="/cliente/" component={ListarClientes} />
          <Route exact path="/cliente/crear" component={CrearCliente} />
          <Route exact path="/carrera/crear" component={CrearCarrera} />
        </Switch>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
