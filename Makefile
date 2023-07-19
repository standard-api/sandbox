startd:
	docker-compose up -d
	
start:
	docker-compose up
	
start-services:
	docker-compose up axon-server arangodb stapi-admin -d

start-be:
	docker-compose up axon-server arangodb app

start-axon:
	docker-compose up axon-server

start-admin:
	docker-compose up stapi-admin

start-arango:
	docker-compose up arangodb

stop:
	docker-compose rm --stop --force

fixtures:
	docker-compose up axon-server arangodb fixtures

wipe:
	docker-compose down -v --remove-orphans