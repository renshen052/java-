package one_ten;
/**
 * ����forѭ����ӡ9*9��
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
