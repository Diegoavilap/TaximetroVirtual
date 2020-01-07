import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

import Layout from './Layout';
import Inicio from '../paginas/Inicio';

function App() {
  return (
    <BrowserRouter>
      <Layout>
        <Switch>
          <Route exact path="/" component={Inicio} />
        </Switch>
      </Layout>
    </BrowserRouter>
  );
}

export default App;
