package org.foo
class Utilities {
  static def mvn(script) {
    script.sh "${script.tool 'Maven'}"
  }
}