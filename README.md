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
- you have available GraphiQL playground where you can test your queries and mutations.

#### stapi.ai GraphQL API
- available at http://localhost:8080

You can ensure it works with CURL request:

```bash
curl -X POST -H "Content-Type: application/json" -d '{"query":"query {\n findStructureDefinitionList(\n    sort: [{type: ASC}]\n    filter: [{type_CONTAINS: \"a\"}]\n    pagination: {limit: 6, offset: 0}\n  ) {\n    type\n    description\n  }\n}"}' http://localhost:8080/graphql
```
you should get something like:
```json
{"data":{"findStructureDefinitionList":[{"type":"AggregateDefinition","description":null},{"type":"BackboneElement","description":"Base StructureDefinition for BackboneElement Type: Base definition for all elements that are defined inside a resource - but not those in a data type."},{"type":"base64Binary","description":"Base StructureDefinition for base64Binary Type: A stream of bytes"},{"type":"boolean","description":"Base StructureDefinition for boolean Type: Value of \"true\" or \"false\""},{"type":"canonical","description":"Base StructureDefinition for canonical type: A URI that is a reference to a canonical URL on a FHIR resource"},{"type":"CodeableConcept","description":"Base StructureDefinition for CodeableConcept Type: A concept that may be defined by a formal reference to a terminology or ontology or may be provided by text."}]}}
```

#### Axon Server Dashboard
- available at http://localhost:8024
- This app uses [axon-driver](https://github.com/standard-api/axon-driver) which uses core to add declarative layer to [Axon Framework](https://github.com/AxonFramework/AxonFramework).
- Thus, you have available [Axon Server](https://developer.axoniq.io/axon-server/overview) dashboard where you can see all events in their raw form
- go to "Events" section and dont forget to **click search** button - you should see all events that were published by the application in their raw form

