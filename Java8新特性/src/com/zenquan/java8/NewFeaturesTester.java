package com.zenquan.java8;

public class NewFeaturesTester {
	public static void main(String[] args) {
		NewFeaturesTester tester = new NewFeaturesTester();
		MathOperation addition = (int a, int b)->a+b;
		MathOperation subtraction = (a, b)->a-b;
		MathOperation multiplication = (int a, int b)->{return a*b;};
		MathOperation division = (int a, int b)->a/b;
        // 输出结果
	      System.out.println("10 + 5 = " + tester.operate(100, 2, addition));
	      System.out.println("10 - 5 = " + tester.operate(100, 2, subtraction));
	      System.out.println("10 x 5 = " + tester.operate(100, 2, multiplication));
	      System.out.println("10 / 5 = " + tester.operate(100, 2, division));

        // 没有括号的表达式			
	      GreeingService greetService1 = message -> System.out.println("Hello " + message);

        // 有括号的表达式			
	      GreeingService greetService2 = (message) -> System.out.println("Hello " + message);
			
        // 调用sayMessage方法输出结果
	      greetService1.sayMessage("Shiyanlou");
	      greetService2.sayMessage("Classmate");
	   }
		//定义一些接口和方法
		interface MathOperation {
			int operation(int a, int b);
		}
		interface GreeingService {
			void sayMessage(String message);
		}
		private int operate(int a, int b, MathOperation mathOperation) {
			return mathOperation.operation(a, b);
		}
}
