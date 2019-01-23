package datastructure;

import java.util.HashMap;
import java.util.Map;

public class HowHashMapWorkInternally {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		/*
		 *  One we wrote the above line internally an array of bucket is created of size 16 i.e index in a form of table
		 *  Each bucket is called node and each node is linkedList
		 */
		map.put("a", 10);
		map.put("b", 20);
		/*
		 * Here once we use put() so internally for every key it will create a HashCode i.e
		 * HashCode = hash(key) -- here key is the same what we are assigning to a value so it will generate some hashcode like 1111112(kind of Array which is very big)
		 * Now internally its converting the so big array hashcode to index by
		 * index = hash &(n-1) with this calc we got index of 4 lets say . 
		 * So the value and key will go and store in the 4th index of node bucket in linkedlist form as node itself act as Linkedlist.
		 * ** And that linked list will store 4 things i.e ::::
		 * - key
		 * - hashcode
		 * - value
		 * - next
		 * next  checks the poninter for other lisnked list present in same node.
		 */ 
		 
		/* 
		 * Q) What if we have null key 
		 */
		map.put(null, 30);
		/*
		 * In this case everytime it will go into 0th pocket/bucket 
		 */
		

	}

}
