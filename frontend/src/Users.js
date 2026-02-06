import { useEffect, useState } from "react";
import { API } from "./api";

function Users() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    fetch(API.users)
      .then(res => res.json())
      .then(data => setUsers(data))
      .catch(err => console.error(err));
  }, []);

  return (
  <div style={{ padding: "20px" }}>
    <h2>Users</h2>
    <ul>
      {users.map(user => (
        <li key={user.id} style={{ marginBottom: "8px" }}>
          <strong>{user.name}</strong> – {user.role}<br />
          <small>{user.email}</small>
        </li>
      ))}
    </ul>
  </div>
);
}

export default Users;

