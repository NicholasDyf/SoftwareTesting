package CoderHotel;

public class TimeConverter {
	protected int hour;
	protected int minute;
	public TimeConverter(String aTime)
	{
		try {
		hour = Integer.parseInt(aTime.substring(0, 2));
		minute = Integer.parseInt(aTime.substring(3, 5));
		}catch(Throwable t)
		{
			throw new RuntimeException("输入时间格式不正确");
		}
	}

	TimeConverter(int h,int m)
	{
		hour = h;
		minute = m;
	}
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public void setTime(String newTime)
	{
		hour = Integer.parseInt(newTime.substring(0, 2));
		minute = Integer.parseInt(newTime.substring(3, 5));
	}
	/**
	public static void main(String[] args)
	{
		TimeConverter test = new TimeConverter("11:20");
		System.out.print(test.hour+":"+test.minute);
	}
	**/
}
