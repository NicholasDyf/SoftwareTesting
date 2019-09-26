package CoderHotel;

import java.util.*;

public class CoderHotel {
	public static void main(String[] args)
	{
		System.out.println("请输入手机时间（格式HH:mm,十二小时制）");
		Scanner scan = new Scanner(System.in);
		String time = scan.next();
		PhoneTime myPhone = new PhoneTime(time);
		CityTime[] cities = new CityTime[5];
		cities[0] = new BeijingTime(myPhone);
		cities[1] = new NYCTime(myPhone);
		cities[2] = new SydneyTime(myPhone);
		cities[3] = new MoscowTime(myPhone);
		cities[4] = new LondonTime(myPhone);
		for(CityTime city:cities)
			city.printTime();
	}
}
