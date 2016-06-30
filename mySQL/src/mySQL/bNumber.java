package mySQL;


public class bNumber{
	private int number;
	private boolean assigned;
	
	public bNumber(){
		number = 0;
		assigned = false;
	}
	public bNumber(int n){
		number = n;
		assigned = false;
	}
	
	public void assignNumber(){
		assigned = true;
	}
	public boolean checkAssigned(){
		return assigned;
	}
	public void setNumber(int i){
		number = i;
	}
	public int getNumber(){
		return number;
	}
	
}//end of bNumber

