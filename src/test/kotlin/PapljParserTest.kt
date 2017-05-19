import com.intellij.testFramework.ParsingTestCase
import org.metaborg.paplj.PapljFileType
import org.metaborg.paplj.parser.PapljParserDefinition

class PapljParserTest : ParsingTestCase("", PapljFileType.EXTENSION, PapljParserDefinition()) {

    fun testParsingTestData() {
        // Parse the file ParsingTestData.pj
        // and compare the resulting PSI tree to ParsingTestData.txt
        doTest(true)
    }

    override fun getTestDataPath(): String {
        return "testData"
    }

    override fun skipSpaces(): Boolean  = true

    override fun includeRanges(): Boolean = true

}