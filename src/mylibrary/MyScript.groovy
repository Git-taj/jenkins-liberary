import org.apache.commons.io.FileUtils

def srcDir = new File('/var/lib/jenkins')
def destDir = new File('/opt/backup1')

try {
    FileUtils.copyDirectory(srcDir, destDir)
    println "Backup successful. Files copied from ${srcDir} to ${destDir}."
} catch (Exception e) {
    println "Error occurred during backup: ${e.message}"
}
