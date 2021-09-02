package sec07_exam02_method;

import java.io.*;

public class StringGetBytesExample {
	
	public static void main(String[] args) {
		
	
		String str = "¾È³çÇÏ¼¼¿ä";
		
		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length : " + bytes1.length);
		String str1 =  new String(bytes1);
		System.out.println("bytes1 -> string: " + str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length : " + bytes2.length);
			String str2 =  new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> string: " + str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes2.length : " + bytes3.length);
			String str3 =  new String(bytes3, "UTF-8");
			System.out.println("bytes2 -> string: " + str3);
			
		} catch (UnsupportedEncodingException e) {			
			e.printStackTrace();
		}
		
	}
}
