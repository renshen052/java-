package one_ten;

/**
 * ����һ���ٷ��Ƶķ����������Ӧ�ĵȼ�
 * @author Administrator
 *
 */
import java.util.*;
public class Mark {

	public static void main(String[] args) {
		System.out.println("������һ������");
		double mark;
		Scanner scanner = new Scanner(System.in);
		mark = scanner.nextDouble();
		
		//�ж��Ƿ����������
		if(mark<0 || mark>100){
			System.out.println("��������");
			System.exit(0);
		}
		
		/*�жϷ����ĵȼ�
		 * 90����,A;    80-89��B;
		 * 70-79,c;    60-69,D;
		 * 60���£�E;
		 */
		int temp = (int)mark/10;
		switch (temp) {
		case 9:
			System.out.println("this mark is grade \'A\'");
			break;
		case 8:
			System.out.println("this mark is grade \'B\'");
			break;
		case 7:
			System.out.println("this mark is grade \'C\'");
			break;
		case 6:
			System.out.println("this mark is grade \'D\'");
			break;
		default:
			System.out.println("this mark is grade \'E\'");
			break;
		}
		
	}

}
