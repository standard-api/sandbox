start:
	docker-compose up -d

stop:
	docker-compose rm --stop --force

fixtures:
	./mvnw clean spring-boot:run -Dspring-boot.run.arguments="system-model" -Dspring-boot.run.profiles=generate-fixtures

wipe:
	docker-compose down -v --remove-orphans