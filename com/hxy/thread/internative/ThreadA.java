package com.hxy.thread.internative;

/**
 * 关于等待/通知，要记住的关键点是：
 * 必须从同步环境内调用wait()、notify()、notifyAll()方法。线程不能调用对象上等待或通知的方法，除非它拥有那个对象的锁。
 *
 */
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("等待b对象计算完成");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("b对象的计算综合是：" +b.total);
	}
}
