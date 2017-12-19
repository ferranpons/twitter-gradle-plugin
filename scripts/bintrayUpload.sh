#!/bin/bash

./gradlew bintrayUpload -PbintrayUser="${PERSONAL_BINTRAY_USER}" -PbintrayKey="${PERSONAL_BINTRAY_KEY}" -PdryRun=false