package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		// Thread 클래스로부터 직접 스레드를 생성
		//how1
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		// 익명 구현 객체를 이용함.
		//how2
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					try { Thread.sleep(500); } catch(Exception e) {}
				}
			}
		});*/
		
		//how3
		/*Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();	
			for(int i=0; i<5; i++) {		
				toolkit.beep();
				try { Thread.sleep(500); } catch(Exception e) {}
			}
		});*/
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


