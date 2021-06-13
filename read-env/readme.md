

#### Build and deployment

```shell script
./gradlew clean build
docker build --build-arg JAR_FILE=build/libs/\*.jar -t deiveehan/kube-spring .
docker push deiveehan/kube-spring
k apply -f manifest.yml

```
