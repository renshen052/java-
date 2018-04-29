package one_ten;

/**
 * 给定一个百分制的分数，输出相应的等级
 * @author Administrator
 *
 */
import java.util.*;
public class Mark {

	public static void main(String[] args) {
		System.out.println("请输入一个分数");
		double mark;
		Scanner scanner = new Scanner(System.in);
		mark = scanner.nextDouble();
		
		//判断是否有输入错误
		if(mark<0 || mark>100){
			System.out.println("输入有误！");
			System.exit(0);
		}
		
		/*判断分数的等级
		 * 90以上,A;    80-89，B;
		 * 70-79,c;    60-69,D;
		 * 60以下，E;
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
