import java.time.*
import java.time.format.DateTimeFormatter

def getVersionApp() {
        sh(script: "head env.WORKSPACE/pom.xml | grep  '<v'",returnStdout: true).trim()
}
