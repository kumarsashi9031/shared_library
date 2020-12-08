package org.foo
class Gitcheckout {
  static def git(script, args) {
    script.sh "${script.tool 'Default'}${args}"
  }
}