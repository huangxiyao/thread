package com.hxy.thread.createthread;

import com.hxy.thread.object.Foo;

public class MyRunnable implements Runnable{

	private Foo foo =  new Foo();
	
	public static void main(String[] args) {
		MyRunnable r =  new MyRunnable();
		Thread t1 = new Thread(r,"Thread-A");
		Thread t2 = new Thread(r,"Thread-B");
		
		t1.start();
		t2.start();
	}
	
	
	@Override
	public void run() {
		for(int i=0;i<4;i++){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int j = this.foo.fix(30);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(Thread.currentThread().getName()+": 当前foo对象的值="+j);
		}
		
		
	}

}
