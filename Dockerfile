from eclipse-temurin:17
copy target/Apps.jar Apps.jar
cmd ["java","-jar","Apps.jar"]