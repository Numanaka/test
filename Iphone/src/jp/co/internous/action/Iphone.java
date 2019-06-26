package jp.co.internous.action;

public class Iphone {

	public static void main(String[] args){

		SmartPhone iphone=new SmartPhone();
		iphone.play();//インスタンス化してメソッド呼び出し
		iphone.stop();
		iphone.next();
		iphone.back();
		iphone.call();
		iphone.mail();
		iphone.photo();
		iphone.internet();

	}

}
