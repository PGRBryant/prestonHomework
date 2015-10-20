package assign416;

public class MilitaryTime {
	
	private static int first;
	private static int second;
	
	final static int MAX_TIME_IN_DAY = 2400;
	final static int MINUTES_IN_HOUR = 60;
	
	public MilitaryTime(int f, int s) {
		first = f;
		second = s;
	}
	
	/*
	 * This method is designed to return the military time apart, as an integer...
	 */
	public int timeApart() {
		//just making all the variables at once
		int f_minutes, f_hours, s_minutes, s_hours, err, diff_hours, diff_minutes, max_hours, max_minutes;
		
		//breaking out the time elements
		f_minutes = first%100;
		f_hours = first/100;
		s_minutes = second%100;
		s_hours = second/100;
		
		//for second times being the following day
		max_hours = MAX_TIME_IN_DAY/100;
		max_minutes = MAX_TIME_IN_DAY%100;
		
		//fancy stuff to check for improper formatting
		err = -1;
		if(f_hours > 24 || f_minutes > 60 || s_hours > 24 || s_minutes > 60)
			return err;
		
		if(first < second) {
			//figure out time delay
			diff_hours = (s_hours - f_hours);
			diff_minutes = (s_minutes - f_minutes);
		} else {
			//figure out time delay, again
			diff_hours = (max_hours - f_hours + s_hours);
			diff_minutes = (max_minutes - f_minutes + s_minutes);
		}
		
		//deal with rolling over minutes
		//have to deal with minutes being odd (like 545 and 630)
		if (diff_minutes < 0) { //are negative
			diff_hours -= 1;
			diff_minutes = MINUTES_IN_HOUR + diff_minutes;
		}
		
		return (diff_hours)*100 + diff_minutes; 	
	}
	
}
