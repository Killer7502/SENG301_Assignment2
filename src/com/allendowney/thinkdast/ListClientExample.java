
package com.allendowney.thinkdast;

import java.util.LinkedList;

import java.util.List;

public class ListClientExample {
	@SuppressWarnings("rawtypes")
	private List list;

	@SuppressWarnings("rawtypes")
	public ListClientExample() {
		list = new LinkedList();
	}

	@SuppressWarnings("rawtypes")
	public List getList() {
		return list;
	}

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist=new LinkedList<String>();
	      linkedlist.add("Apple");
	      linkedlist.add("Orange");
	      linkedlist.add("Mango");
	      
	      
		ListClientExample lce = new ListClientExample();
		@SuppressWarnings("rawtypes")
		List list = lce.getList();
		System.out.println(list);
	}
}