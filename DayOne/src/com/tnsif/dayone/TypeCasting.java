package com.tnsif.dayone;

public class TypeCasting {
	public static void main(String[] args) {
		
		//widening  //implicit type type casting
		
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		
		//narrowing  // explicit type casting
		
		double f1=10.525f;
		long l1=(long) f1;
		System.out.println(l1);
		
		
		long l2=86682525992L;
		int il2=(int) l2;
		System.out.println(il2);
		
		
		short a=130;
		byte b1=(byte) a;
		System.out.println(b1);
	//130-128 = 2  >>>>>>>>  -128----(-126)
	}

}
