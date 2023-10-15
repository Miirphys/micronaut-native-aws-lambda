#!/bin/sh

./mvnw package -Dpackaging=docker-native -Dmicronaut.runtime=lambda -Pgraalvm