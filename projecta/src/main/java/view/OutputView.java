package view;

public class OutputView {

	private static final String DELIMITER_LINE = "-------------------";
	private static final String OPTION_ONE = "1. 명함 입력";
	private static final String OPTION_TWO = "2. 명함 검색";
	private static final String OPTION_THREE = "3. 종료";

	public static void printMainOptions() {
		System.out.println(DELIMITER_LINE);
		System.out.println(OPTION_ONE);
		System.out.println(OPTION_TWO);
		System.out.println(OPTION_THREE);
		System.out.println(DELIMITER_LINE);
	}
}
