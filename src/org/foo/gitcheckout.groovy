package org.foo
class Git {
  static def mvn(script, args) {
    script.sh "${script.tool 'Default'}/bin/git -s ${script.env.HOME}/ -o ${args}"
  }
}