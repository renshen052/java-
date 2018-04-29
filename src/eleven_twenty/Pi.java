package eleven_twenty;
/**
 * 计算圆周率
 * PI=4 - 4/3 + 4/5 - 4/7......
 * @author Administrator
 *
 */
public class Pi {

	public static void main(String[] args) {
		double pi = 0; //定义初始值
		double fenZi = 4; //分子为4
		double fenMu = 1; //第一个4，可以看作分母唯一的分式，以后的分母每次递增2
		for(int i = 0; i < 1000000000; i++){
			pi += (fenZi/fenMu);
			fenZi *=-1.0;
			fenMu += 2.0;
		}
		System.out.println(pi);
	}

}
