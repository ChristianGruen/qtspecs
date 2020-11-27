/* Generated By:JJTree&JavaCC: Do not edit this line. XParserConstants.java */
package org.w3c.xqparser;

public interface XParserConstants {

  int EOF = 0;
  int NumericLiteralError = 39;
  int Slash = 40;
  int SlashSlash = 41;
  int LeftAngleBracket = 42;
  int Plus = 43;
  int Minus = 44;
  int NCNameColonStar = 45;
  int IntegerLiteral = 46;
  int DecimalLiteral = 47;
  int StringLiteral = 48;
  int QNameToken = 49;
  int NCNameTok = 50;
  int Char = 51;
  int Digits = 52;
  int WhitespaceChar = 53;
  int LocalPart = 54;
  int Nmstart = 55;
  int Nmchar = 56;
  int Letter = 57;
  int BaseChar = 58;
  int Ideographic = 59;
  int CombiningChar = 60;
  int Digit = 61;
  int Extender = 62;
  int CommentStart = 63;
  int CommentEnd = 64;
  int CommentContent = 65;
  int ImplicitlyAllowedWhitespace = 66;

  int DEFAULT = 0;
  int EXPR_COMMENT = 1;

  String[] tokenImage = {
    "<EOF>",
    "\"or\"",
    "\"and\"",
    "\"=\"",
    "\"!=\"",
    "\">\"",
    "\"<=\"",
    "\">=\"",
    "\"*\"",
    "\"div\"",
    "\"mod\"",
    "\"|\"",
    "\"child\"",
    "\"::\"",
    "\"descendant\"",
    "\"attribute\"",
    "\"self\"",
    "\"descendant-or-self\"",
    "\"following-sibling\"",
    "\"following\"",
    "\"namespace\"",
    "\"@\"",
    "\"parent\"",
    "\"ancestor\"",
    "\"preceding-sibling\"",
    "\"preceding\"",
    "\"ancestor-or-self\"",
    "\"..\"",
    "\"[\"",
    "\"]\"",
    "\"$\"",
    "\"(\"",
    "\")\"",
    "\".\"",
    "\",\"",
    "\"node\"",
    "\"text\"",
    "\"comment\"",
    "\"processing-instruction\"",
    "<NumericLiteralError>",
    "\"/\"",
    "\"//\"",
    "\"<\"",
    "\"+\"",
    "\"-\"",
    "<NCNameColonStar>",
    "<IntegerLiteral>",
    "<DecimalLiteral>",
    "<StringLiteral>",
    "<QNameToken>",
    "<NCNameTok>",
    "<Char>",
    "<Digits>",
    "<WhitespaceChar>",
    "<LocalPart>",
    "<Nmstart>",
    "<Nmchar>",
    "<Letter>",
    "<BaseChar>",
    "<Ideographic>",
    "<CombiningChar>",
    "<Digit>",
    "<Extender>",
    "\"(:\"",
    "\":)\"",
    "<CommentContent>",
    "<ImplicitlyAllowedWhitespace>",
  };

}