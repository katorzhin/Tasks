public class MarkDown {
    public static String emphasi(String line) {
        StringBuilder newLine = new StringBuilder(line);
        boolean isClosing = false;
        for (int i = 0; i < newLine.length(); i++) {
            if (newLine.charAt(i) == '*') {
                if(!isClosing){
                    newLine.replace(i,i+1,"<em>");
                    i+=3;
                    isClosing=true;
                }
                else {
                    newLine.replace(i,i+1,"</em>");
                    i+=4;
                    isClosing=false;
                }
            }
        }
        return "<p>"+ newLine.toString() + "</p>";
    }

    static void header(String word) {
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (word.charAt(i) == '#') {
                word = word.replaceAll("[#]", "");
                word = word.replaceAll("[*]", "");
                System.out.println("<html>\n" + "<body>\n" + "<h2>" + word + "</h2>");
            } else {
                word = word.replaceAll("[,]", "");

            }
        }

    }

    static void SimpleString(String string) {
        System.out.println("<p>" + string + "</p>");
    }

    public static void main(String[] args) {
        System.out.println(emphasi("a*b*c     *gdsadasd* asdsadasd"));


    }
}