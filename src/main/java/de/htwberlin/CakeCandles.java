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




   public String CakeCounter(List<Integer> input){
      int comparer =0;
      int count =0;
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
      for (int i=0;i<input.size();i++){
         comparer = input.get(i);
         if(candlebig == comparer){
            count++;
         }
      }
      System.out.println("******************");
      System.out.println(candlebig);
      System.out.println(candlebigTwo);
      System.out.println( candlebigthree);
      System.out.println( count);
      System.out.println("number of longest candles are "+ count +" and they are "+candlebig+ "cm long");
      return "number of longest candles are "+ count +" and they are "+candlebig+ "cm long";
   }

   public String CakeCalculater(List<Integer> input){

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

      return "longest candle "+ candlebig +" cm second longest candle "+ candlebigTwo +" cm third longest candle is "
              + candlebigthree +" cm";
   }

}
