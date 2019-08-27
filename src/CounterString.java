public class CounterString {
    public static void main(String[] args) {
        String a = "MashaAndSasha";
        char b = 0;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) > b) {
                b = a.charAt(i);
            }
        System.out.println(b);
    }
}
