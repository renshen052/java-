package one_ten;
/**
 * 1+3+5+7+......+99��ֵ
 * @author Administrator
 *
 */
public class he {

	public static void main(String[] args) {
		int number = 1;//��ֵΪ1
		int sum = 0;
		for(; number < 100 ; number+=2)
			sum += number;
		System.out.println("1+3+5+7+......+99="+sum);
	}

}
