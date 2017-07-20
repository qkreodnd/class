package test.controller;

import test.action.HomeAction;
import test.file.action.FileDeleteAction;
import test.file.action.FileListAction;
import test.file.action.FileUploadAction;
import test.file.action.FileuploadFormAction;

public class UserActionFactory {
	private static UserActionFactory factory;
	private UserActionFactory(){}
	//자신의 참조값을 리턴해주는 메소드
	public static UserActionFactory getInstance(){
		if(factory==null){
			factory=new UserActionFactory();
		}
		return factory;
	}
	
	//인자로 전달되는 command 를 수행할 Action type 객체를 리턴해주는 
	//메소드
	public Action action(String command){
		//Action 추상클래스 type 을 담을 지역변수 만들기 
		Action action=null;
		if(command.equals("/home")){
			action=new HomeAction();
		}else if(command.equals("/file/list")){
			action=new FileListAction();
		}else if(command.equals("/file/fileuploadform")){
			action=new FileuploadFormAction();
		}else if(command.equals("/file/fileupload")){
			action=new FileUploadAction();
		}else if(command.equals("/file/filedelete")){
			action=new FileDeleteAction();
		}
		return action;
	}
}








