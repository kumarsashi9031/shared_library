package org.foo
     def notify(subject,body,mail) {
          emailext (
    subject: "BUILD SUCCESSFULL:' ${subject} ${env.JOB_NAME} , BUILD NUMBER: [${env.BUILD_NUMBER}]'",
    body: """'${body} the job is SUCCESSFULL with JOB NAME: ${env.JOB_NAME} and BUILD NUMBER: [${env.BUILD_NUMBER}]'
     Check console output at URL='${env.BUILD_URL}' """,
    recipientProviders: [developers()] , to: "${mail}"
    )
      }
    return this