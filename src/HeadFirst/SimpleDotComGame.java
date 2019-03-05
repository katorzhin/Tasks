package HeadFirst;

public class SimpleDotComGame {

       int [] locationCells;
       int numOfHits;
       public void setLocationCells(int[] locs){
           locationCells=locs;
        }
        public String checkYouself(String stringGuess){
           int guess =Integer.parseInt(stringGuess);
           String result="мимо";

           for (int cell:locationCells){
               if (guess==cell){
                   result="попал";
                   numOfHits++;
                   break;
               }
           }
           if (numOfHits==locationCells.length){
               result="птопил";
           }
            System.out.println(result);
           return result;
        }
    }

