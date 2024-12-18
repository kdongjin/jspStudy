package com.kh.dev.student.control;

import com.kh.dev.student.action.Action;
import com.kh.dev.student.action.IdCheckAction;
import com.kh.dev.student.action.IndexAction;
import com.kh.dev.student.action.RegFormAction;
import com.kh.dev.student.action.ZipCheckAction;

//싱글톤방식
public class ActionFactory {
	private static ActionFactory factory;

	public static synchronized ActionFactory getInstance() {
		if(factory == null) {
			factory = new ActionFactory();
		}
		return factory;
	} 
	
	private ActionFactory() {}
	
	public Action getAction(String cmd) {
		Action action = null;
	
		switch (cmd) {
		case "/index.do":
			action = new IndexAction();
			break;
		case "/regForm.do":
			action = new RegFormAction();
			break;
		case "/idCheck.do":
			action = new IdCheckAction();
			break;
		case "/zipCheck.do":
			action = new ZipCheckAction();
			break;
		default:
			action = new IndexAction();
			break;
		}
	
		return action;
	}
	

}
