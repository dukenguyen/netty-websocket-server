# Overview

Barebones netty websocket server that listens on port 4202

# Build
```
mvn clean package
```

# Run
```
java -Xms128m -Xmx256m -Dio.netty.maxDirectMemory=128000000 -jar target/netty-websocket-server-1.0-SNAPSHOT-jar-with-dependencies.jar
```
