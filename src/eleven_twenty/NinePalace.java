package eleven_twenty;



/*
��ɾŹ������
	�ھ����εĸ����(ֻ�����������)����������(������)��ʹÿ��ÿ���Լ�б���ߵĺͶ����
	
	������򣺴� 1 ��ʼ��˳�������д�� 1  ���ڵ�һ�е��м�λ�ã���һ����������
	��45�ȴ���д��
	�������Խ����ͷβ��ӵ���������д��ͻ������ղ�λ�õĵ���һ��
	���������Խ�磬����ղ�λ�õĵ���һ��
	
*/

import java.util.Scanner;

public class NinePalace {

	public static void main(String[] args) {
		//���� N Ϊ�Ź��������������Ҫ����
		System.out.println("������Ź�������й�ģ(ֻ����������)");
		Scanner n = new Scanner(System.in);
		int N;
		// �жϸ���Ƿ����� �����жϳ�ż�������� ��С����
		double d;
		while (true) {
			d = n.nextDouble();
			N = (int) d;
			if ((d - N) > 1.0E-4 || N % 2 == 0 || N < 0) {
				System.out.println("�������,���ֻ����������������������");
			} else
				break;
		}
		// �Ź�����д
		int[][] result = new int[N][N]; // ���屣��Ź��������
		int row = 0; // �� ��ʼλ��
		int col = N / 2; // �� ��ʼλ��,��Ϊ����0��ʼ����N/2���м�λ��
		for(int i = 1 ; i <= N*N ; i++){
			result[row][col] = i;
			row--;
			col++;
			if(row < 0 && col >= N){
				row += 2;
				col--;
			}//�к��ж��������ŵ�λ�����·�
			else if(row < 0){
				row = N-1;
			}//�г���
			else if(col >= N){
				col = 0;
			}//�г���
			else if(result[row][col] != 0){
				row += 2;
				col--;
			}
		}
		
		for(int i = 0 ; i < N; i++){
			for(int j = 0 ; j < N ; j++){
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}

}




//import java.util.Scanner;
//
//public class NinePalace {
//
//	public static void main(String[] args) {
//		// ���� N Ϊ�Ź��������������Ҫ����
//		System.out.println("������Ź�������й�ģ(ֻ����������)");
//		Scanner n = new Scanner(System.in);
//		int N;
//		// �жϸ���Ƿ����� �����жϳ�ż�������� ��С����
//		double d;
//		while (true) {
//			d = n.nextDouble();
//			N = (int) d;
//			if ((d - N) > 1.0E-4 || N % 2 == 0 || N < 0) {
//				System.out.println("�������,���ֻ����������������������");
//			} else
//				break;
//		}
//		// �Ź�����д
//		int[][] result = new int[N][N]; // ���屣��Ź��������
//		int row = 0; // �� ��ʼλ��
//		int col = N / 2; // �� ��ʼλ��,��Ϊ����0��ʼ����N/2���м�λ��
//		for (int i = 1; i <= N * N; i++) {
//			result[row][col] = i;
//			row--;
//			col++;
//			if (row < 0 && col >= N) {
//				col--;
//				row += 2;
//			} // ���ж�Խ��
//			else if (row < 0) {
//				row = N - 1;
//			} // ��Խ��
//			else if (col >= N) {
//				col = 0;
//			} // ��Խ��
//			else if (result[row][col] != 0) {
//				col--;
//				row += 2;
//			} // �г�ͻ
//		}
//		// ��ӡ���Ź���
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(result[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	}
//
//}
