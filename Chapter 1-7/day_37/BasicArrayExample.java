import java.util.*;

public class BasicArrayExample {

    public static void main(String[] args) {
        //Arrays are objects, must construct
        int[] Player1Scores = new int [5];
        //How to add values to an array?
        Player1Scores[0] = 15;
        Player1Scores[1] = 3;
        Player1Scores[2] = 27;
        Player1Scores[3] = 18;
        Player1Scores[4] = 21;
        
        //Let's check to see if the numbers are there
        int x = 0;
        x = x + Player1Scores[0];
        System.out.println(x);
        //Can't just print an array, here is a handy method to print
        System.out.println(Arrays.toString(Player1Scores));
        
        //Arrays autoinitialize to whatever the 
        //zero value is for that data type
        int[] Player2Scores = new int [5];
        //So indices 0-4 would contain zeroes
        System.out.println(Arrays.toString(Player2Scores));
        
        //Shortcut for constructing an array and adding values!
        int[] Player3Scores = {35, 23, 45, 50, 12};
        System.out.println(Arrays.toString(Player3Scores));
        
        
       
        
   
    }

}
