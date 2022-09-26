import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab7 {

	public static int[][] myArray = {{1,2,3},{4,5,6},{7,8,9}};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        String myFile="inputfile.txt";
        int [][] filledArray=fillArray(myFile);
		printArray(myArray);
		printArrayEven(myArray);
        printArray(filledArray);
		printArrayEven(filledArray);
	}
    public static int[][] fillArray(String myFile) throws NumberFormatException, IOException{
      
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(myFile)));
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine()); 
        int [][]unfilledArray = new int [row][col];
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                unfilledArray[i][j]= Integer.parseInt(br.readLine());
            }
        }
        br.close();
        return unfilledArray;

    }
	private static void printArray (int[][] theArray) {
		for (int i=0; i<theArray.length; i++) {
			for (int j=0; j<theArray[i].length;j++)
				display(theArray[i][j]);
			System.out.println();
		}
	}
	private static void display (int num){
		System.out.print(num+" ");
	}
	private static void printArrayEven(int[][] theArray){
		for(int i=0; i<theArray.length;i++){
            for(int j=0;j<theArray[i].length;j++){
                if(theArray[i][j]%2==0){
                display(theArray[i][j]);}
                else 
                System.out.print("* ");
            }
            System.out.println();
        }
	}
}