package com.hxy.thread.innerclass.synchroniz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
	
	/**
	 * ͨ��������ӿ����˽⵽�����˴洢�ļ���֮���̰߳�ȫ���еķ���Ҳ��ͬ���ģ������������ݴ���
	 */
	
	private List nameList = Collections.synchronizedList(new LinkedList()); 

	//���һ���߳��ڶ����ϻ��һ��������û���κ������߳̿��Խ��루�ö���ģ����е��κ�һ��ͬ��������
	
    public synchronized  void add(String name) { 
        nameList.add(name); 
    } 

    public synchronized  String removeFirst() { 
        if (nameList.size() > 0) { 
            return (String) nameList.remove(0); 
        } else { 
            return null; 
        } 
    } 
}
