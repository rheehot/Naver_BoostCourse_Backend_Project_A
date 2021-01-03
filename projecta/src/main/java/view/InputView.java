package view;

import java.util.Scanner;

import utils.Validator;

public class InputView {

	private static final String ASK_OPTION = "메뉴를 입력하세요: ";
	private static final String ERROR_PREFIX = "[ERROR]: ";
	private static final String INPUT_NAME = "이름을 입력하세요: ";
	private static final String INPUT_PHONENUM = "전화번호를 입력하세요: ";
	private static final String INPUT_COMPANY_NAME = "회사 이름을 입력하세요: ";
	private static final String SEARCH_NAME = "검색할 이름을 입력하세요. (like 검색) : ";
	private static Scanner scanner = new Scanner(System.in);
	
	public static String inputOption() {
		System.out.println(ASK_OPTION);
		String userOption = scanner.nextLine().trim();
		try {
			Validator.validateInputOption(userOption);
			return userOption;
			
		} catch (Exception e) {
			System.out.println(ERROR_PREFIX + e.getMessage());
			return inputOption();
		}
	}

	public static String inputName() {
		System.out.println(INPUT_NAME);
		String name = scanner.nextLine().trim();
		return name;
	}

	public static String inputPhoneNum() {
		System.out.println(INPUT_PHONENUM);
		String phoneNum = scanner.nextLine().trim();
		return phoneNum;
	}

	public static String inputCompanyName() {
		System.out.println(INPUT_COMPANY_NAME);
		String companyName = scanner.nextLine().trim();
		return companyName;
	}

	public static String inputSearchName() {
		System.out.println(SEARCH_NAME);
		String name = scanner.nextLine().trim();
		return name;
	}
}