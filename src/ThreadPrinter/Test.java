package ThreadPrinter;

/**
多线程

写两个线程，一个线程打印  1~52，另一个线程打印字母A-Z。打印顺序为
12A34B56C……5152Z。要求用线程间的通信。
注：分别给两个对象构造一个对象o，数字每打印两个或字母每打印一个就执行
o.wait()。
在o.wait()之前不要忘了写o.notify()。
 */
public class Test {

	public static void main(String[] args) {
		Printer p = new Printer();
		Thread t1 = new NumberPrinter(p);
		Thread t2 = new LetterPrinter(p);
		t1.start();
		t2.start();
	}

}

class Printer{
	private int index = 1; //设为1，方便计算3的倍数
	
	//打印数字 的构造方法，没打印两个数字，等待打印一个字母
	public synchronized void print(int i){
		while(index%3 == 0){
			try{
				wait();
			}catch(Exception e){}
		}
		System.out.print(""+i);
		index++;
		notifyAll();
	}
	
	
	//打印字母，每打印一个字母，等待打印两个数字
	public synchronized void print(char c){
		while(index%3 != 0){
			try{
				wait();
			}catch(Exception e){}
		}
		System.out.print(""+c);
		index++;
		notifyAll();
	}
	
}


/**
 * 打印数字的线程
 */
class NumberPrinter extends Thread{
	private Printer p;
	public NumberPrinter(Printer p){
		this.p = p;
	}
	
	public void run(){
		for(int i = 1 ; i <= 52 ; i++){
			p.print(i);
		}
	}
}

/**
 * 打印字母的线程
 */
class LetterPrinter extends Thread{
	private Printer p;
	public LetterPrinter(Printer p){
		this.p = p;
	}
	
	public void run(){
		for(char c = 'A' ; c <= 'Z' ; c++){
			p.print(c);
		}
	}
}
