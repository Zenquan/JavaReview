package com.zenquan.second;
import java.io.*;

public class LearnIO {
    /**
     * 由于加密和解密都是对目标文件异或，因此，只有一个主程序。
     * @param args 定义此程序的参数1是输入文件，参数2是输出文件
     */
	public static void main(String[] args) throws IOException {
		if(args.length<2) {
            System.out.println("请正确使用参数！");
            System.out.println("参数用法：");
            System.out.println("参数1:输入文件，参数2:输出文件，参数3:加密/解密的数字");
            System.out.println("例子：mypwd d:/1.txt d:2.txt 21");
            return;
		}
		String inFilePath = args[0];
		String outFilePath = args[1];
		int code;
		try {
			code = Integer.parseInt(args[2]);
		}catch(Exception e) {
			System.out.println("加密/解密的密码必须是熟悉");
			return;
		}
		// 根据路径创建文件
		File inFile = new File(inFilePath);
		File outFile = new File(outFilePath);
		if(!inFile.exists()) {
			System.out.println("文件：\""+inFilePath+"\"不存在");
		}
		// 根据File对象创建输入和输出流
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		
		// 读取到就把数据异或
		int content = 0;
		while((content=input.read())!=-1) {
			output.write(content^code);
		}
		output.close();
		input.close();
	}
}
