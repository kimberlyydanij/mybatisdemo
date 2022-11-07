package project_sql;

Import Java.util.HashMap;

import java.util.Scanner;

public class Management extends Process {
	public static void main(String[] args) {


	System.out.println("  ========================================");
	System.out.println("       회원관리 프로그램에 오신것을 환영합니다     ");
	System.out.println("  ========================================");
	mainMenu();
	} // end main()

public static void mainMenu() {
	
	int chker = 0;
	System.out.println("   1.회원추가 2.회원삭제 3.조회 4.매출입력 5.종료");
	System.out.println("  ========================================");
	System.out.print("   원하시는 업무를 입력하세요 : ");

	try {
		chker = sc.nextInt();
	if (!(chker>=1 && chker<=6)) {
		Process.errorMessage();
		mainMenu();
	    }
    	
	} catch(InputMismatchException e) {
		Process.errorMessage();
		
		
	} // end try-catch
	switch(chker) {
	case 1 : Process.memberAdd();
	case 2 : Process.memberDelete();
	case 3 : Process.memberSearchPage();
	case 4 : Process.cal();
	case 5 : Process.end();
	case 6 : Process.dataCheck();
	}

	} // end mainMenu

} // end class
