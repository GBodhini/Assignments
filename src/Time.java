public class Time{
	private int hours;
	private int minutes;
	private int seconds;
 	public void setHours(int hours){
		this.hours=hours;
	}
	public void setMinutes(int minutes){
		this.minutes=minutes;
	}
	public void setSeconds(int seconds){
		this.seconds=seconds;
	}
	
	public int getHours(){
		return hours;
	}
	public int getMinutes(){
		return minutes;
	}
	public int getSeconds(){
		return seconds;
	}

	public void incrementTime(){
		seconds++;
		if(seconds>=60){
			seconds=0;
			minutes++;
		if(minutes>=60){
			minutes=0;
			hours++;
		if(hours>23){
			hours=0;
		}
	}
   }
	
   }
public String toString(){
	String timeString=String.format("%02d:%02d:%02d",hours,minutes,seconds);
	return timeString;
}
	
	public static void main(String[] args){
		Time time=new Time();
		time.setHours(01);
		time.setMinutes(59);
		time.setSeconds(59);
		time.incrementTime();
		System.out.println(time.toString());
		
}
}