package CoderHotel;

public class BeijingTime extends CityTime{

	public BeijingTime(PhoneTime phoneTime) {
		super(phoneTime);
		// TODO Auto-generated constructor stub
		cityName = "Beijing";
	}

	@Override
	public void updateTime(PhoneTime stdTime) {
		// TODO Auto-generated method stub
		cityTime.hour = stdTime.getPhoneTime().hour;
	}

	@Override
	public void printTime() {
		// TODO Auto-generated method stub
		System.out.println(cityName + "'s time is " + 
		String.format("%02d",cityTime.getHour())+":"+
				String.format("%02d",cityTime.getMinute()));
	}

}
