package com.zenquan.second;
import java.io.*;

public class LearnIO {
    /**
     * ���ڼ��ܺͽ��ܶ��Ƕ�Ŀ���ļ������ˣ�ֻ��һ��������
     * @param args ����˳���Ĳ���1�������ļ�������2������ļ�
     */
	public static void main(String[] args) throws IOException {
		if(args.length<2) {
            System.out.println("����ȷʹ�ò�����");
            System.out.println("�����÷���");
            System.out.println("����1:�����ļ�������2:����ļ�������3:����/���ܵ�����");
            System.out.println("���ӣ�mypwd d:/1.txt d:2.txt 21");
            return;
		}
		String inFilePath = args[0];
		String outFilePath = args[1];
		int code;
		try {
			code = Integer.parseInt(args[2]);
		}catch(Exception e) {
			System.out.println("����/���ܵ������������Ϥ");
			return;
		}
		// ����·�������ļ�
		File inFile = new File(inFilePath);
		File outFile = new File(outFilePath);
		if(!inFile.exists()) {
			System.out.println("�ļ���\""+inFilePath+"\"������");
		}
		// ����File���󴴽�����������
		FileInputStream input = new FileInputStream(inFile);
		FileOutputStream output = new FileOutputStream(outFile);
		
		// ��ȡ���Ͱ��������
		int content = 0;
		while((content=input.read())!=-1) {
			output.write(content^code);
		}
		output.close();
		input.close();
	}
}
