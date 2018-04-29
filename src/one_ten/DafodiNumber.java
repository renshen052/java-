package one_ten;
/**
 * 输出所有的水仙花数，水仙花数是指一个3位数，其余各个数字立方和等于其本身
 * 例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
 * @author Administrator
 *
 */
public class DafodiNumber {

	public static void main(String[] args) {
		System.out.println("以下是所有的水仙花数");
		int number = 100; 	//100是最小的三位数
		int i,j,k;			//分别为number的百位、十位、个位
		for(int sum ; number < 1000; number++){
			i = number/100; 
			j = (number-i*100)/10;
			k = number-i*100-j*10;
			sum = i*i*i + j*j*j + k*k*k;
			if(sum==number)System.out.println(number+" is a dafodil number!");
		}
	}

}
