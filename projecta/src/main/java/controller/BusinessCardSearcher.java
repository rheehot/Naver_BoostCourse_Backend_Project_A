package controller;

import java.util.List;

import dao.BusinessCardDao;
import dto.BusinessCard;
import view.InputView;

public class BusinessCardSearcher {

	public static void run() {
		String name = InputView.inputSearchName();
		List<BusinessCard> list = BusinessCardDao.searchBusinessCard(name);
		printBusinessCardList(list);
	}

	private static void printBusinessCardList(List<BusinessCard> list) {	
		for (BusinessCard card: list) {
			System.out.println(card);
		}
	}
}
