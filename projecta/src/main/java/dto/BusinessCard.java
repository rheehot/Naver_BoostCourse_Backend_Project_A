package dto;

public class BusinessCard {
	private String name;
	private String phoneNum;
	private String companyName;
	private String date;
	
	public BusinessCard(String name, String phoneNum, String companyName, String date) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.companyName = companyName;
		this.date = date;
	}

	@Override
	public String toString() {
		return "BusinessCard [name=" + name + ", phoneNum=" + phoneNum + ", companyName=" + companyName + ", date="
				+ date + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
