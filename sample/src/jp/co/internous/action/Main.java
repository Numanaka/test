package jp.co.internous.action;

public class Main {

	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println(hiki(10,10));
		System.out.println(kake(10,10));
		System.out.println(wari(10,10));
	}

	public static int hiki(int num1, int num2){
		return num1-num2;
	}

	public static int kake(int num1, int num2){
		return num1*num2;
	}
	public static int wari(int num1, int num2){
		return num1/num2;
	}




}

