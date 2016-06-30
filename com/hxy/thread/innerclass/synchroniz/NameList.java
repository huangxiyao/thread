package com.hxy.thread.innerclass.synchroniz;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class NameList {
	
	/**
	 * 通过这个例子可以了解到，除了存储的集合之外线程安全类中的方法也是同步的，否则会出现数据错误
	 */
	
	private List nameList = Collections.synchronizedList(new LinkedList()); 

	//如果一个线程在对象上获得一个锁，就没有任何其他线程可以进入（该对象的）类中的任何一个同步方法。
	
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
