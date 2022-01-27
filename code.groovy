import java.time.*
import java.time.format.DateTimeFormatter

def getVersionApp() {
        sh(script: "head pom.xml | grep  '<v' |grep -oP '(?<=\>)[a-zA-Z0-9\.-]*(?=\<)'",returnStdout: true).trim()
}
