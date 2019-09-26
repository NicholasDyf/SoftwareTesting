package CoderHotel;

public class SydneyTime extends CityTime{

	public SydneyTime(PhoneTime phoneTime) {
		super(phoneTime);
		// TODO Auto-generated constructor stub
		cityName = "Sydney";
	}

	@Override
	public void updateTime(PhoneTime stdTime) {
		// TODO Auto-generated method stub
		cityTime.hour = stdTime.getPhoneTime().hour;
		if(cityTime.hour+2<12)
		{
			cityTime.hour = cityTime.hour+2;
		}
		else
		{
			cityTime.hour = cityTime.hour-10;
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
