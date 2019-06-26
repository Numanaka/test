package com.internousdev.login2.action;

import java.sql.SQLException;

import com.internousdev.login2.dao.LoginDAO;
import com.internousdev.login2.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {

	private String name;
	private String password;//変数の定義

	public String execute()throws SQLException{
		//この下からexecuteメソッドの詳細

		String ret=ERROR;//このメソッドの戻り値の変数名をretとし、初期値ERRORで定義

		LoginDAO dao=new LoginDAO();
		LoginDTO dto=new LoginDTO();

		dto=dao.select(name,password);
		//DAOクラスのselectメソッドを呼び出して取得した値をDTOに代入

		if(name.equals(dto.getName())){//入力されたnameとpassが上で呼び出し→代入されたDTOでの値と一致する場合
			if(password.equals(dto.getPassword())){
				ret=SUCCESS;//戻り値をSUCCESSに変えて
			}
		}
		return ret;//戻り値を返す→struts.xmlの処理へ

	}

	public String getName(){//
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
