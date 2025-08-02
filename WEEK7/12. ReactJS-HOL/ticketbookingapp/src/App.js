import Greeting from "./componets/Greeting";
import LoginButton from "./componets/LoginButton";
import LogoutButton from "./componets/LogoutButton";
import React, { useState } from 'react';
function App() {
  const [LoggedIn, setLoggedIn] = useState(false);

  return (
    <div>
      {
        LoggedIn ? (
          <>
            <Greeting isLoggedIn={LoggedIn} />
            <LogoutButton onClick={() => setLoggedIn(false)} />
          </>
        ) : (
          <>
            <Greeting isLoggedIn={LoggedIn} />
            <LoginButton onClick={() => setLoggedIn(true)} />
          </>
        )
      }
    </div>
  )
}

export default App;
