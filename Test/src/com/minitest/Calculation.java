package com.minitest;

public class Calculation {
	Multiple mup ;
	public Calculation(Multiple mup ){
		this.mup = mup;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculation cal = new Calculation(new NewMultipleImpl());
		for(int i =1 ;i <= 100; i++){
			System.out.println(cal.multiple(i));
		}
	}
	
	private String multiple (int num) {
		String rs = mup.genFizz(num) + mup.genBuzz(num);
		if(rs.length() > 0){
			return rs;
		} 
		return num+"";
	}
}
