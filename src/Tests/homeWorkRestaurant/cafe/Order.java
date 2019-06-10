package tests.homeWorkRestaurant.cafe;

public class Order {
    public static String putSymbolSpace(String text, String SymbolBefore, String SymbolAfter) {
        return text.replaceAll(SymbolBefore, SymbolBefore + SymbolAfter);
    }


    public static void main(String[] args) {

        String text = "dsfds *sdf ds";
        System.out.println(putSymbolSpace(text, " ", "<em>"));
        for (int i = 0; i < text.length(); i++) {
            char temp =text.charAt(i);
            if (temp=='*'){
                System.out.println(putSymbolSpace(text," ","<em>"));

            }
        }

    }
}


