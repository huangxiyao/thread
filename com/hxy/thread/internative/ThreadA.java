package com.hxy.thread.internative;

/**
 * ���ڵȴ�/֪ͨ��Ҫ��ס�Ĺؼ����ǣ�
 * �����ͬ�������ڵ���wait()��notify()��notifyAll()�������̲߳��ܵ��ö����ϵȴ���֪ͨ�ķ�����������ӵ���Ǹ����������
 *
 */
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("�ȴ�b����������");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("b����ļ����ۺ��ǣ�" +b.total);
	}
}
