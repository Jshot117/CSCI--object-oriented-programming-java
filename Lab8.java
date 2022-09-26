import java.util.*;
import java.io.IOException;

/*
 * This application demonstrates the use of a StringTokenizer.
 * It will open a file, read a line with tokens separated by commas,
 * declare an array whose size is equal to the number of the tokens, 
 * extract each token one by one from the tokenized String and
 * store each string in an array.
 */
public class Lab8 {
   public static TextFileInput myFile;
   public static TextFileInput my2File;
   public static StringTokenizer myTokens;
   public static StringTokenizer my2Tokens;
   public static String animal;
   public static String[] animals;
   public static String[] stringArray;
   public static String line;
   public static int[][] inputArray;

   public static void main(String[] args) throws NumberFormatException, IOException {
   {
      my2File = new TextFileInput("twodimension8.txt");
      String arraySize = my2File.readLine();
      my2Tokens = new StringTokenizer(arraySize, ",");
      int row = Integer.parseInt(my2Tokens.nextToken());
      int col = Integer.parseInt(my2Tokens.nextToken());

      inputArray = new int[row][col];
      for( int i=0; i< row; i++) {
         line= my2File.readLine();
         my2Tokens = new StringTokenizer(line, ",");
         for ( int j = 0; j<col; j++){
            inputArray[i][j]= Integer.parseInt(my2Tokens.nextToken());
         }
      }
      for(int i= 0; i<inputArray.length;i++){
         for (int j=0;j<inputArray[i].length;j++){
            System.out.print(inputArray[i][j] + " ");
         }
         System.out.println();
      }
      /*
       * Open the file and read a line
       */
      myFile = new TextFileInput("animals.txt");
      line = myFile.readLine();
      System.out.println("The input line is " + line);
      /*
       * Create a new StringTokenizer, passing the String and the delimeter (",")
       */
      myTokens = new StringTokenizer(line, ",");
      System.out.println("There are " + myTokens.countTokens() + " tokens in the line.");
      /*
       * Declare an array whose size is equal to the number of tokens found using the
       * method countTokens from the StringTokenizer class
       */
      animals = new String[myTokens.countTokens()];
      /*
       * Get the separated strings one by one from the StringTokenizer and put them in
       * the array
       */
      int i = 0;
      while (myTokens.hasMoreTokens()) {
         animals[i] = myTokens.nextToken();
         i++;
      }
      /*
       * Print the array
       */
      for (int j = 0; j < animals.length; j++)
         System.out.println(animals[j]);
   } // main

  
} // Tokens
}