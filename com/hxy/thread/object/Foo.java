package com.hxy.thread.object;

public class Foo {
	private int x = 100; 

    public int getX() { 
        return x; 
    } 

    public synchronized int fix(int y) { 
        x = x - y; 
//        try {
//			Thread.sleep(10L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
        System.out.println(x);
        return x; 
    } 
}
