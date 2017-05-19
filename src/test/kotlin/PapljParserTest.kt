import com.intellij.testFramework.ParsingTestCase
import org.metaborg.paplj.PapljFileType
import org.metaborg.paplj.parser.PapljParserDefinition

class PapljParserTest : ParsingTestCase("", PapljFileType.EXTENSION, PapljParserDefinition()) {

    fun testBinTreeProgram() {
        // Parse the file BinTreeProgram.pj
        // and compare the resulting PSI tree to BinTreeProgram.txt
        doTest(true)
    }

    override fun getTestDataPath(): String {
        return "testData"
    }

    override fun skipSpaces(): Boolean  = true

    override fun includeRanges(): Boolean = true

}