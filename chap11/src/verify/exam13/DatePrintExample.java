package verify.exam13;

import java.text.*;
import java.util.*;

public class DatePrintExample {
	public static void main(String[] args) {
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm��");
		System.out.println(sdf.format(now));
	}
}
