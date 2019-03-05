package HeadFirst;

public class DotCom {
    private int[] locationCells;
    private int numOfHits = 0;

    void setLocationCells(int[] locs) {

        locationCells = locs;
    }

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }

}

