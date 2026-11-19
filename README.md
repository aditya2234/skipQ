# QR Order

Starter scaffold for a QR code ordering platform: React/Vite PWA frontend and a Maven multi-module Spring Boot backend.

Requirements: Java 21, Maven 3.9+, Node.js 20+, Docker Compose.

- Database: `docker compose up -d postgres`
- Backend: `cd backend && mvn spring-boot:run -pl app -am`
- Frontend: `cd frontend && npm install && npm run dev`

The backend starter exposes `/api/health`.