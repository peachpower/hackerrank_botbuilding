/*
	Problem
	
	The first line contains an odd integer N (3 <= N < 100) denoting the size of the grid. 
	This is followed by an NxN grid. Each cell is denoted by '-' (ascii value: 45). 
	The bot position is denoted by 'm' and the princess position is denoted by 'p'.
	
	Print out the moves you will take to rescue the princess in one go. 
	The moves must be separated by '\n', a newline. 
	The valid moves are LEFT or RIGHT or UP or DOWN.
	
*/
	
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static void displayPathtoPrincess(int n, String [] grid){
    int princessPeachX = -1;
    int princessPeachY = -1;
    int movex = -1, movey = -1;
    for(int i = 0; i < n; i++) {          
				// Find out where the princess is
                if (grid[i].indexOf('p') > -1) {
                    princessPeachX = grid[i].indexOf('p');
                    princessPeachY = i;
                }
				// Find out where the robot is
                if(grid[i].indexOf('m')>-1){
                    movex = grid[i].indexOf('m');
                    movey = i;
                    
                }
        }
		// Loop until the robot and the princess are in the same position
        while(movex !=princessPeachX && movey !=princessPeachY){
                if(movex > princessPeachX){
                    movex--;
                    System.out.println("LEFT");
                }
                else if(movex < princessPeachX){
                    movex++;
                    System.out.println("RIGHT");
                }
                if(movey > princessPeachY){
                    movey--;
                    System.out.println("UP");
                }
                else if(movey < princessPeachY){
                    movey++;
                    System.out.println("DOWN");
                }
            
        }
  }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m;
        m = in.nextInt();
        String grid[] = new String[m];
        
        for(int i = 0; i < m; i++) {
            grid[i] = in.next();
        }
    displayPathtoPrincess(m,grid);
    }
}



