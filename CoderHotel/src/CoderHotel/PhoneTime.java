package CoderHotel;

public class PhoneTime{
	private TimeConverter phoneTime;
	public PhoneTime(String aTime)
	{
		phoneTime = new TimeConverter(aTime);
	}
	public TimeConverter getPhoneTime() {
		return phoneTime;
	}
	public void setPhoneTime(String phoneTime) {
		this.phoneTime = new TimeConverter(phoneTime);
		PhoneTime setTime = new PhoneTime(phoneTime);
		CityTime[] cities = new CityTime[5];
		cities[0] = new BeijingTime(setTime);
		cities[1] = new NYCTime(setTime);
		cities[2] = new SydneyTime(setTime);
		cities[3] = new MoscowTime(setTime);
		cities[4] = new LondonTime(setTime);
	}
}
