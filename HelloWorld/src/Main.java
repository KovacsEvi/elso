
public class Main {

	/**
	 * Eza metódus azért felelős, hogy...
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int szorzat=a*b;
			double hanyados=(double) c/b;
			System.out.println("térfogat= "+a*b*c);
			
			System.out.println("felszín= "+2*(a*b+b*c+a*c));
			
			System.out.println("összeg: "+(a+b));
			System.out.println("különbség: "+(a+b));
			System.out.println("szorzat: "+szorzat);
			System.out.println("hanyados: "+hanyados);
			
			
		
	}

}
