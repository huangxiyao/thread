package com.hxy.thread.internative;

public class ThreadB extends Thread{
	int total;
	
	public void run(){
		synchronized (this) {
			for(int i=0;i<101;i++){
				total +=i;
			}
			//������ɣ������ڴ˶���������ϵȴ��ĵ����̣߳��ڱ������߳�A������
			notify();
		}
	}
}
