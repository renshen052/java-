package eleven_twenty;

/*
����Ļ�ϴ�ӡ��n�еĽ�����ͼ�����磬��n=5,��ͼ�����£�
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
			//��ӡ�ո�
			for(int j = 0 ; j < n-1-i ; j++){
				System.out.print(" ");
			}
			
			//��ӡ����
			for(int m = 0 ; m < 2*i+1 ; m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
