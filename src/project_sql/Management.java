package project_sql;

Import Java.util.HashMap;

import java.util.Scanner;

public class Management extends Process {
	public static void main(String[] args) {

	Member a = new Member();
	a.setmNumber(1);
	a.setmName("김석진");
	a.setmPhone("010-1111-1111");
	a.setmAddress("과천");
	a.setmSum(510000);
	a.setmGrade("Family");
	member.add(a);
	
	Member b = new Member();
	b.setmNumber(2);
	b.setmName("민윤기");
	b.setmPhone("010-2222-2222");
	b.setmAddress("대구");
	b.setmSum(10000000);
	b.setmGrade("Vvip");
	member.add(b); 
	
	Member c = new Member();
	c.setmNumber(3);
	c.setmName("김남준");
	c.setmPhone("010-3333-3333");
	c.setmAddress("일산");
	c.setmSum(0);
	c.setmGrade("New");
	member.add(c);
	
	Member d = new Member();
	d.setmNumber(4);
	d.setmName("정호석");
	d.setmPhone("010-4444-4444");
	d.setmAddress("광주");
	d.setmSum(50000);
	d.setmGrade("New");
	member.add(d);
	
	Member e = new Member();
	e.setmNumber(5);
	e.setmName("김태형");
	e.setmPhone("010-5555-5555");
	e.setmAddress("거창");
	e.setmSum(1050000);
	e.setmGrade("Vip");
	member.add(e);
	
	Member f = new Member();
	f.setmNumber(6);
	f.setmName("박지민");
	f.setmPhone("010-6666-6666");
	f.setmAddress("부산");
	f.setmSum(2500000);
	f.setmGrade("Vvip");
	member.add(f);

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
