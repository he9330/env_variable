#!/bin/bash
set -e

echo "-------------------------------------------"
echo " Starting the Gradle Application "
echo "-------------------------------------------"

# This variable will be replaced dynamically by GitHub Action using sed
export PROFILE_NAME=PROFILE

echo "Using profile: $PROFILE_NAME"
gradle run
