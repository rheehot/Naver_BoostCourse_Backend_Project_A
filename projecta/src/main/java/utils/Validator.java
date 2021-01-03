package utils;

public class Validator {

	private static final String OPTION_ERROR_MESSAGE = "1~3 사이의 메뉴를 입력하세요";

	public static void validateInputOption(String userOption) {
		try {
			int intOption = Integer.parseInt(userOption);
			if (intOption < 1 || intOption > 3) {
				throw new IllegalArgumentException();
			}
		} catch (Exception e) {
			throw new IllegalArgumentException(OPTION_ERROR_MESSAGE);
		}
	}
}
