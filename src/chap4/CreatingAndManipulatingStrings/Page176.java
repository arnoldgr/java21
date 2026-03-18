package chap4.CreatingAndManipulatingStrings;

public class Page176 {
    public static void main(String[] args) {
//        working with indentation
//        method signatures
//        public String indent(int numberSpaces)
//        public String stripIndent()
          var block = """
              a
               b
              c""";
          var concat = " a\n"
                     + "  b\n"
                     + " c";
          System.out.println(block.length());                 // 6
          System.out.println(concat.length());                // 9
          System.out.println(block.indent(1).length());       // 10
          System.out.println(concat.indent(-1).length());     // 7
          System.out.println(concat.indent(-4).length());     // 6
          System.out.println(concat.stripIndent().length());  // 6

    }
}
