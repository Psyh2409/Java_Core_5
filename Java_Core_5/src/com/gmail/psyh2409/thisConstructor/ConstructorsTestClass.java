package com.gmail.psyh2409.thisConstructor;

public class ConstructorsTestClass {
	 public int i;
	 public double d;
	 
	 public ConstructorsTestClass(int i, double d){
	  this.i=i;
	  this.d=d;
	  }
	 public ConstructorsTestClass(int i){
	  this(i, 3.14);
	 }
	 public static void main(String[] args) {
		 ConstructorsTestClass m =  new ConstructorsTestClass(5);
	  System.out.println(m.d);
	 }
	 //Output: 3.14
}
