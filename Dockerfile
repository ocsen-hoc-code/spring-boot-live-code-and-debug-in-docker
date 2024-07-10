FROM eclipse-temurin:22-alpine
WORKDIR /app
COPY . /app
RUN ./mvnw dependency:go-offline -B
EXPOSE 8082 5005
ENTRYPOINT ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=dev", "-Dspring-boot.run.jvmArguments=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"]