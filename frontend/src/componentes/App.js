import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Layout from './Layout';
import Inicio from '../paginas/Inicio';
import Crearcliente from '../paginas/CrearCliente';

function App() {
  return (
    <BrowserRouter>
      <Layout>
        <Switch>
          <Route exact path="/" component={Inicio} />
          <Route exact path="/cliente/crear" component={Crearcliente} />
        </Switch>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
