# Stapi.ai sandbox application
## Getting started
### Prerequisites
- [Docker-compose installed](https://docs.docker.com/compose/install/)

### Fork, clone or copy-paste this repository
If you just want to test, you can clone this repository:
```bash 
git clone https://github.com/standard-api/sandbox.git
```
If you want to use this as a starting point for your own application, you can fork it or copy-paste the files into your own repository.

### Running the application
If you have docker compose V1:
```bash
docker-compose up
```

If you have docker compose V2:
```bash
docker compose up
```
The app should start at your localhost.

### Managing application
Several containers are started:
#### stapi.ai Admin
- available at http://localhost:3000
- you can set up your application resources and the shape of your GraphQL API
- you have available GraphiQL playground where you can test your queries and mutations

#### stapi.ai GraphQL API
- available at http://localhost:8080

You can ensure it works with CURL request:

```bash
curl -X POST \
  http://localhost:8080/graphql \
  -H 'Content-Type: application/json' \
  -H 'cache-control: no-cache' \
  -d '{
    "query": "query { hello }"
}'
```
you should get:
```json
{
"data": {
  "hello": "world"
    }
}
```

#### Axon Server Dashboard
- available at http://localhost:8124
- This app uses [axon-driver](https://github.com/standard-api/axon-driver) which uses core to add declarative layer to [Axon Framework](https://github.com/AxonFramework/AxonFramework).
- Thus, you have available [Axon Server](https://developer.axoniq.io/axon-server/overview) dashboard where yoy can see all events in their raw form
- go to "Events" section and dont forget to **click search** button - you should see all events that were published by the application

