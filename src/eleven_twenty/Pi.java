package eleven_twenty;
/**
 * ����Բ����
 * PI=4 - 4/3 + 4/5 - 4/7......
 * @author Administrator
 *
 */
public class Pi {

	public static void main(String[] args) {
		double pi = 0; //�����ʼֵ
		double fenZi = 4; //����Ϊ4
		double fenMu = 1; //��һ��4�����Կ�����ĸΨһ�ķ�ʽ���Ժ�ķ�ĸÿ�ε���2
		for(int i = 0; i < 1000000000; i++){
			pi += (fenZi/fenMu);
			fenZi *=-1.0;
			fenMu += 2.0;
		}
		System.out.println(pi);
	}

}
