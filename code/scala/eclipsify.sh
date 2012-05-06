#!/bin/bash

echo Creating Eclipse .project and .classpath files ...
`dirname $0`/sbt.sh "$@" eclipse
