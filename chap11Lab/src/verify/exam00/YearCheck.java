package verify.exam00;

import java.util.Scanner;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class YearCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연도를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt(); // 2004
		
//		if(  (year % 4 == 0 && year % 100 != 0) || year % 400 == 0  ) {
//			System.out.println(year+"은 윤년");
//		} else {
//			System.out.println(year+"은 평년");
//		}
		
		// 작성위치 : GregorianCalendar의 메소드를 이용하여 윤년인지를 파악한다.
		
		GregorianCalendar gc = new GregorianCalendar();

		if(gc.isLeapYear(year)) {
			System.out.println(year+"년은 윤년");
		} else {
			System.out.println(year+"년은 평년");
			
		}
//		@@@@
		System.out.println("@@@@");
		Calendar baseCal = new GregorianCalendar(year, Calendar.JANUARY, 1);
		Calendar targetCal = new GregorianCalendar(year+1, Calendar.JANUARY, 1);
		
		long diffSec = (  targetCal.getTimeInMillis() - baseCal.getTimeInMillis()  )/1000;
		long diffDays = diffSec / (24*60*60);
//		System.out.println(diffDays);
		
		if(diffDays > 365) {
			System.out.println(year+"년은 윤년");
		} else {
			System.out.println(year+"년은 평년");
		}
		
		
		
		
		
		
		
		
		
//		@@@@	
	}

}
