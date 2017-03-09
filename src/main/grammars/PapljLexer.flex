package org.metaborg.paplj.lexer;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
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

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

ID=[:letter:][a-zA-Z_0-9]*
INT=[0-9]+

%%
<YYINITIAL> {
  {WHITE_SPACE}      { return com.intellij.psi.TokenType.WHITE_SPACE; }

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

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
