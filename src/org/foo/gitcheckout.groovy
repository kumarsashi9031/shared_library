package org.foo

def checkOutFrom(repo) {
  git url: "git@github.com:https://github.com/javaparser/javaparser-maven-sample.git/${repo}"
}

return this