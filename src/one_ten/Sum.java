package one_ten;
/**
 * �� 2/1 + 3/2 + 5/3 + 8/5 + 13/8...ǰ20��֮��
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		double sum = 0;
		double fenZi = 2.0,fenMu = 1.0; //��ʼ�ķ��ӣ�fenZi=2),��ĸ(fenMu)=1
		for(int i = 1; i<=20; i++){
			sum +=fenZi/fenMu;
			fenMu = fenZi;  //��һ��ķ�ĸ = ��һ��ķ���
			fenZi +=fenMu;  //��һ��ķ��� = ��һ��ķ��Ӽӷ�ĸ
		}
		System.out.println("sum="+sum);
		
	}

}





/*
 * ��90���������ֽ�
 */
//int n = 90;
//int i;
//System.out.print(n + "=");
//while(n != 1){
//	
//	for(i = 2 ; i <= n ; i++){
//		if(n % i == 0){
//			n /= i;
//		}
//		else continue;
//		
//		if(n == 1){
//			System.out.print(i);
//			break;
//		}
//		else{
//			System.out.print(i+"*");
//		}
//	}
//	
//	
//}