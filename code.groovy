import java.time.*
import java.time.format.DateTimeFormatter

def getVersionApp() {
        sh(script: "head ${env.WORKSPACE}/pom.xml | grep  '<v' | grep -oP '(?<=\\>)[a-zA-Z0-9\\.-]*(?=\\<)' | cut -d '-' -f1",returnStdout: true).trim()
}
return this
