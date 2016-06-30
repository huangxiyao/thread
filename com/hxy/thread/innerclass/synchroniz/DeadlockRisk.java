package com.hxy.thread.innerclass.synchroniz;

public class DeadlockRisk {
	
	
	
	private static class Resource { 
        public int value; 
    } 

	/**
	 * 一个线程可以同时拥有不同对象的多个锁
	 */
	
    private Resource resourceA = new Resource(); 
    private Resource resourceB = new Resource(); 

    public int read() { 
        synchronized (resourceA) { 
            synchronized (resourceB) { 
                return resourceB.value + resourceA.value; 
            } 
        } 
    } 

    public void write(int a, int b) { 
        synchronized (resourceB) { 
            synchronized (resourceA) { 
                resourceA.value = a; 
                resourceB.value = b; 
            } 
        } 
    } 
}
