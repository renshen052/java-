package one_ten;
/**
 * ������е�ˮ�ɻ�����ˮ�ɻ�����ָһ��3λ��������������������͵����䱾��
 * ���磺 153 = 1*1*1 + 3*3*3 + 5*5*5
 * @author Administrator
 *
 */
public class DafodiNumber {

	public static void main(String[] args) {
		System.out.println("���������е�ˮ�ɻ���");
		int number = 100; 	//100����С����λ��
		int i,j,k;			//�ֱ�Ϊnumber�İ�λ��ʮλ����λ
		for(int sum ; number < 1000; number++){
			i = number/100; 
			j = (number-i*100)/10;
			k = number-i*100-j*10;
			sum = i*i*i + j*j*j + k*k*k;
			if(sum==number)System.out.println(number+" is a dafodil number!");
		}
	}

}
