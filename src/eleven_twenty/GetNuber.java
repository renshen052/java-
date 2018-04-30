package eleven_twenty;
/*
题目：取一个整数a从右端开始的4～7位。     
程序分析：可以这样考虑：     
1)先使a右移4位。     
(2)设置一个低4位全为1,其余全为0的数。可用~(~0 < <4)     
(3)将上面二者进行&运算。
*/
public class GetNuber {

	public static void main(String[] args) {
		int a = 0;
		long b = 18745678;
		a = (int)Math.floor(b%Math.pow(10, 7)/Math.pow(10, 3));
		System.out.println(a);
	}

}
