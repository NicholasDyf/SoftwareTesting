package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import CoderHotel.*;

class CoderHotelTest {
	@BeforeAll
	@DisplayName("单元测试初始化")
	public static void init()
	{
		System.out.println("JUNIT5");
	}
	
	@AfterAll
	@DisplayName("单元测试结束")
	public static void stopTest()
	{
		System.out.println("JUNIT5 Test is over.");
	}
	
	@Test
	@DisplayName("测试时间字符串转化函数")
	void testStringToHandM() {
		TimeConverter test = new TimeConverter("05:20");
		assertEquals(05,test.getHour());
		assertEquals(20,test.getMinute());
	}

	@Test
	@DisplayName("测试调整北京时间")
	void testBeijingTime()
	{
		PhoneTime PHt = new PhoneTime("02:30");
		BeijingTime BJt = new BeijingTime(PHt);
		assertEquals(02,BJt.cityTime.getHour());
		assertEquals(30,BJt.cityTime.getMinute());
	}

	@Test
	@DisplayName("测试调整伦敦时间")
	void testLondonTime()
	{
		PhoneTime PHt = new PhoneTime("02:30");
		LondonTime LDt = new LondonTime(PHt);
		assertEquals(06,LDt.cityTime.getHour());
		assertEquals(30,LDt.cityTime.getMinute());
	}

	@Test
	@DisplayName("测试调整莫斯科时间")
	void testMoscowTime()
	{
		PhoneTime PHt = new PhoneTime("02:30");
		MoscowTime MCt = new MoscowTime(PHt);
		assertEquals(10,MCt.cityTime.getHour());
		assertEquals(30,MCt.cityTime.getMinute());
	}

	@Test
	@DisplayName("测试调整纽约时间")
	void testNewYorkTime()
	{
		PhoneTime PHt = new PhoneTime("02:30");
		NYCTime NYCt = new NYCTime(PHt);
		assertEquals(01,NYCt.cityTime.getHour());
		assertEquals(30,NYCt.cityTime.getMinute());
	}
	
	@Test
	@DisplayName("测试调整悉尼时间")
	void testSydneyTime()
	{
		PhoneTime PHt = new PhoneTime("02:30");
		SydneyTime SYDt = new SydneyTime(PHt);
		assertEquals(04,SYDt.cityTime.getHour());
		assertEquals(30,SYDt.cityTime.getMinute());
	}

	@Test
	@DisplayName("测试输入错误时间")
	void testWrongTime()
	{
		assertThrows(RuntimeException.class,()->new TimeConverter("2:20"));
	}
}
