package org.foo

def checkOutFrom(repo) {
  git url: "git@github.com:javaparser/javaparser-maven-sample/${repo}"
}

return this