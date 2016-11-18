package edk.pl.calc;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("podaj a");
		String a = System.console().readLine();
		System.out.println("podaj b");
		String b = System.console().readLine();

		double ad=Double.parseDouble(a);
		double bd=Double.parseDouble(b);
		double res =ad+bd;
		String resStr =  new Double(res).toString();
		
		System.out.println("Suma = " + resStr);
	}

}
