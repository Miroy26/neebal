package Assignmentday4;
class Time {
	private int hours;
	private int minutes;
	private int seconds;
	Time(){	
		
	}
	Time(int h, int m, int s){
		this.hours=h;
		this.minutes=m;
		this.seconds=s;
	}
	public int getHours(){
		return this.hours;
	}
	public int getMinutes(){
		return this.minutes;
	}
	public int getSeconds(){
		return this.seconds;
	}
	public int getTimeInseconds()
	{	
		return hours*3600+minutes*60+seconds;
		
		
	}
	void getInHours(int s){
		hours=(s/3600)%24;
		s=s%3600;
		minutes=s/60;
		seconds=s%60;
	}
	public Time add (Time t){
		  Time a=new Time();
		  int total = this.getTimeInseconds() + t.getTimeInseconds();
		  a.getInHours(total);
		  return a;

	}
	
	public String toString() {
		return this.hours+":"+this.hours+":"+this.seconds+"";
	}
	public String convertIn12hours() {
		// TODO Auto-generated method stub
		int h=hours;
		String s;
		if(hours%12==0) {
			h=12;
			if(hours==0) {
				s="AM";
			}
			else {
				s="PM";
			}
		}
		else if(hours>12) {
			h=hours%12;
			s="PM";
		}
		else {
			s="PM";
		}
		return (hours+":"+minutes+":"+seconds+s);

	}
}



public class Timeconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time x=new Time(12,30,25);
		Time y=new Time(19,20,35);
		Time z=x.add(y);
		String timeMessage1=x.convertIn12hours();
		String timeMessage2=y.convertIn12hours();
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(timeMessage1);
		System.out.println(timeMessage2);
		

	}

}

