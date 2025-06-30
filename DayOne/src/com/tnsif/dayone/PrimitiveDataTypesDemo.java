package com.tnsif.dayone;

public class PrimitiveDataTypesDemo {
	public static void main(String[] args) {
		
		//byte take 1 byte
		//1byte = 8 bits    // 2^8
		//256/2
		//128
		
		byte byteMax=127;
	    byte byteMin=-128;
	    
	    System.out.println("Min range of byte is :"+ byteMin + " Max range of byte is :"+ byteMax);
	    
	    //short -----2 byte   2^16       (2*8)
	    
	    short shortMax= 32767;
	    short shortMin= -32768;
	    System.out.println("Min range of short is :"+ shortMin + " Max range of short is :"+ shortMax);
	    
	    
	    //int--------4 bytes    2^32     (4*8)
	    
	    int maxInt=2147483647;
	    int minInt=-2147483648;
	    System.out.println("Min range of Int is :"+ minInt + " Max range of Int is :"+ maxInt);
	    
	    
	    //long-----------8 byte     8^64      (8*8)
	    
	    long maxLong=9223372036854775807L;
	    long minLong=-9223372036854775808L;
	    
	    //values will get rounded or truncated
	    float f=3234.141243278345f;                    //float in Java is only 32 bits and can store up to 6–7 decimal digits of precision.
	    double d=3456.14124512345678902345678914f;     //double in Java is only 32 bits and can store up to 15–16 decimal digits of precision.
	    
	    System.out.println(f);
	    System.out.println(d);
	    
	    
	    boolean flag=false;
	    boolean flag2=true;
	}

}
