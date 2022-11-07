package project_sql;

import java.util.ArrayList;
import java.util.Scanner;

public class Member {

	protected static ArrayList<Member> member = new ArrayList<>();
	protected static Scanner sc = new Scanner(System.in);
	
	private int mNumber;
	private String mName;
	private String mPhone;
	private String mAddress;
	private int mSum;
	private String mGrade;

	
	public Member() {
	
	}

	public Member(int mNumber, String mName, String mPhone, String mAddress, int mSum, String mGrade, int mPoint) {
		this.mNumber = mNumber;
		this.mName = mName;
		this.mPhone = mPhone;
		this.mAddress = mAddress;
		this.mSum = mSum;
		this.mGrade = mGrade;
	}




	public static ArrayList<Member> getMember() {
		return member;
	}

	public static void setMember(ArrayList<Member> member) {
		Member.member = member;
	}

	public int getmNumber() {
		return mNumber;
	}

	public void setmNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmPhone() {
		return mPhone;
	}

	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}

	public String getmAddress() {
		return mAddress;
	}

	public void setmAddress(String mAddress) {
		this.mAddress = mAddress;
	}

	public int getmSum() {
		return mSum;
	}

	public void setmSum(int mSum) {
		this.mSum = mSum;
	}

	public String getmGrade() {
		return mGrade;
	}

	public void setmGrade(String mGrade) {
		this.mGrade = mGrade;
	}

	@Override
	public String toString() {
		
		return    "    회원번호 : " +mNumber
				+ "\n    회원이름 : " +mName
				+ "\n    전화번호 : " +mPhone
				+ "\n    주소 : " + mAddress
				+ "\n    누적매출액 : " + mSum
				+ "\n    회원등급 : " + mGrade
				+ "\n";
	}

}
