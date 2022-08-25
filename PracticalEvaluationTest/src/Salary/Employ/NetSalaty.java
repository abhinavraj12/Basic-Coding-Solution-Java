package Salary.Employ;
public class NetSalaty  {
	
	public static int basicSalary = 30000;
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		float netSalary = (basicSalary+a.HRA+b.DA)-c.PF;
		System.out.println(netSalary);
	}

}
