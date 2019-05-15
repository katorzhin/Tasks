public class MarkDownParser {

    public static void main(String[] args) {
        String newWord= "*dsad* sdf sd f ds";
        //newWord = newWord.trim(); // This would remove trailing and leading spaces
        String [] words = newWord.split("\\s+"); //split them on spaces
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<words.length;i++){
            if (newWord.charAt(i)=='*') {
                newWord = newWord.replaceAll("[*]", "");
            }
                sb.append("<em>");
                sb.append(words[i]);
                sb.append(' ');

        }
      //  if(words.length>0){
        //    sb.append('$');
          //  sb.append(words[words.length-1]);
        //}
        newWord = sb.toString();
        System.out.println(newWord);
    }
}

