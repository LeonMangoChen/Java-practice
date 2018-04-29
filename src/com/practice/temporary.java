package com.practice;

public class temporary {

	public static void main(String[] args) {
		System.out.println(args); //[ljava.lang.string;@139a55  “[”代表数组， “l”代表long , "@139a55"代表哈希值  
        System.out.println(args.length);  //默认长度为0  
        for(int i = 0; i < args.length; i++) {
        	 System.out.println(args[i]); 
        }
	}
}
