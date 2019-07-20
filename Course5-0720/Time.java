/*
 * Time	存储 时-分-秒 信息
 * 原则: 一切从用户角度出发
 * 功能：
 *		1） 初始化
 *			i.	传入时/分/秒
 *			2.  不传，今天		回头
 *		2） 多少秒之后的时/分/秒
 *		3） 多少秒之前的时/分/秒
 */
public class Time {
	public int hour = 0;
	public int minute = 0;
	public int second = 0;
	
	public Time (int hour,int minute,int second){
		if(hour < 0 || hour > 23){
			System.out.println("小时不对");
		}
		
		if(minute < 0 || minute > 59){
			System.out.println("分钟不对");
		}
		
		if(second < 0 || second > 59){
			System.out.println("秒不对");

		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//计算之后的
	public Time after(int seconds){
		second += seconds;
		while(second > 59){
			second -= 60;
			minute++;
			if(minute > 59){
				minute = 0;
				hour++;//小时加1，分钟从0开始
			}
			if(hour > 23){
				hour = 0;
			}
		}
		return this;
	}
	//计算之前的
	public Time before(int seconds){
		second += seconds;
		while (second < 0){
			second += 60;
			minute--;
			if(minute < 0){
				minute = 59;
				hour--;//小时减1，分钟从59开始
			}
			if(hour < 0){
				hour = 23;
			}
		}
		return this;
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	public static void main(String[] args){
		Time t = new Time(23,02,10);
		//Time r = t.after(1200);
		Time r = t.before(-290);
		System.out.println(r.toString());
	}
	
}