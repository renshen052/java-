package eleven_twenty;

/*
 *��°ͺղ���,�κ�һ����������ż�����Բ�ֳ����������ĺ�,
 * ��ӡ�����еĿ���
*/
import java.util.Scanner;

public class Gedebahe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		//���������Ƿ�Ϸ�
		if(num<=6 || num%2 != 0 )System.out.println("��������");
		
		//��ʼ����
		for(int i = 3 ; i <= num/2 ; i++){
			int temp = num-i;
			if(isPrime(i) && isPrime(temp)){
				System.out.println(i+","+ temp);
			}
		}
	}
	
	public static boolean isPrime(int num){
		for(int i = 2 ; i < num ; i++){
			if(num%i == 0)return false;
		}
		return true;
	}

}
