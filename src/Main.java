import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

// برنامج بسيط لتجريب الـ Lexer والـ Parser
// بياخد اسم ملف، إذا كان .java بيستخدم قواعد Java
// وإذا كان .html بيستخدم قواعد HTML/Thymeleaf
// وبيطبع التوكنات وشجرة التحليل (Parse Tree)
public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("Usage: java Main <file> [-tokens]");
            return;
        }

        String fileName = args[0];
        boolean showTokens = args.length > 1 && args[1].equals("-tokens");

        CharStream input = CharStreams.fromFileName(fileName);

        if (fileName.endsWith(".java")) {
            parseJava(input, showTokens);
        } else if (fileName.endsWith(".html")) {
            parseHtml(input, showTokens);
        } else {
            System.out.println("Unknown file type: " + fileName);
        }
    }

    static void parseJava(CharStream input, boolean showTokens) {
        JavaLexer lexer = new JavaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        if (showTokens) {
            printTokens(tokens, lexer);
        }

        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit();

        System.out.println("========== Parse Tree ==========");
        System.out.println(tree.toStringTree(parser));
        System.out.println("Syntax errors: " + parser.getNumberOfSyntaxErrors());
    }

    static void parseHtml(CharStream input, boolean showTokens) {
        HTMLLexer lexer = new HTMLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        if (showTokens) {
            printTokens(tokens, lexer);
        }

        HTMLParser parser = new HTMLParser(tokens);
        ParseTree tree = parser.document();

        System.out.println("========== Parse Tree ==========");
        System.out.println(tree.toStringTree(parser));
        System.out.println("Syntax errors: " + parser.getNumberOfSyntaxErrors());
    }

    // طباعة كل توكن مع نوعه ورقم السطر
    static void printTokens(CommonTokenStream tokens, Lexer lexer) {
        tokens.fill();
        System.out.println("========== Tokens ==========");
        for (Token t : tokens.getTokens()) {
            String type = lexer.getVocabulary().getSymbolicName(t.getType());
            String text = t.getText().replace("\n", "\\n").replace("\r", "");
            System.out.println("line " + t.getLine() + "\t" + type + "\t'" + text + "'");
        }
        tokens.seek(0);
    }
}
