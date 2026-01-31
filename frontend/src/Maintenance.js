import { useEffect, useState } from "react";

function Maintenance() {
  const [items, setItems] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/maintenance")
      .then(res => res.json())
      .then(data => setItems(data));
  }, []);

  return (
    <div>
      <h2>Maintenance Requests</h2>
      <ul>
        {items.map(item => (
          <li key={item.id}>
            {item.title} - {item.status}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default Maintenance;
