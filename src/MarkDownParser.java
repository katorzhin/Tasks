public class MarkDownParser {

    static void Emphasi(String string) {
        string = string.substring(1, string.length() - 1);
        System.out.println("<em>" + string + "</em>");
    }

    static void SimpleString(String simpleString) {
        System.out.println("<p>" + simpleString + "</p>");
    }

    public static void main(String[] args) {

        Emphasi("*gdfgdf*");
        SimpleString("skdfjs");
    }
}

