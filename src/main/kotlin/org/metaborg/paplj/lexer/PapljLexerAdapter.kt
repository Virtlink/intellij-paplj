package org.metaborg.paplj.lexer

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class PapljLexerAdapter : FlexAdapter(_PapljLexer(null)) {

}