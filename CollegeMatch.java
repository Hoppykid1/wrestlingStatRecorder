package application;

public class CollegeMatch extends Match{

	//declaring the variables for every period of the match
	public int red_first_period;
	public int red_second_period;
	public int red_third_period;
	public int red_ot_1;
	public int red_ot_2;
	public int red_ot_3;
	public int red_ot_4;
	public int red_ot_5;
	public int red_ot_6;
	
	public int green_first_period;
	public int green_second_period;
	public int green_third_period;
	public int green_ot_1; 
	public int green_ot_2;
	public int green_ot_3;
	public int green_ot_4;
	public int green_ot_5;
	public int green_ot_6;
	//Constructor
	public CollegeMatch() {
		//setting the initial score in each period
		this.red_first_period = 0;
		this.red_second_period = 0;
		this.red_third_period = 0;
		this.red_ot_1 = 0;
		this.red_ot_2 = 0;
		this.red_ot_3 = 0;
		this.red_ot_4 = 0;
		this.red_ot_5 = 0;
		this.red_ot_6 = 0;
		this.green_first_period = 0;
		this.green_second_period = 0;
		this.green_third_period = 0;
		this.green_ot_1 = 0;
		this.green_ot_2 = 0;
		this.green_ot_3 = 0;
		this.green_ot_4 = 0;
		this.green_ot_5 = 0;
		this.green_ot_6 = 0;
	}
	@Override
	public int redPeriod1() {
		//returns the score of the first period of the match
		red_first_period = super.rp1;
		return red_first_period;
	}
	
	@Override
	public int redPeriod2() {
		//returns the score of the second period of the match
		red_second_period = super.rp2;
		return red_second_period;
	}

	@Override
	public int redPeriod3() {
		//returns the score of the third period of the match
		red_third_period = super.rp3;
		return red_third_period;
	}

	@Override
	public int redPeriod4() {
		//returns the score of ot1
		red_ot_1 = super.rp4;
		return red_ot_1;
	}

	@Override
	public int redPeriod5() {
		//returns the score of ot2
		red_ot_2 = super.rp5;
		return red_ot_2;
	}

	@Override
	public int redPeriod6() {
		//returns the score of ot3
		red_ot_3 = super.rp6;
		return red_ot_3;
	}

	@Override
	public int redPeriod7() {
		//returns the score of ot4
		red_ot_4 = super.rp7;
		return red_ot_4;
	}

	@Override
	public int redPeriod8() {
		//returns the score of ot5
		red_ot_5 = super.rp8;
		return red_ot_5;
	}

	@Override
	public int redPeriod9() {
		//returns the score of ot6
		red_ot_6 = super.rp9;
		return red_ot_6;
	}
	
	public int greenPeriod1() {
		green_first_period = super.gp1;
		return green_first_period;
	}
	
	public int greenPeriod2() {
		green_second_period = super.gp2;
		return green_second_period;
	}
	
	public int greenPeriod3() {
		green_third_period = super.gp3;
		return green_third_period;
	}
	
	public int greenPeriod4() {
		green_ot_1 = super.gp4;
		return green_ot_1;
	}
	
	public int greenPeriod5() {
		green_ot_2 = super.gp5;
		return green_ot_2;
	}
	
	public int greenPeriod6() {
		green_ot_3 = super.gp6;
		return green_ot_3;
	}
	
	public int greenPeriod7() {
		green_ot_4 = super.gp7;
		return green_ot_4;
	}
	
	public int greenPeriod8() {
		green_ot_5 = super.gp8;
		return green_ot_5;
	}
	
	public int greenPeriod9() {
		green_ot_6 = super.gp9;
		return green_ot_6;
	}
}
