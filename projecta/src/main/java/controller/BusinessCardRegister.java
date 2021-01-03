package controller;

import dao.BusinessCardDao;
import view.InputView;

public class BusinessCardRegister {
	
	private static String name;
	private static String phoneNum;
	private static String companyName;
	
	public static void run() {
		initInfo();
		inputInfo();
		BusinessCardDao.registerBusinessCard(name, phoneNum, companyName);
	}

	private static void inputInfo() {
		name = InputView.inputName();
		phoneNum = InputView.inputPhoneNum();
		companyName = InputView.inputCompanyName();
	}

	private static void initInfo() {
		name = "";
		phoneNum = "";
		companyName = "";
	}
}
