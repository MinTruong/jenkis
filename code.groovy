import java.time.*
import java.time.format.DateTimeFormatter

def getVersionApp() {
        sh(script: "head pom.xml | grep  '<v'",returnStdout: true).trim()
}
return this
