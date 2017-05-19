import com.intellij.testFramework.ParsingTestCase
import org.metaborg.paplj.PapljFileType
import org.metaborg.paplj.parser.PapljParserDefinition

class PapljParserTest : PapljParserTestBase() {

    fun testBinTreeProgram() {
        // Parse the file BinTreeProgram.pj
        // and compare the resulting PSI tree to BinTreeProgram.txt
        doTest(true)
    }

}