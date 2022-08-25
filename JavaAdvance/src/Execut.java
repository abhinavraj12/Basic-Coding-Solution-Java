import Pack1.*;

class sub extends Test{
	int n =200;
	void dispsub() {
		System.out.println("Class sub");
		System.out.println("Val="+val);
		System.out.println("n="+n);
		
	}


}

public class Execut {

	public static void main(String[] args) {
		 //TODO Auto-generated method stub
		sub obj = new sub();
		obj.disp();
		obj.dispsub();
		Name obj2 = new Name();
		obj2.name();
			
	}

}
