package org.foo
     def notify(subject,body,mail) {
          emailext (
    subject: "BUILD SUCCESSFULL: Job ' ${subject} ${env.JOB_NAME} BUILD NUMBER: [${env.BUILD_NUMBER}]'",
    body: """STARTED: Job '${body} ${env.JOB_NAME} [${env.BUILD_NUMBER}]'
     Check console output at URL='${env.BUILD_URL}' ${env.JOB_NAME} BUILD NUMBER: [${env.BUILD_NUMBER}]""",
    recipientProviders: [developers()] , to: "${mail}"
    )
      }
    return this