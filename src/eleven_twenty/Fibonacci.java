package eleven_twenty;

/**
 * ����һ������n������쳲��������еĵ�n��ֵ
 * 1 1 2 3 5 8 13 21 34
 * ���ɣ�һ��������ǰ������֮��
 * @author Administrator
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		int n1 = 1;// ��һ����
		int n2 = 1; //�ڶ�����
		int sum = 0;//��
		if(n <= 0){
			System.out.println("��������");
			return;
		}
		
		if(n <= 2){
			sum = 1;
		}else{
			for(int i = 3 ; i <= n; i++){
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
		}
		
		System.out.println(sum);
	}

}
