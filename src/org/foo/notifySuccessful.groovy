package org.foo
class notifySuccessful {
     def notify(args) {
         script.call
    def call() {
    emailext body: '''$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:

          Check console output at $BUILD_URL to view the results.''', compressLog: true, recipientProviders: [developers()], subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', to: "${args}"
    }
    }
    
}