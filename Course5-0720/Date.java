/*
 * Date 	存储 年-月-日 信息
 * 原则: 一切从用户角度出发
 * 功能：
 *		1） 初始化
 *			i.	传入年/月/日
 *			2.  不传，今天		回头
 *		2） 多少天之后的年/月/日
 *		3） 多少天之前的年/月/日
 */
public class Date {
	public int year = 0;
	public int month = 0;
	public int day = 0;
	
	public int[] day_of_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//每个月份的天数不同，定义数组存储
	//构造方法
	// 年支持的范围 [1840, 2020]
	// 月支持的范围 [1, 12]
	// 日支持的范围
	public Date (int year,int month,int day){
		//判断年份是否在范围内
		if( year < 1840 || year > 2020){
			System.out.println("年份未在范围内");
		}
		//判断月份是否在范围内
		if( month < 1 || month > 12){
			System.out.println("月份错误！");
		}
		//判断天数
		if( day < 1 || day > calcDaysOfMonth(year,month)){
			System.out.println("天数不对！");
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int calcDaysOfMonth(int year,int month){
		//如果不是二月份，则返回数组对应月份的内容
		if(month != 2){
			return day_of_month[month-1];
		}
		if(isLeapYear(year)){
			return 29;
		}else{
			return 28;
		}
	}
	
	//判断是否为闰年
	public boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		return false;
	}
	
	//计算给定日期之后adays天的日期
	public	Date after(int days){
		day += days;
		while( day > calcDaysOfMonth(year,month)){
			day -= calcDaysOfMonth(year,month);
			month++;
			if(month > 12){
				month = 1;
				year++;
			}
		}
		return this;
	}
	
	//计算给定日期相差days天之前的日期
	public Date before(int days){
		day += days;
		while(day < 1){
			day += calcDaysOfMonth(year,month);
			month--;
			if(month < 1){
				month = 12;
				year--;
			}
		}
		return this;
	}
	
	public String toString(){
		return String.format("%04d-%02d-%02d", year, month, day);
	}

	public static void main(String[] args){
		Date d = new Date(2019, 12, 1);
		Date r = d.after(100);
		System.out.println(r.toString());
		// r = d.before(-80);		
		// System.out.println(r.toString());
	}
}