public class TestPascal {

    static int line = 11;

    public static void main(String[] args) {
        int[][] arrayOfLines = new int[line][];
        for (int i = 0; i < arrayOfLines.length; i++) {


            arrayOfLines[0] = new int[1];

            System.out.println(arrayOfLines[0][0] = 1);

            arrayOfLines[1] = new int[2];

            arrayOfLines[1][0] = arrayOfLines[1][1] = 1;

            System.out.println(arrayOfLines[1][0] + " " + arrayOfLines[1][1]);
        }
    }
}