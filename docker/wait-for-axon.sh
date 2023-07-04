#!/bin/sh

while ! nc -z axon-server 8124; do   
  echo "Waiting for Axon Server"
  sleep 2
done

echo "Axon Server is ready, starting the application..."