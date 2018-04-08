# Overview

Barebones netty websocket server that listens on port 4202

# Run
mvn clean package
java -Xms128m -Xmx256m -Dio.netty.maxDirectMemory=128000000 -agentpath:/Applications/YourKit-Java-Profiler-2017.02.app/Contents/Resources/bin/mac/libyjpagent.jnilib -jar target/netty-websocket-server-1.0-SNAPSHOT-jar-with-dependencies.jar
