package one_ten;

/**
 * 求 a+aa+aaa+......+aaaaaaaaa=?
 * 其中a为1-9的一个数，项数也要可以指定
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Multinomial {

	public static void main(String[] args) {
		int a ; //定义输入的a
		int howMany; //定义最后的一项有多少个数字
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个1-9的  a 值");
		a = scanner.nextInt();
		System.out.println("请问要相加多少个项？");
		howMany = scanner.nextInt();
		int sum = 0;
		int al = a;
		for(int i = 1; i <= howMany; i++){
			sum += a;
			a = 1*a +al; //这表示a下一项
			//每次a的下一项都等于前一项*10，在加上刚输入是的a，注意，这时的a已经发生了变化
		}
		System.out.println("sum="+sum);
	}

}
