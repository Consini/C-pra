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
	private int year = 0;
	private int month = 0;
	private int day = 0;
	//final 表示不可变
	private static final int[] DAYS_OF_MONTH= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//每个月份的天数不同，定义数组存储
	//构造方法
	// 年支持的范围 [1840, 2020]
	// 月支持的范围 [1, 12]
	// 日支持的范围
	public Date (int year,int month,int day){
		//判断年份是否在范围内
		if( year < 1840 || year > 2030){
			System.err.println("年份未在范围内");
			return ;
		}
		//判断月份是否在范围内
		if( month < 1 || month > 12){
			System.err.println("月份错误！");
			return ;
		}
		//判断天数
		if( day < 1 || day > calcDaysOfMonth(year,month)){
			System.err.println("天数不对！");
			return ;
		}
		
		this.year = year;
		this.month = month;
		this.day = day;
	}
	private static int calcDaysOfMonth(int year,int month){
		//如果不是二月份，则返回数组对应月份的内容
		if(month != 2){
			return DAYS_OF_MONTH[month-1];
		}
		if(isLeapYear(year)){
			return 29;
		}else{
			return 28;
		}
	}
	
	//判断是否为闰年
	private static boolean isLeapYear(int year){
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		return false;
	}
	
	//计算给定日期之后days天的日期
	public	Date immutableAfter(int days){
		if(days < 0){
			System.out.println("不允许小于0！");
			return null;
		}
		Date after = new Date(year, month, day);
		after.day += days;
		while( after.day > calcDaysOfMonth(after.year,after.month)){
			after.day -= calcDaysOfMonth(after.year,after.month);
			after.month++;
			if(after.month > 12){
				after.month = 1;
				after.year++;
			}
		}
		return after;
	}
	
	//计算给定日期相差days天之前的日期
	public Date immutableBefore(int days){
		if(days > 0){
			System.out.println("不允许大于0！");
			return null;
		}
		Date before = new Date (year, month, day);
		before.day += days;
		while(before.day < 1){
			before.month--;			
			if(before.month < 1){
				before.month = 12;
				before.year--;
			}
			before.day += calcDaysOfMonth(before.year,before.month);//放在后面，day加的是前一个月份的天数，
		}
		return before;
	}
	
	//计算相差多少天
	public static int diff(Date a, Date b){
		int days = 0;
		if(a.year - b.year >= 2 ){
			days = a.day + calcDaysOfMonth(b.year,b.month)-b.day;
			for(int k = b.year+1 ;k < a.year;k++){
				if(isLeapYear(k)){
					days += 366;
				}else{
					days += 365;
				}
			} 
		}
		if( b.year - a.year >= 2){
			days = b.day + calcDaysOfMonth(a.year,a.month)-a.day;
			for(int k = a.year+1 ;k < b.year;k++){
				if(isLeapYear(k)){
					days += 366;
				}else{
					days += 365;
				}
			} 
		}
		if(a.year >= b.year){
			for(int i = 1;i < a.month;i++){
				days += calcDaysOfMonth(a.year, i);
			}
		
			for(int j = 12; j > b.month;j--){
				days += calcDaysOfMonth(b.year, j);
			}
			return days;
		}else{
			for(int i = 1;i < b.month;i++){
				days += calcDaysOfMonth(b.year, i);
			}
		
			for(int j = 12; j > a.month;j--){
				days += calcDaysOfMonth(a.year, j);
			}
			return -days;
		}	
	}
	
	public String toString(){
		return String.format("%04d-%02d-%02d", year, month, day);
	}

	public static void main(String[] args){
		Date now = new Date(2019, 1, 22);
		Date after = now.immutableAfter(800);
		Date before = now.immutableBefore(-100);
		System.out.println(before.toString());
		System.out.println(after.toString());	
		System.out.println(diff(before, after));
	}
}