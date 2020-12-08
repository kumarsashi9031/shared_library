package org.foo
class Gitcheckout {
  static def git(script, args) {
    script.git "${script.tool 'Default'}  ${args}"
  }
}