package com.ksv;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ArrayList list=new ArrayList();
   list.add(10);
   list.add(20);
   list.add(30);
   System.out.println(list.get(2));
   System.out.println(list.remove(1));
   
   LinkedList num=new LinkedList();
   num.add(1);
   num.add(2);
   num.add(3);
   System.out.println(num);
   System.out.println(num.get(2));
   System.out.println(num.remove(1));
   ArrayList<String> list1=new ArrayList();
   list.add("java");
   list.add("html");
   list.add("python");
   list.add("javascript");
   System.out.println("list1:"+list1);
   Vector<String> vec=new Vector();
   vec.add("ui");
   vec.add("lj");
   vec.add("mn");
   System.out.println(vec);
   Iterator<String> itr=vec.iterator();
   System.out.println("Elements");
   while(itr.hasNext()) {
	   System.out.println(itr.next());
	   HashSet<String> hs=new HashSet();
	   hs.add("Bhavani");
	   hs.add("lavanya");
	   hs.add("keerthi");
	   hs.add("deepthi");
	   System.out.println("set is:"+hs);
	   HashMap<Integer,String> map=new HashMap<Integer,String>();
	   map.put(10, "Deepthi");
	   map.put(20, "Lakshmi");
	   map.put(29,"Ravi");
	   System.out.println(map.get("Deepthi"));
	   System.out.println(map.keySet());
	   System.out.println(map.entrySet());
	   System.out.println(map.values());
	   HashMap<String,Integer> hm=new HashMap<String,Integer>();
	   hm.put("Kavitha", 20);
	   hm.put("Lavanya", 22);
	   hm.put("Deepthi", 25);
	   System.out.println(hm.get("Lavanya"));
	   System.out.println(hm.keySet());
	   System.out.println(hm.values());
	   System.out.println(hm.entrySet());
	   TreeMap<String,Integer> tm=new TreeMap<String,Integer>();
	   tm.put("Arjun", 20);
	   tm.put("NTR", 45);
	   tm.put("Vijay", 50);
	  
	   System.out.println(tm.get("Vijay"));
	   System.out.println(tm.entrySet());
	   System.out.println(tm.remove("NTR", 45));
	   System.out.println(tm.keySet());
	   System.out.println(tm.values());
	   
	   
   }
   
   
	}

}
