package org.foo
     def notify(subject,body,mail) {
          emailext (
    subject: "STARTED: Job ' ${subject} ${env.JOB_NAME} [${env.BUILD_NUMBER}]'",
    body: """<p>STARTED: Job '${body} ${env.JOB_NAME} [${env.BUILD_NUMBER}]':</p>
    <p>Check console output at &QUOT;<a href='${env.BUILD_URL}'>${env.JOB_NAME} [${env.BUILD_NUMBER}]</a>&QUOT;</p>""",
    recipientProviders: [developers()] , to: "${mail}"
    )
      }
    return this