#!/usr/bin/env bash
set -ex
WORKSPACE=${WORKSPACE:-`pwd`}
artifact=$1

source ${WORKSPACE}/pipelines/scripts/functions



rm -rf j2
mkdir -p j2
set +e
tar -zcf j2/${artifact} .
