import { useEffect, useState, useContext } from 'react';

function Header() {
  const signOut = (evt) => {
    evt.preventDefault();

    console.log("This would sign you out");
  };

  return (
    <nav className="navbar navbar-expand-lg navbar-light bg-light">
      <div className="container">
        <a href="/" className="navbar-brand">Kata Starter</a>
        <button className="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon"></span>
        </button>

        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav me-auto mb-2 mb-lg-0">
            <li className="nav-item active"><a className="nav-link" href="/page1">Page 1</a></li>
            <li className="nav-item"><a className="nav-link" href="/page2">Page 2</a></li>
          </ul>

          <div className="navbar-nav">
            <li className="nav-item dropdown">
              <a className="nav-link dropdown-toggle" id="navbarDropdown" role="button"
                 data-bs-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                For Kicks
              </a>
              <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                <a className="dropdown-item" href="/user/settings">Settings</a>
                <div className="dropdown-divider"></div>
                <a className="dropdown-item" onClick={ signOut }>Logout</a>
              </div>
            </li>
          </div>
        </div>
      </div>
    </nav>
  );
}

export default Header;