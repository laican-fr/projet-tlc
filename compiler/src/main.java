import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.antlr.*;

public class Main{

    public static void main(String[] args) {
        try {
            ANTLRReaderStream input = new ANTLRReaderStream(new FileReader("compiler/src/testWhile.while"));
            whileLexer lexer = new whileLexer(input); 
            CommonTokenStream tokens = new CommonTokenStream(lexer); 
            whileParser parser = new whileParser(tokens);
            CommonTree tree = (CommonTree)parser.program().getTree(); 

            System.out.println("Parse Tree: " + tree.toStringTree());

        } catch (IOException e) { 
                e.printStackTrace(); 
        } catch (RecognitionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}