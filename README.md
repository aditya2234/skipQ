# skipQ

Starter scaffold for a QR code ordering platform: React/Vite PWA frontend and a Maven multi-module Spring Boot backend.

Requirements: Java 21, Maven 3.9+, Node.js 20+, Docker Compose.

- Full backend and all microservices: `docker compose up --build`
- Backend modules locally: `cd backend && ./run-all.ps1`
- Frontend: `cd frontend && npm install && npm run dev`

The backend exposes `/api/health` for the overall deployment check. Each module also exposes `/api/{service}` and `/api/{service}/health` for deployment testing (for example, `/api/auth/health` and `/api/order/health`).