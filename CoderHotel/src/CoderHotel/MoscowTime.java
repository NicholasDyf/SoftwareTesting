package CoderHotel;

public class MoscowTime extends CityTime{

	public MoscowTime(PhoneTime phoneTime) {
		super(phoneTime);
		// TODO Auto-generated constructor stub
		cityName = "Moscow";
	}

	@Override
	public void updateTime(PhoneTime stdTime) {
		// TODO Auto-generated method stub
		cityTime.hour = stdTime.getPhoneTime().hour;
		if(cityTime.hour-4>0)
		{
			cityTime.hour = cityTime.hour-4;
		}
		else
		{
			cityTime.hour = cityTime.hour+8;
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
