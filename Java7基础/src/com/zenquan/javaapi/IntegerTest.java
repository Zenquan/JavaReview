package com.zenquan.javaapi;

public class IntegerTest {
	public static void main(String[] args){
		Integer a = new Integer("10");
		Integer b = new Integer("11");
		System.out.println(a.compareTo(b));
		float c = a.floatValue();
		double d = a.doubleValue();
		String e = a.toString();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		int count;
		char[] values = {'*', '_', '%', '8', 'L', 'l'};
		for(count=0;count<values.length;count++) {
			if(Character.isDigit(values[count])) {
				System.out.println(values[count]+"是一个数字");
			}
			if(Character.isLetter(values[count])) {
				System.out.println(values[count]+"是一个字母");
			}
			if(Character.isUpperCase(values[count])) {
				System.out.println(values[count]+"是大写形式");
			}
			if(Character.isLowerCase(values[count])) {
				System.out.println(values[count]+"是小写形式");
			}
			if(Character.isUnicodeIdentifierStart(values[count])) {
				System.out.println(values[count]+"是Unicode标志符号的第一个有效字符");
			}
			Boolean bool = new Boolean(true);
			System.out.println(bool.booleanValue());
			Boolean cool = new Boolean("ok");
			System.out.println(cool.booleanValue());
			System.out.println(bool.equals(true));
			System.out.println(Boolean.parseBoolean("true"));
			bool.toString();
			Boolean.valueOf(bool);
			System.out.println("andankn".substring(0, 3));
			System.out.println("andankn".indexOf('n'));
			System.out.println("  kkmkamdkmak        am".trim());
			StringBuffer s = new StringBuffer("dsakakn;ankn");
			s.insert(2, "kak");
			System.out.println(s);
			s.append("dkankne");
			System.out.println(s);
			System.out.println(s.length());
			System.out.println(s.getClass());
		}
	}
}
