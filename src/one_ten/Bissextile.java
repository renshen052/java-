package one_ten;



/**
 * �ж�ĳ������Ƿ�Ϊ����
 * @author Administrator
 *	������жϹ������£�
 *	1.��ĳ������ܱ�4���������ܱ�100�������������ꡣ
 *	2.��ĳ������ܱ�400��������Ҳ������
 */
import java.util.Scanner;
public class Bissextile {

	public static void main(String[] args) {
		System.out.println("��������ݣ�");
		int year; //���
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();
		if(year<0 || year>3000){
			System.out.println("������󣬳����˳���");
			System.exit(0);
		}
		if((year%4==0)&&(year%100==0) || (year%400==0)){
			System.out.println(year+" is bissextile");
		}
		else
			System.out.println(year+" is not bissextile");
	}

}
