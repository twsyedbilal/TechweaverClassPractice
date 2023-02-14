package com.tw.collectionP;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		SortedSet<String> tree=new TreeSet<String>();
		tree.add("b");
		tree.add("z");
		tree.add("Z");
		tree.add("A");
		tree.add("a");
		
		System.out.println(tree);
		
		Object[] s=tree.toArray();
		for (Object ss : s) {
			System.out.println(ss);
		}
	}
}
