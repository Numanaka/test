package com.internousdev.login2.dto;

public class LoginDTO {

	//カプセル化　
	private int id;
	private String name;
	private String password;

	//privateで隠したフィールドを他クラスで使えるようにgetterとsetterを定義
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}

	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}
