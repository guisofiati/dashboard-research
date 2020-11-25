import React from 'react';
import {
  BrowserRouter as Router,
  Switch,
  Route,
  BrowserRouter
} from 'react-router-dom';
import Header from './components/Header';
import Charts from './pages/Charts';
import Home from './pages/Home';
import Records from './pages/Records';

const Routes = () => {
  return (
    <BrowserRouter>
      <Header />
      <Switch>
      <Route path="/charts">
          <Charts />
        </Route>
        <Route path="/records">
          <Records />
        </Route>
        <Route path="/">
          <Home />
        </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default Routes;