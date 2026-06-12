cd app
mvn clean package -DskipTests

cd ..
docker build -t bankpro-app docker/
