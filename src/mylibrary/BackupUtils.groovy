package mylibrary

import org.apache.commons.io.FileUtils

class BackupUtils {
    static void performBackup() {
        def srcDir = new File('/opt/dir')
        def destDir = new File('/opt/backup1')

        try {
            FileUtils.copyDirectory(srcDir, destDir)
            println "Backup successful. Files copied from ${srcDir} to ${destDir}."
        } catch (Exception e) {
            println "Error occurred during backup: ${e.message}"
        }
    }
}

