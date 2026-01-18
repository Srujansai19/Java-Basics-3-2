package junit4;

public class Calci {
	Calculator cal;
	
	Calci (Calculator call){
		cal=call;
	}
	
	public int sum(int x, int y) {
		return cal.add(x,y);
	}
}
