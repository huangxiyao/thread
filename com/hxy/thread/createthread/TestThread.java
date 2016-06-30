package com.hxy.thread.createthread;

public class TestThread extends Thread{

	public TestThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			for(long k=0;k<100000000;k++);
			System.out.println(this.getName()+":"+i);
			
		}
	}
	
	public static void main(String[] args) {
		DoSomething ds1 =  new DoSomething("°¢Èı");
		DoSomething ds2 = new DoSomething("ÀîËÄ");
		
		Thread t1 = new Thread(ds1);
		Thread t2 = new Thread(ds2);
		
		t1.start();
		t2.start();
	}
}
