package eleven_twenty;
/*
��1��2��2��3��4��5���������֣���javaдһ��main������
��ӡ�����в�ͬ�����У��磺512234��412345�ȣ�
Ҫ��"4"�����ڵ���λ��"3"��"5"����������
���С����122345���������543221��
�����Χ����������ж�
*/
public class NumGroup {

	public static void main(String[] args) {
		int count = 0;//����
		//���С����122345���������543221��
		for(int i = 122345 ; i <= 543221 ; i++){
			String temp = i+"";
			if( count('1',temp)==1 &&//���������������
				count('2',temp)==2 &&
				count('3',temp)==1 &&
				count('4',temp)==1 &&
				count('5',temp)==1   ){
				
				//"4"�����ڵ���λ
				if(temp.charAt(3) == '4')continue;
				
				//"3"��"5"��������
				if(temp.indexOf("35")!=-1 || temp.indexOf("53")!=-1)continue;
				System.out.println(temp);
				count++;
			}

		}
		System.out.println("count="+count);
	}
	
	/**
	 * ͳ��String�ַ�����ж��ٸ�key
	 * @param key
	 * @param temp
	 * @return key�ĸ���
	 */
	public static int count(char key,String temp){
		int s = 0;
		for(int i = 0; i < temp.length(); i++){
			if(key == temp.charAt(i))s++;
		}
		return s;
	}

}

