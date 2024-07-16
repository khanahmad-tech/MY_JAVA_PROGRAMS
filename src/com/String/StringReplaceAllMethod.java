package com.String;

public class StringReplaceAllMethod {
   public static void main(String[] args) {
	 
	   String s1 = "Java is programing language.";
	   String s2 = " Ahmad ";
	   
	   System.out.println(s1.replaceAll("is","high" ));
	   System.out.println(s1.replaceAll("is(.)"," high "));//regex matlab validation ke
	   //liye use hota hai
	   System.out.println(s1.replaceAll("is(.*)", "high"));
}
}
