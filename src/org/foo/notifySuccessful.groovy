package org.foo
     def notify(body,subject,mail) {
           emailext body: '"${body}" $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:

           Check console output at $BUILD_URL to view the results.''', compressLog: true, recipientProviders: [developers()], subject: '"${subject}"  $PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: "${mail}"
      }
    return this