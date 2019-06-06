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

    static String header(String text) {
        String headerWords = "<html>\n<body>\n";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(0) == '#') {
                text = text.replaceAll("[#]", "");
                return headerWords + "<h1>" + text + "</h1>";
            }
                if (text.charAt(0) == '#' && text.charAt(1) == '#') {
                    text = text.replaceAll("[#]", "");
                    return headerWords + "<h2>" + text + "</h2>";
                }

            }
            return text;
        }


    static void simpleString(String string) {
        System.out.println("<p>" + string + "</p>");
    }

    public static void main(String[] args) {
        String headerWords="<html>\n<body>";
       // System.out.println(emphasi("a*b*c     *gdsadasd* asdsadasd"));
        System.out.println(header("###dsad"));
        //System.out.println(headerWords);


    }
}