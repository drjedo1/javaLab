package sec14.exam02_calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calendar는 추상 클래스 이므로 new 로 선언 안된다.
		// 그 대안은 다음과 같다.
		
		
		Calendar now = Calendar.getInstance();	// 1. 메소드로 선언하거
		Calendar now1 = new GregorianCalendar(); //  2. 자식객체로 받거나,

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DATE);
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
	
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year+"년 ");
		System.out.println(((month)+1)+"월 ");
		System.out.println(day+"일 ");
		System.out.println(strWeek+"요일 ");
		System.out.println(strAmPm+" ");
		System.out.println(hour+"시 ");
		System.out.println(minute+"분 ");
		System.out.println(second+"초 ");
		
		
	
	
	
	
	
	
	}

}
