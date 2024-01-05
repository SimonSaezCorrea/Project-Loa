import React from "react";
import './App.css';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import MainComponent from "./components/MainComponent";
import IngresoHorarioComponent from "./components/IngresoHorarioComponent";

function App() {
  return (
    <div>
        <Router>
            <Routes>
                <Route path="/" element={<MainComponent />} />
                <Route path="/ingreso-horario" element={<IngresoHorarioComponent />} />
            </Routes>
        </Router>
    </div>
  );
}

export default App;
