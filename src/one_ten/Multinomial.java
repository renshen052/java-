package one_ten;

/**
 * �� a+aa+aaa+......+aaaaaaaaa=?
 * ����aΪ1-9��һ����������ҲҪ����ָ��
 * @author Administrator
 *
 */
import java.util.Scanner;
public class Multinomial {

	public static void main(String[] args) {
		int a ; //���������a
		int howMany; //��������һ���ж��ٸ�����
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ��1-9��  a ֵ");
		a = scanner.nextInt();
		System.out.println("����Ҫ��Ӷ��ٸ��");
		howMany = scanner.nextInt();
		int sum = 0;
		int al = a;
		for(int i = 1; i <= howMany; i++){
			sum += a;
			a = 1*a +al; //���ʾa��һ��
			//ÿ��a����һ�����ǰһ��*10���ڼ��ϸ������ǵ�a��ע�⣬��ʱ��a�Ѿ������˱仯
		}
		System.out.println("sum="+sum);
	}

}
