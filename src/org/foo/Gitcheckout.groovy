package org.foo
class Gitcheckout {
  static def git(script, args) {
    script.sh "${script.tool 'Default'}/bin/git -s ${script.env.HOME}/ -o ${args}"
  }
}