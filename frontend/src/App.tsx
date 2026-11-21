import logo from './assets/skipq-logo-arrow-q-v2.png'
import './App.css'

function App() {
  return (
    <>
      <section id="center">
        <div className="hero">
          <img src={logo} className="base" width="170" height="179" alt="Skip Queue Logo" />
          {/* <img src={reactLogo} className="framework" alt="React logo" />
          <img src={viteLogo} className="vite" alt="Vite logo" /> */}
        </div>
        <div>
          <h1>Welcome to Skip Queue</h1>
          <p>
            <strong>Skip Queue</strong> is a web application that allows users to manage and skip queues in various scenarios. Whether you're waiting in line at a store, a restaurant, or any other place, Skip Queue helps you save time and avoid unnecessary waiting.
          </p>
        </div>
      </section>
    </>
  )
}

export default App
