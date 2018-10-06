
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
			int d=Integer.parseInt(args[3]);
			int e=Integer.parseInt(args[4]);
			int szorzat=a*b;
			double hanyados=(double) c/b;
			double atlag=(double)(a+b+c+d+e)/5;
			System.out.println("térfogat= "+a*b*c);
			
			System.out.println("felszín= "+2*(a*b+b*c+a*c));
			
			System.out.println("összeg: "+(a+b));
			System.out.println("különbség: "+(a+b));
			System.out.println("szorzat: "+szorzat);
			System.out.println("hanyados: "+hanyados);
			System.out.println("átlag: "+atlag);
			
			int f=Integer.parseInt(args[5]);
			int g=Integer.parseInt(args[6]);
			int h=Integer.parseInt(args[7]);
			
			double x1=(-g+Math.sqrt(g*g-4*f*h))/2*f;
			double x2=(-g-Math.sqrt(g*g-4*f*h))/2*f;
			System.out.println("x1= "+x1);
			System.out.println("x2= "+x2);
			
		
	}

}
