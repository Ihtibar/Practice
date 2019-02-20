package com.practice;

import java.util.ArrayList;

public class RemoveInstanses {
	
	 public static ArrayList<Integer> removeInst(ArrayList<Integer> r,Integer n) {
		 for( int i = 0; i< r.size(); i++) {
			 if(r.get(i) == n) {
				r.remove(i) ;
				i--;
			 }
		 }
		 
		 return  r;
}
	 public static void main(String[] args) {
		 ArrayList<Integer>arrNew= new ArrayList<>();
		 String x= new String();
		 arrNew.add(10);
		 arrNew.add(20);
		 arrNew.add(30);
		System.out.println(removeInst(arrNew, 10));
		 
	}
}