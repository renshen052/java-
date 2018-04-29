package eleven_twenty;

/*
在屏幕上打印出n行的金字塔图案，如，若n=5,则图案如下：
   	   *
  	  ***
     *****
    *******
   *********
*/

import java.util.Scanner;

public class PrintStar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++){
			//打印空格
			for(int j = 0 ; j < n-1-i ; j++){
				System.out.print(" ");
			}
			
			//打印星星
			for(int m = 0 ; m < 2*i+1 ; m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
