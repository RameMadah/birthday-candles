package de.htwberlin;


import java.util.List;

public class CakeCandles {


   public CakeCandles(List<Integer> input){
      int candleone =0;
      int candletwo =0;
      int candlebig =0;
      int candlebigTwo = 0;
      int candlebigthree = 0;

   for(int i=0; i < input.size(); i++){
       candleone = input.get(i);
       for (int j=0; j < input.size(); j++){
          candletwo = input.get(j);



          if (candleone < candletwo && candlebig<candletwo ){
             candlebig = candletwo;
          }
          if(candlebig > candletwo && candlebigTwo<candletwo){
             candlebigTwo = candletwo;
          }
          if(candlebigTwo > candletwo && candlebigthree < candletwo){
             candlebigthree = candletwo;
          }



       }


   }
      System.out.println("******************");
      System.out.println(candlebig);
      System.out.println(candlebigTwo);
      System.out.println( candlebigthree);
      System.out.println("******************");
   }

}
