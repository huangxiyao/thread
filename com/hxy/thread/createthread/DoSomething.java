package com.hxy.thread.createthread;

public class DoSomething implements Runnable{
	
	private String name;
	
	public DoSomething(String name){
		this.name=name;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			for(long k=0;k<100000000;k++);
			System.out.println(name+":"+i);
			
		}
		
		
	}

}
