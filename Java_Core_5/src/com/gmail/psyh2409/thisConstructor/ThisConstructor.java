package com.gmail.psyh2409.thisConstructor;

public class ThisConstructor {
	 public int i;
	 public double d;
	 
	 public ThisConstructor(int i, double d){
	  this.i=i;
	  this.d=d;
	  }
	 public ThisConstructor(int i){
	  this(i, 3.14);
	 }
	 public static void main(String[] args) {
		 ThisConstructor m =  new ThisConstructor(5);
	  System.out.println(m.d);
	 }
	 //Output: 3.14
}
