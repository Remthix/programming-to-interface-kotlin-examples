package patterns

import java.io.File

interface CompressionStrategy {
    fun compress(inputFiles: List<File>, outputFile: File)
}

class ZipCompressionStrategy : CompressionStrategy {
    override fun compress(inputFiles: List<File>, outputFile: File) {
        TODO("Not yet implemented")
    }

}

class RarCompressionStrategy : CompressionStrategy {
    override fun compress(inputFiles: List<File>, outputFile: File) {
        TODO("Not yet implemented")
    }

}

class SevenZipCompressionStrategy : CompressionStrategy {
    override fun compress(inputFiles: List<File>, outputFile: File) {
        TODO("Not yet implemented")
    }

}