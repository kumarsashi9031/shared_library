package org.foo
class Gitcheckout {
  static def git(script, args) {
    script "${script.tool 'Default'}${args}"
  }
}