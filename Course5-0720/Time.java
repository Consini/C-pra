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
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	
	public Time (int hour,int minute,int second){
		if(hour < 0 || hour > 23){
			System.err.println("小时不对");
			return ;
		}
		
		if(minute < 0 || minute > 59){
			System.err.println("分钟不对");
			return;
		}
		
		if(second < 0 || second > 59){
			System.err.println("秒不对");
			return;
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	//计算之后的
	public Time immutableAfter(int seconds){
		if(seconds < 0){
			System.out.println("不允许小于0！");
			return null;
		}
		Time other = new Time(hour, minute, second);
		other.second += seconds;
		while(other.second > 59){
			other.second -= 60;
			other.minute += 1;
			if(other.minute > 59){
				other.minute = 0;
				other.hour += 1;//小时加1，分钟从0开始
			}
			if(other.hour > 23){
				other.hour = 0;
			}
		}
		return other;
	}
	//计算之前的
	public Time immutableBefore(int seconds){
		if(seconds > 0){
			System.out.println("不允许大于0！");
			return null;
		}
		Time other = new Time(hour, minute, second);
		other.second += seconds;
		while (other.second < 0){
			other.second += 60;
			other.minute--;
			if(other.minute < 0){
				other.minute = 59;
				other.hour--;//小时减1，分钟从59开始
			}
			if(other.hour < 0){
				other.hour = 23;
			}
		}
		return other;
	}
	//相差多少秒
	public static int diff1(Time a,Time b){
		return (a.hour - b.hour)*3600 + (a.minute - b.minute)*60 + (a.second - b.second);
	}
	public static Time diff2(Time a,Time b){
		Time diff = new Time(0,0,0);
		diff.hour = (a.hour - b.hour);
		diff.minute = (a.minute - b.minute);
		diff.second = (a.second - b.second);
		return  diff;
	}
	
	public String toString(){
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	public static void main(String[] args){
		Time now = new Time(23,20,10);
		Time after = now.immutableAfter(200);
		Time before = now.immutableBefore(-290);
		System.out.println(after.toString());
		System.out.println(before.toString());
		System.out.println(diff1(before,after));
		System.out.println(diff2(before,after).toString());
	}
	
}