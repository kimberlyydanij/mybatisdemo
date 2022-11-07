package project_sql;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Process extends Member {

	
	protected static boolean bChk = false;

	public Process() {

	}


	public static void memberAdd() {
		int chk = 0;
		try {

			Member m = new Member();
			
			System.out.println("  ========================================");
			System.out.println("                신규 회원 정보 입력           ");
			System.out.print("   회원번호 : ");
			int num = sc.nextInt();
			
			//회원번호 중복 체크
			// bChk = true;
			bChk = duplicateCheck(num);
			if(bChk==true) {
			System.out.println("   이미 존재하는 회원 번호 입니다. ");
			System.out.println("   새로 입력해주세요. ");
			System.out.println("   마지막 회원번호 : "+member.size());
			memberAdd(); }
			
				
			m.setmNumber(num);
			System.out.print("   이름 : ");
			String name = sc.next();
			m.setmName(name);
			System.out.print("   전화번호 : ");
			String phone = sc.next();
			m.setmPhone(phone);
			System.out.print("   주소 : ");
			sc.nextLine();
			String address = sc.nextLine();
			m.setmAddress(address);
			System.out.print("   누적매출액 : ");
			int sum = sc.nextInt();
			m.setmSum(sum);
			m.setmGrade(calGrade(sum));
			
			member.add(m);
			System.out.println();
			System.out.println("   추가 완료하였습니다. 추가된 회원 정보 :");
			memberSearch(num);
			Management.mainMenu();
			/*
			System.out.println("  ========================================");
			System.out.println("     1.계속입력 2.메인메뉴 3.프로그램 종료");
			chk = sc.nextInt();
			if (!(chk >= 1 && chk <= 3))
				errorMessage();
			switch (chk) {
			case 1:
				Process.memberAdd();
			case 2:
				Management.mainMenu();
			case 3:
				end();
			} // end switch */
			
		} catch (InputMismatchException e) {
			Process.errorMessage();
		} // end try-catch
	} // end memberAdd()
	
	public static String calGrade(int data) {
		String cGrade = "New";
		
		if (data<100000) 
			cGrade="New";
			else if (data>=100000 && data <500000) 
				cGrade="Family";
			else if (data>=500000 && data <1000000)
				cGrade="Vip";
			else if (data>=1000000)
				cGrade="Vvip";			

		return cGrade;
	}

	public static void memberDelete() {
		boolean dChk = true;
		int chk = 0;
		char checker;
		Member m = new Member();
		System.out.println("  ========================================");
		System.out.print("   삭제할 회원의 회원번호를 입력하세요 : ");
		try {
			
			chk = sc.nextInt();
			dChk = duplicateCheck(chk);
			if(dChk==false) {
			   System.out.println("   존재하지 않는 회원 번호 입니다. ");
			   System.out.println("   새로 입력해주세요. "); 
			   memberDelete();
		 	 } //end if
			
			memberSearch(chk);
			System.out.printf("   삭제할 회원번호가 %d가 맞습니까? (Y/N) ", chk);
			checker = sc.next().charAt(0);
			if (checker == 'Y' || checker == 'y') {
				System.out.printf("   %d 번 회원 정보를 삭제 합니다.\n", chk);
				System.out.println();
			} else if (checker == 'N' || checker == 'n') {
				System.out.println("   다시 입력해주세요.");
				memberDelete();
			} else {
				errorMessage();
				//memberDelete();
			} // end if

		} catch (InputMismatchException e) {
			Process.errorMessage();
			System.out.println("   프로그램을 재 실행하세요.");
			System.exit(1);

		} // end try-catch
		
			for (int i = 0; i < member.size(); i++) {
				m = member.get(i);
				if(m.getmNumber()==chk)  
					member.remove(i);  
				} // end for
			
			Management.mainMenu();
			
			/*
			    System.out.println("  ========================================");
				System.out.println("    1.계속삭제     2.메인메뉴   3.프로그램 종료");
				chk = 0;
				chk = sc.nextInt();
				switch (chk) {
				case 1:
					Process.memberDelete();
					break;
				case 2:
					Management.mainMenu();
					break;
				case 3:
					end();
					sc.close();
				} // end switch
			*/
	} // end memberDelete();

	public static void memberSearchPage() {
		bChk = true;
		int searchChk = 0;
		System.out.println("  ========================================");
		System.out.print("   조회하실 회원번호를 입력하세요 : ");
		try {
		searchChk = sc.nextInt();
		bChk = duplicateCheck(searchChk);
		if(bChk==false) {
			   System.out.println("   존재하지 않는 회원 번호 입니다. ");
			   System.out.println("   새로 입력해주세요. "); 
			   memberSearchPage();
		 	 } //end if 
		} catch (InputMismatchException e) {
			Process.errorMessage();
		} // end try-catch
		
		
		memberSearch(searchChk);
		Management.mainMenu();
		
		/*
		System.out.println("  ========================================");
		System.out.println("     1.계속조회  2.메인메뉴 3.프로그램 종료");
		try {
			searchChk = sc.nextInt();
		if (!(searchChk >= 1 && searchChk <= 3))
			errorMessage();
			Management.mainMenu();
		switch (searchChk) {
		case 1:
			Process.memberSearchPage();
			break;
		case 2:
			Management.mainMenu();
			break;
		case 3:
			end();
		} // end switch
	} catch (InputMismatchException e) {
		Process.errorMessage();
		Management.main(null);
	} // end try-catch  */
		
	} // end memberSearchPage
	
	public static void memberSearch(int chk) {
	
		for (int i = 0; i < member.size(); i++) {
			
			Member m = member.get(i);
			if(m.getmNumber()==chk) {
				System.out.println("\n    회원번호 : " +m.getmNumber()
				+ "\n    회원이름 : " +m.getmName()
				+ "\n    전화번호 : " +m.getmPhone()
				+ "\n    주소 : " + m.getmAddress()
				+ "\n    누적매출액 : " + m.getmSum()
				+ "\n    회원등급 : " + m.getmGrade()
				+ "\n");
			}
		} // end for
		
	} // end memberSearch()

	public static void cal() {
		int sNum=0;
		int sSum=0;
		boolean sChk = true;
		System.out.println("  ========================================");
		System.out.print("   회원번호 : ");
		try {
		sNum = sc.nextInt()-1;
		sChk = duplicateCheck(sNum);
		if(sChk==false) {
			   System.out.println("   존재하지 않는 회원 번호 입니다. ");
			   System.out.println("   다시 입력해주세요. ");  
		cal(); } // end if
		Member mCal = member.get(sNum);
		System.out.print("   "+mCal.getmName()+"고객님의 매출 자료 입니다.\n");
		System.out.println();
		System.out.print("   추가 구매액 : ");
		sSum = sc.nextInt();


		System.out.printf("   기존 구매액 : %10d",mCal.getmSum());
		System.out.println(" 고객등급 : "+mCal.getmGrade());
		
		mCal.setmSum((mCal.getmSum() + sSum));
		mCal.setmGrade(calGrade(mCal.getmSum()));
		
		System.out.printf("   누적 구매액 : %10d",mCal.getmSum());  
		System.out.println(" 고객등급 : "+mCal.getmGrade()); 
		System.out.println();
		}  catch (InputMismatchException e) {
			Process.errorMessage();
		} // end try-catch
		Management.mainMenu();
		
	} // end cal

	public static void errorMessage() {
		System.out.println("  ========================================");
		System.out.println("   잘못 입력하셨습니다. 프로그램을 재 실행하세요.");
		sc.close();
		System.exit(0);
		System.out.println();
	} // end errorMessage()

	public static void end() {
		System.out.println("  ========================================");
		System.out.println("   프로그램을 종료합니다.");
		sc.close();
		System.exit(0);
	} // end end

	
	public static void dataCheck() {  //현재 저장된 데이터 모두 출력
		Member dd = new Member();
		for(int i=0;i<member.size();i++)
			System.out.println(dd = member.get(i));
		
		Management.mainMenu(); 
	
	} // end dataCheck()
	
	/*
	
	public static void duplicateCheck(int chk) {
		Member mChk = new Member();
		for(int j=0;j<member.size();j++) {
			mChk = member.get(j);
			if(mChk.getmNumber()==chk) {
				System.out.println("   이미 존재하는 회원 번호 입니다. ");
				System.out.println("   새로 입력해주세요. ");
				System.out.println("   마지막 회원번호 : "+member.size());
				memberAdd();
			} //end if
		}// end for
	} //end duplicateCheck */
	
	public static boolean duplicateCheck(int chk) {
	Member mChk = new Member();
	for(int i=0;i<member.size();i++) {
		mChk = member.get(i);
			if(mChk.getmNumber()==chk) {
				bChk = true;
				break;	}
			else {bChk = false; }
		} // end for

	return bChk;
} //end duplicateCheck


	/*
	public String toString() {
		return String.format(
				"   조회하신 회원 정보는 다음과 같습니다\n"
				+ "   회원번호 : %d\n"
				+ "   회원이름 : %s\n"
				+ "   전화번호 : %s\n"
				+ "   주소 : %s\n"+ getmNumber(), getmName(), getmPhone(), getmAddress()); 
	} // end toString */ 
	
}
