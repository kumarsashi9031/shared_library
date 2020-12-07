package org.foo

def checkOutFrom(repo) {
  git url: "https://github.com/javaparser/javaparser-maven-sample.git/${repo}"
}

return this