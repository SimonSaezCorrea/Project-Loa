import './App.css';
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
