package Polimorfisme;

class hewan{
	void suara(){
		System.out.println("Standar suaranya");
	}
}

class kucing extends hewan{
	void suara(){
		System.out.println("meo");
	}
}

class anjing extends hewan{
	void suara(){
		System.out.println("guk");
	}
	
}
public class contoh {
	

	public static void main(String[] args) {
	hewan h = new hewan();
	h.suara();
	hewan k = new kucing();
	k.suara();
	hewan a = new anjing();
	a.suara();
	

	}

}

