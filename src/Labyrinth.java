import java.util.Random;

public class Labyrinth {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] labyrinth = new char[16][16];
        fillLabyrinthWithWalls(labyrinth);
        setExitAndEnter(labyrinth);
        makeRandomHoles(random, labyrinth);
        makeHolesInEnterAndExit(labyrinth);


        printLabyrinth(labyrinth);
    }

    private static void makeHolesInEnterAndExit(char[][] labyrinth) {
        labyrinth[1][1] = ' ';
        labyrinth[1][2] = ' ';
        labyrinth[2][1] = ' ';
        labyrinth[2][2] = ' ';
        labyrinth[14][14] = ' ';
        labyrinth[14][13] = ' ';
        labyrinth[13][14] = ' ';
        labyrinth[13][13] = ' ';
    }

    private static void makeRandomHoles(Random random, char[][] labyrinth) {
        for (int i = 1; i < labyrinth.length - 1; i++) {
            for (int j = 1; j < labyrinth.length - 1; j++) {
                final boolean b = random.nextBoolean();
                if (b) {
                    labyrinth[i][j] = ' ';
                }
            }
        }
    }

    private static void setExitAndEnter(char[][] labyrinth) {
        labyrinth[1][0] = '\u2386';
        final char[] prelastRow = labyrinth[labyrinth.length - 2];
        labyrinth[labyrinth.length - 2][prelastRow.length - 1] = '\u1f6a';
    }

    private static void fillLabyrinthWithWalls(char[][] labyrinth) {
        for (int i = 0; i < labyrinth.length; i++) {

            for (int j = 0; j < labyrinth[i].length; j++) {
                labyrinth[i][j] = '*';
            }
        }
    }

    private static void printLabyrinth(char[][] labyrinth) {
        for (int i = 0; i < labyrinth.length; i++) {
            for (int j = 0; j < labyrinth[i].length; j++) {
                System.out.print(labyrinth[i][j] + " ");
            }
            System.out.println();
        }
    }
}