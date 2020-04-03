package application;

public class CollegeMatch implements Match{

	//declaring the variables for every
	public double red_first_period;
	public double red_second_period;
	public double red_third_period;
	public double red_ot_1;
	public double red_ot_2;
	public double red_ot_3;
	public double red_ot_4;
	public double red_ot_5;
	public double red_ot_6;
	
	public double green_first_period;
	public double green_second_period;
	public double green_third_period;
	public double green_ot_1; 
	public double green_ot_2;
	public double green_ot_3;
	public double green_ot_4;
	public double green_ot_5;
	public double green_ot_6;
	//Constructor
	public CollegeMatch() {
		//setting the initial score in each period
		red_first_period = 0;
		red_second_period = 0;
		red_third_period = 0;
		red_ot_1 = 0;
		red_ot_2 = 0;
		red_ot_3 = 0;
		red_ot_4 = 0;
		red_ot_5 = 0;
		red_ot_6 = 0;
		green_first_period = 0;
		green_second_period = 0;
		green_third_period = 0;
		green_ot_1 = 0;
		green_ot_2 = 0;
		green_ot_3 = 0;
		green_ot_4 = 0;
		green_ot_5 = 0;
		green_ot_6 = 0;
	}

	@Override
	public double redPeriod1() {
		//returns the length of the first period of the match
		return red_first_period;
	}

	@Override
	public double redPeriod2() {
		//returns the length of the second period of the match
		return red_second_period;
	}

	@Override
	public double redPeriod3() {
		//returns the score of the third period of the match
		return red_third_period;
	}

	@Override
	public double redPeriod4() {
		//returns the score of ot1
		return red_ot_1;
	}

	@Override
	public double redPeriod5() {
		//returns the score of ot2
		return red_ot_2;
	}

	@Override
	public double redPeriod6() {
		//returns the score of ot3
		return red_ot_3;
	}

	@Override
	public double redPeriod7() {
		//returns the score of ot4
		return red_ot_4;
	}

	@Override
	public double redPeriod8() {
		//returns the score of ot5
		return red_ot_5;
	}

	@Override
	public double redPeriod9() {
		//returns the score of ot6
		return red_ot_6;
	}
	
	public double greenPeriod1() {
		return green_first_period;
	}
	
	public double greenPeriod2() {
		return green_second_period;
	}
	
	public double greenPeriod3() {
		return green_third_period;
	}
	
	public double greenPeriod4() {
		return green_ot_1;
	}
	
	public double greenPeriod5() {
		return green_ot_2;
	}
	
	public double greenPeriod6() {
		return green_ot_3;
	}
	
	public double greenPeriod7() {
		return green_ot_4;
	}
	
	public double greenPeriod8() {
		return green_ot_5;
	}
	
	public double greenPeriod9() {
		return green_ot_6;
	}
}
