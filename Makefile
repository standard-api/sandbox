start:
	docker-compose up -d
	
start-services:
	docker-compose up axon-server stapi-admin -d

stop:
	docker-compose rm --stop --force

fixtures:
	./mvnw clean spring-boot:run -Dspring-boot.run.arguments=system-model -Dspring-boot.run.jvmArguments="-Dserver.port=8082" -Dspring-boot.run.profiles=generate-fixtures

wipe:
	docker-compose down -v --remove-orphans