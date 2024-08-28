package Zad1;

public class TwoWords {
    public String word1;
    public String word2;
    public TwoWords(String word1,String word2){
        this.word1 = word1;
        this.word2 = word2;
    }
    String  getFirstHalf( String word1){
        String evenSubWord1 = "";
        int length = word1.length();
        if(length % 2 == 1){
             evenSubWord1 = word1.substring(0,(word1.length()-1));
        } else {
            evenSubWord1 =word1;
        }
        return evenSubWord1.substring(0,evenSubWord1.length()/2);
    }

    String  getSecondHalf( String word2){
        String evenSubWord2 = "";
        int length = word2.length();
        if(length % 2 == 1){
            evenSubWord2 = word2.substring(1,word1.length());
        } else {
            evenSubWord2 =word2;
        }
        return evenSubWord2.substring(evenSubWord2.length()/2);
    }
    String concatTwoWords(String txt1, String txt2){
        return txt1 + txt2;
    }
}

//        System.out.println("subValue1 = "+subValue1);
//        String subValue2 = value2.substring((value2.length()/2),value2.length());
//        System.out.println("subValue2 = "+subValue2);