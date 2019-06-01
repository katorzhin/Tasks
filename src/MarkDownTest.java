public class MarkDownTest {
        static void  dashCase(String text){
            StringBuffer line = new StringBuffer("абвгДеёжз");
            for (int i = 0; i <text.length() ; i++) {


            //    if (text.charAt(i)==text.toUpperCase(text.))
                    line.insert(3, "_");
                System.out.println(line);
            }
        }

    public static void main(String[] args) {
   /* String str = "I love JAVA";
    String result = str.toLowerCase();
    System.out.println("Result: "+result);
    */
   dashCase("SDFLKFF");
    }
}
