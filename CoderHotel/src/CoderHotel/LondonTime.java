package CoderHotel;

public class LondonTime extends CityTime{

	public LondonTime(PhoneTime phoneTime) {
		super(phoneTime);
		// TODO Auto-generated constructor stub
		cityName = "London";
	}

	@Override
	public void updateTime(PhoneTime stdTime) {
		// TODO Auto-generated method stub
		cityTime.hour = stdTime.getPhoneTime().hour;
		if(cityTime.hour-8>0)
		{
			cityTime.hour = cityTime.hour-8;
		}
		else
		{
			cityTime.hour = cityTime.hour+4;
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
