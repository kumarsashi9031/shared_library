package org.foo

def checkOutFrom(repo) {
  git url: "git@github.com:https:javaparser/javaparser-maven-sample/${repo}"
}

return this