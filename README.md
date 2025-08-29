# 🎬 Movie-Stream-Microservices-App

A cloud-native, microservices-based movie catalog and streaming platform built using Spring Boot and Spring Cloud. This project demonstrates scalable service architecture, centralized configuration, gateway routing, service discovery, inter-service communication, distributed tracing with Zipkin, and includes a rich HTML client for end-to-end validation.

---

## 🚀 Features

- **Microservices Architecture:**  
  Independent services for Movie Catalog, Streaming, API Gateway, Service Registry (Eureka), and Config Server.
- **Movie Catalog Service:**  
  Stores and retrieves movie metadata and file paths using Spring Data JPA.
- **Streaming Service:**  
  Streams video files from disk, resolving file paths via inter-service REST calls.
- **API Gateway:**  
  Exposes and secures endpoints with global CORS configuration.
- **Service Registry & Discovery:**  
  Eureka-based dynamic registration and discovery of services.
- **Centralized Configuration:**  
  Spring Cloud Config Server for unified microservice configuration.
- **Distributed Tracing:**  
  Seamless integration with Zipkin for tracing requests and diagnosing latency across microservices.
- **HTML5 Web Client:**  
  Demonstrates movie browsing, streaming, and dynamic thumbnail generation.

---

## 🏗️ Architecture

- **Service Registry:** Eureka server for service discovery.
- **Config Server:** Centralized configuration management.
- **API Gateway:** Routing and CORS for all microservices.
- **Movie Catalog Service:** Manages movie metadata (name, description, file path).
- **Streaming Service:** Serves video files using endpoints:
  - `/stream/{videoPath}` — stream by direct path
  - `/stream/with-id/{videoId}` — resolve path via catalog, then stream
- **Web Client (`webapp.html`):**  
  Fetches movie list, renders video cards, plays streams, and generates thumbnails.

---

## 📦 Module Structure

- `api-gateway/` — Gateway for routing and security
- `service-registry/` — Eureka service registry
- `config-server/` — Centralized config server
- `movie-catalog-service/` — Movie metadata CRUD and path resolution
- `movie-streaming-service/` — Streams video files to clients
- `webapp.html` — HTML5 demo client

---

## 🌐 Example API Endpoints

- `POST /movie-info/save` — Save movie metadata
- `GET /movie-info/list` — List all movies
- `GET /movie-info/find-path-by-id/{id}` — Get video file path by ID
- `GET /stream/{videoPath}` — Stream video by path
- `GET /stream/with-id/{videoId}` — Stream video by ID (resolved via catalog)

---

## 🏁 Getting Started

1. **Clone the repository:**
   ```sh
   git clone https://github.com/Kamesh-Mishra/Movie-Stream-Microservices-App.git
   ```
2. **Start services in order:**
   - Service Registry (Eureka)
   - Config Server
   - API Gateway
   - Zipkin (for distributed tracing)
   - Movie Catalog Service
   - Movie Streaming Service

3. **Open `webapp.html` in your browser to explore the demo client.**

> **Note:**  
> Configure the streaming service's `VIDEO_DIRECTORY` to match your local video file storage. Update service properties as needed.

---

## 📝 Example Usage

- **Add movies:**  
  Use POST `/movie-info/save` to add new movies (name, description, path).
- **Browse movies:**  
  The web client lists all movies and generates a thumbnail for each.
- **Stream movies:**  
  Play movies directly in the browser via `/stream/with-id/{id}`.

---

> Engineered with ❤️ by [Kamesh Mishra](https://github.com/Kamesh-Mishra)
