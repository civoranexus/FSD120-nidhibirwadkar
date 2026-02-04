import { BrowserRouter, Routes, Route, Link } from "react-router-dom";
import Login from "./Login";
import Users from "./Users";
import Maintenance from "./Maintenance";

function App() {
  return (
    <BrowserRouter>
      <nav style={{ padding: "10px", borderBottom: "1px solid #ccc" }}>
        <Link to="/" style={{ marginRight: "10px" }}>Login</Link>
        <Link to="/users" style={{ marginRight: "10px" }}>Users</Link>
        <Link to="/maintenance">Maintenance</Link>
      </nav>

      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/users" element={<Users />} />
        <Route path="/maintenance" element={<Maintenance />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;

