package controller;

import view.InputView;
import view.OutputView;

public class BusinessCardManager {


	private static final String OPTION_ONE = "1";
	private static final String OPTION_TWO = "2";
	private static final String OPTION_THREE = "3";
	
	private String userOption = "";
	
	public void run() {
		initUserOption();
		while (!userWantQuit()) {
			OutputView.printMainOptions();
			userOption = InputView.inputOption();
			executeUserOption(userOption);
		}
	}
	
	private void executeUserOption(String userOption) {
		if (userOption.equals(OPTION_ONE)) {
			BusinessCardRegister.run();
			return;
		}
		if (userOption.equals(OPTION_TWO)) {
			BusinessCardSearcher.run();
			return;
		}
	}

	private boolean userWantQuit() {
		return userOption.equals(OPTION_THREE);
	}
	
	private void initUserOption() {
		userOption = "";
	}
}
