start:
	docker-compose up -d

stop:
	docker-compose rm --stop --force

fixtures:
	./mvnw clean spring-boot:run -Dspring-boot.run.arguments="core genio demo" -Dspring-boot.run.profiles=generate-fixtures

wipe:
	docker-compose down -v --remove-orphans