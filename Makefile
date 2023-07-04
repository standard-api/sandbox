startd:
	docker-compose up -d
	
start:
	docker-compose up
	
start-services:
	docker-compose up axon-server stapi-admin -d

stop:
	docker-compose rm --stop --force

fixtures:
	docker-compose up axon-server fixtures

wipe:
	docker-compose down -v --remove-orphans