package eleven_twenty;
/*
用1、2、2、3、4、5这六个数字，用java写一个main函数，
打印出所有不同的排列，如：512234、412345等，
要求："4"不能在第三位，"3"与"5"不能相连。
组成小数：122345，最大数：543221。
这个范围内逐个遍历判断
*/
public class NumGroup {

	public static void main(String[] args) {
		int count = 0;//计数
		//组成小数：122345，最大数：543221。
		for(int i = 122345 ; i <= 543221 ; i++){
			String temp = i+"";
			if( count('1',temp)==1 &&//如果包含这六个数
				count('2',temp)==2 &&
				count('3',temp)==1 &&
				count('4',temp)==1 &&
				count('5',temp)==1   ){
				
				//"4"不能在第三位
				if(temp.charAt(3) == '4')continue;
				
				//"3"与"5"不能相连
				if(temp.indexOf("35")!=-1 || temp.indexOf("53")!=-1)continue;
				System.out.println(temp);
				count++;
			}

		}
		System.out.println("count="+count);
	}
	
	/**
	 * 统计String字符串里，有多少个key
	 * @param key
	 * @param temp
	 * @return key的个数
	 */
	public static int count(char key,String temp){
		int s = 0;
		for(int i = 0; i < temp.length(); i++){
			if(key == temp.charAt(i))s++;
		}
		return s;
	}

}

