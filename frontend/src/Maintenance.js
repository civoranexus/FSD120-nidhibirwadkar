import { useEffect, useState } from "react";

function Maintenance() {
  const [items, setItems] = useState([]);

  useEffect(() => {
  console.log("Fetching maintenance data...");

  fetch("http://localhost:8080/maintenance")
    .then(res => {
      console.log("Response status:", res.status);
      return res.json();
    })
    .then(data => {
      console.log("Data received:", data);
      setItems(data);
    })
    .catch(err => {
      console.error("Fetch error:", err);
    });
}, []);
}
