package project_sql;

import java.util.Scanner;

import java.util.HashMap;
import java.util.List;

public class MemMain {

	public static void main(String[] args) {
		MemController mController = new MemController();
		Scanner sc = new Scanner(System.in);
		Scanner sd = new Scanner(System.in);
		
		System.out.println("  ========================================");
		System.out.println("       회원관리 프로그램에 오신것을 환영합니다     ");
		System.out.println("  ========================================");
	
		while(true) {

			System.out.println("   1.회원추가 2.회원삭제 3.조회 4.매출입력 5.종료");
			System.out.println("  ========================================");
			System.out.print("   원하시는 업무를 입력하세요 : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input==1) {
				insertCall(mController, sc);	
				
				} else if(input==2) {
					deleteCall(mController, sc);
					
				} else if(input==3) {
					listCall(mController);
					
				} else if(input==4) {
				    updateCall(mController, sc, sd);
					
				} else if (input==5) {
					System.out.println("시스템 종료");
					System.exit(0); }
		} // end while
		
} // end main
	
	private static void insertCall(MemController mController, Scanner sc) {
		
		System.out.println("  ========================================");
		System.out.println("                신규 회원 정보 입력           ");
			System.out.print("   이름 : ");
		String name = sc.nextLine();
		System.out.print("   전화번호 : ");
		String phone = sc.nextLine();
		System.out.print("   주소 : ");
		String address = sc.nextLine();
		MemDTO dto = new MemDTO(name,phone,address);
		int chk = mController.insertProcess(dto);
		if(chk>0) {
	    System.out.println("  ========================================");
		System.out.println("   추가 완료하였습니다. "); }
		else
			System.out.println("   추가에 실패하였습니다.");
	} // end Insert
	
private static void deleteCall(MemController mController, Scanner sc) {
		
		System.out.println("  ========================================");
		System.out.print("   삭제할 회원의 회원번호를 입력하세요 : ");
		mController.deleteProcess(Integer.parseInt(sc.nextLine()));
		//int num = Integer.parseInt(sc.nextLine());
		//int chk = mController.deleteProcess(num);
		
	} // end Delete

private static void listCall(MemController mController) {
	List<MemDTO> aList = mController.listProcess();
	System.out.println("  ========================================");
	for(MemDTO dto : aList) 
		System.out.printf("  %2d %s %s %s %7d %s \n" 
				 ,dto.getmNumber(),dto.getmName()
				 ,dto.getmPhone(),dto.getmAddress()
				 ,dto.getmSum(),dto.getmGrade());
		System.out.println(); 

} // and listCall

private static void updateCall(MemController mController, Scanner sc, Scanner sd) {
	
	System.out.println("  ========================================");
	System.out.print("   매출을 추가할 회원의 회원번호를 입력하세요 : ");
	int nnum = Integer.parseInt(sc.nextLine());
	System.out.print("   추가 매출액을 입력하세요 : ");
	int salesPrice = Integer.parseInt(sd.nextLine());
	mController.updateProcess(nnum,salesPrice);
	//int chk = mController.updateProcess(n,salesPrice);
	
} // end Delete
//update

} // end class