# Architecture

The React/Vite PWA calls one deployable Spring Boot application. Backend capability modules are Maven libraries; `backend/app` assembles them and owns runtime configuration and Flyway migrations. PostgreSQL stores application data.