cd app
mvn clean package

cd ..
docker build -t bankpro-app ./docker
