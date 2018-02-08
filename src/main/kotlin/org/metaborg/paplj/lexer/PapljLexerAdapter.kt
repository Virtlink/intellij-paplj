package org.metaborg.paplj.lexer

import com.intellij.lexer.FlexAdapter
import org.metaborg.paplj._PapljLexer

class PapljLexerAdapter : FlexAdapter(_PapljLexer(null)) {

}