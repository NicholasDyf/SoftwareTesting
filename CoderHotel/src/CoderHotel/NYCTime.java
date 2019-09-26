package CoderHotel;

public class NYCTime extends CityTime{

	public NYCTime(PhoneTime phoneTime) {
		super(phoneTime);
		// TODO Auto-generated constructor stub
		cityName = "NewYork";
	}

	@Override
	public void updateTime(PhoneTime stdTime) {
		// TODO Auto-generated method stub
		cityTime.hour = stdTime.getPhoneTime().hour;
		if(cityTime.hour-1>0)
		{
			cityTime.hour = cityTime.hour-1;
		}
		else
		{
			cityTime.hour = cityTime.hour+11;
		}
	}

	@Override
	public void printTime() {
		// TODO Auto-generated method stub
		System.out.println(cityName + "'s time is " + 
		String.format("%02d",cityTime.getHour())+":"+
				String.format("%02d",cityTime.getMinute()));
	}

}
