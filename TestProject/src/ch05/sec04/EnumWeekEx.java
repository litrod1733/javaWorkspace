package ch05.sec04;
import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		// Calendar 클래스는 Instance를 생성하는 메소드를 제공함 getInstance() 메소드를 이용함
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNESDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
		}
		
		System.out.println("오늘 요일: " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일엔 짜파게티 요리사!");
		} else {
			System.out.println("닭가슴살이나 먹자ㅠ");
		}
		
		today = Week.SUNDAY;
		Week day = Week.WEDNESDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		int result1 = today.compareTo(day);
		int result2 = day.compareTo(today);
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekDay = Week.valueOf("SUNDAY");
		System.out.println(weekDay);
	}

}
