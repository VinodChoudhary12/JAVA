import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

 DevanagariConversion {
    public static void main(String[] args) {
        int[] unicodeCodePoints = {2342, 2367, 2357, 2381, 2351, 2366, 2306, 2358,'\n',2357,2367,2344,2379,2342,'\n',2344,2367,2361,2366,2352};
        
        try {
            // Set the encoding of the console to UTF-8
            System.setOut(new PrintStream(System.out, true, "UTF-8"));

            StringBuilder devanagariString = new StringBuilder();
            for (int codePoint : unicodeCodePoints) {
                devanagariString.append(Character.toChars(codePoint));
            }

            System.out.println( devanagariString.toString());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
