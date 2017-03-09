package org.metaborg.paplj.psi

import com.intellij.psi.tree.IElementType
import org.metaborg.paplj.psi.PapljTokenType

object PapljTokenElementTypes {

    // @formatter:off
    @JvmField val LBRACK            : IElementType = PapljTokenType("[")
    @JvmField val RBRACK            : IElementType = PapljTokenType("]")
    @JvmField val SHA               : IElementType = PapljTokenType("#")
    @JvmField val EXCL              : IElementType = PapljTokenType("!")
    @JvmField val SEMICOLON         : IElementType = PapljTokenType(";")
    @JvmField val DOT               : IElementType = PapljTokenType(".")
    @JvmField val ASTERISK          : IElementType = PapljTokenType("*")
    @JvmField val PLUS              : IElementType = PapljTokenType("+")
    @JvmField val MINUS             : IElementType = PapljTokenType("-")
    @JvmField val SLASH             : IElementType = PapljTokenType("/")
    @JvmField val BRACE_L           : IElementType = PapljTokenType("(")
    @JvmField val BRACE_R           : IElementType = PapljTokenType(")")
    @JvmField val COMMA             : IElementType = PapljTokenType(",")

    @JvmField val PUBLIC            : IElementType = PapljKeywordTokenType("public")
    @JvmField val PROGRAM           : IElementType = PapljKeywordTokenType("program")
    @JvmField val IMPORT            : IElementType = PapljKeywordTokenType("import")
    @JvmField val RUN               : IElementType = PapljKeywordTokenType("run")
    @JvmField val TRUE              : IElementType = PapljKeywordTokenType("true")
    @JvmField val FALSE             : IElementType = PapljKeywordTokenType("false")
    @JvmField val NEW               : IElementType = PapljKeywordTokenType("new")
    @JvmField val NULL              : IElementType = PapljKeywordTokenType("null")
    @JvmField val THIS              : IElementType = PapljKeywordTokenType("this")

    @JvmField val ID                : IElementType = PapljTokenType("ID")
    @JvmField val INT               : IElementType = PapljLiteralTokenType.createNumberType("<INT>")
    // @formatter:on

}