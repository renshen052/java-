package one_ten;
/**
 * 求 2/1 + 3/2 + 5/3 + 8/5 + 13/8...前20项之和
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		double sum = 0;
		double fenZi = 2.0,fenMu = 1.0; //初始的分子（fenZi=2),分母(fenMu)=1
		for(int i = 1; i<=20; i++){
			sum +=fenZi/fenMu;
			fenMu = fenZi;  //下一项的分母 = 上一项的分子
			fenZi +=fenMu;  //下一项的分子 = 上一项的分子加分母
		}
		System.out.println("sum="+sum);
		
	}

}





/*
 * 对90进行因数分解
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