package eleven_twenty;

/*
 *歌德巴赫猜想,任何一个大于六的偶数可以拆分成两个质数的和,
 * 打印出所有的可能
*/
import java.util.Scanner;

public class Gedebahe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		//检验数字是否合法
		if(num<=6 || num%2 != 0 )System.out.println("参数错误");
		
		//开始计算
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
