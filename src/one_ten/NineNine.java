package one_ten;
/**
 * 利用for循环打印9*9表
 * @author Administrator
 *
 */
public class NineNine {

	public static void main(String[] args) {
		System.out.println();
		for(int j = 1; j < 10 ; j++){
			for(int k = 1; k < 10 ; k++){
				if(k>j)break;
				System.out.print(" "+k+"*"+j+"="+j*k);
			}
			System.out.println();
		}
	}

}
