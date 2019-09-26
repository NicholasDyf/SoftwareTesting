package CoderHotel;

public abstract class CityTime {
	public TimeConverter cityTime;
	protected String cityName;
	public CityTime(PhoneTime phoneTime) {
		cityTime = new TimeConverter(phoneTime.getPhoneTime().getHour(),
				phoneTime.getPhoneTime().getMinute());
		updateTime(phoneTime);
	}
	public abstract void updateTime(PhoneTime stdTime);
	public abstract void printTime();
}
