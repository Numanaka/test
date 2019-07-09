package com.internousdev.template.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{

	private int stock;
	private String pay;	//購入画面.jspの支払い方法
	public Map<String,Object> session;
	private String result;

	public String execute(){//商品情報をsessionに入れて遷移する用
		result=SUCCESS;

		session.put("stock",stock);
		int intStock=Integer.parseInt(session.get("stock").toString());
		int intPrice=Integer.parseInt(session.get("buyItem_price").toString());
		session.put("buyItem_price",intStock*intPrice);//計算のためにint型にする

		String payment;

		if(pay.equals("1")){//購入画面.jspのvalueが1だった場合
			payment="現金払い";
			session.put("pay",payment);//支払い方法をsessionへ
		}else{
			payment="クレジットカード";
			session.put("pay",payment);
		}
		return result;

	}
	public int getStock(){
		return stock;
	}
	public void setStock(int stock){
		this.stock=stock;
	}
	public String getPay(){
		return pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}



}
