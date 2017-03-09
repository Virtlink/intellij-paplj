package org.metaborg.paplj;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

import static com.intellij.psi.TokenType.BAD_CHARACTER;
import static com.intellij.psi.TokenType.WHITE_SPACE;
import static org.metaborg.paplj.psi.PapljTypes.*;
import static org.metaborg.paplj.psi.PapljTokenElementTypes.*;

%%

%{
  public _PapljLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _PapljLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL=\R
WHITE_SPACE=\s+

ID=[:letter:][a-zA-Z_0-9]*
INT=[0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return WHITE_SPACE; }

  "["                { return LBRACK; }
  "]"                { return RBRACK; }
  "#"                { return SHA; }
  "!"                { return EXCL; }
  ";"                { return SEMICOLON; }
  "."                { return DOT; }
  "*"                { return ASTERISK; }
  "+"                { return PLUS; }
  "-"                { return MINUS; }
  "/"                { return SLASH; }
  "("                { return BRACE_L; }
  ")"                { return BRACE_R; }
  ","                { return COMMA; }
  "public"           { return PUBLIC; }
  "import"           { return IMPORT; }
  "program"          { return PROGRAM; }
  "run"              { return RUN; }
  "true"             { return TRUE; }
  "false"            { return FALSE; }
  "new"              { return NEW; }
  "null"             { return NULL; }
  "this"             { return THIS; }

  {ID}               { return ID; }
  {INT}              { return INT; }

}

[^] { return BAD_CHARACTER; }
