package jUnit;

public class Mcd {
	
	public int numDiv1;
	public int numDiv2;
	
	public Mcd(int n1, int n2) {
		numDiv1 = n1;
		numDiv2 = n2;
	}
	
	
	public int getNumDiv1() {
		return numDiv1;
	}

	public int getNumDiv2() {
		return numDiv2;
	}
	

	public void setNumDiv1(int n1) {
		this.numDiv1 = n1;
	}
	
	public void setNumDiv2(int n2) {
		this.numDiv2 = n2;
	}
	
	public int calculoMcd() {
		
		int resto;
		int result = 0;
		
		
		if( numDiv1 % numDiv2 == 0) {
			result = numDiv1 % numDiv2;
		}else
			while(numDiv1 != numDiv2) {
				if(numDiv1 > numDiv2) {
					numDiv1 -= numDiv2;
				}else {
					numDiv2 -= numDiv1;
				}
			}
			result = numDiv1;
		return result;
	}
	
}
	

