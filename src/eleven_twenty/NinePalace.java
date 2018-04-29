package eleven_twenty;



/*
完成九宫格程序
	在井字形的格局中(只能是奇数格局)，放入数字(数字由)，使每行每列以及斜角线的和都相等
	
	经验规则：从 1 开始按顺序逐个填写； 1  放在第一行的中间位置；下一个数往右上
	角45度处填写；
	如果单边越界则按头尾相接地填；如果有填写冲突，则填到刚才位置的底下一格；
	如果有两边越界，则填到刚才位置的底下一格。
	
*/

import java.util.Scanner;

public class NinePalace {

	public static void main(String[] args) {
		//定义 N 为九宫格的行列数，需要输入
		System.out.println("请输入九宫格的行列规模(只能是奇数的)");
		Scanner n = new Scanner(System.in);
		int N;
		// 判断格局是否奇数 （可判断出偶数、负数 及小数）
		double d;
		while (true) {
			d = n.nextDouble();
			N = (int) d;
			if ((d - N) > 1.0E-4 || N % 2 == 0 || N < 0) {
				System.out.println("输入出错,格局只能是正奇数。请重新输入");
			} else
				break;
		}
		// 九宫格填写
		int[][] result = new int[N][N]; // 定义保存九宫格的数组
		int row = 0; // 行 初始位置
		int col = N / 2; // 列 初始位置,因为列由0开始，故N/2是中间位置
		for(int i = 1 ; i <= N*N ; i++){
			result[row][col] = i;
			row--;
			col++;
			if(row < 0 && col >= N){
				row += 2;
				col--;
			}//行和列都超出，放到位置正下方
			else if(row < 0){
				row = N-1;
			}//行超出
			else if(col >= N){
				col = 0;
			}//列超出
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
//		// 定义 N 为九宫格的行列数，需要输入
//		System.out.println("请输入九宫格的行列规模(只能是奇数的)");
//		Scanner n = new Scanner(System.in);
//		int N;
//		// 判断格局是否奇数 （可判断出偶数、负数 及小数）
//		double d;
//		while (true) {
//			d = n.nextDouble();
//			N = (int) d;
//			if ((d - N) > 1.0E-4 || N % 2 == 0 || N < 0) {
//				System.out.println("输入出错,格局只能是正奇数。请重新输入");
//			} else
//				break;
//		}
//		// 九宫格填写
//		int[][] result = new int[N][N]; // 定义保存九宫格的数组
//		int row = 0; // 行 初始位置
//		int col = N / 2; // 列 初始位置,因为列由0开始，故N/2是中间位置
//		for (int i = 1; i <= N * N; i++) {
//			result[row][col] = i;
//			row--;
//			col++;
//			if (row < 0 && col >= N) {
//				col--;
//				row += 2;
//			} // 行列都越界
//			else if (row < 0) {
//				row = N - 1;
//			} // 行越界
//			else if (col >= N) {
//				col = 0;
//			} // 列越界
//			else if (result[row][col] != 0) {
//				col--;
//				row += 2;
//			} // 有冲突
//		}
//		// 打印出九宫格
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N; j++) {
//				System.out.print(result[i][j] + "\t");
//			}
//			System.out.println();
//		}
//	}
//
//}
