import React from "react";
import './App.css';
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import MainComponent from "./components/MainComponent";

function App() {
  return (
    <div>
        <Router>
            <Routes>
                <Route path="/" element={<MainComponent />} />
            </Routes>
        </Router>
    </div>
  );
}

export default App;
