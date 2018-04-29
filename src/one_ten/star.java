package one_ten;
/**
 * 输出指定图案
 * @author Administrator
 *
 */
public class star {

	public static void main(String[] args) {
		for(int i = 0 ; i < 9 ; i++ ){
			for(int j = 0 ; j < 9 ; j++){
				if(i+j == 8 || i==j)System.out.print("X");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
