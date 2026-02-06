import { useEffect, useState } from "react";
import { API } from "./api";

function Maintenance() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    fetch(API.maintenance)   // ✅ use variable, not string
      .then(res => res.json())
      .then(data => setItems(data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div style={{ padding: "20px" }}>
      <h2>Maintenance Requests</h2>
      <ul>
        {items.map(item => (
          <li key={item.id} style={{ marginBottom: "8px" }}>
            <strong>{item.title}</strong> – {item.status}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Maintenance;
