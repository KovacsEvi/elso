
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
			
			if (a%2==0) {
				System.out.println(a+" páros");
			}
			else {
				System.out.println(a+" páratlan");
			}
		
			if (a%2==0) {
				System.out.println(a+" osztható 2-vel");}
			else {System.out.println(a+" nem osztható 2-vel");}
			if (a%3==0) {
				System.out.println(a+" osztható 3-mal");}
			else {System.out.println(a+" nem osztható 3-mal");}
			if (a%5==0) {
				System.out.println(a+" osztható 5-tel");}
				else {System.out.println(a+" nem osztható 5-tel");}
			
			//háromszög szerkeszthető-e
			if (a+b>c&&b+c>a&&a+c>b) {
				System.out.println("Az oldalak: "+a+" "+b+" "+c+" A háromszög szerkeszthető.");
			}
			else {
				System.out.println("Az oldalak: "+a+" "+b+" "+c+" A háromszög nem szerkeszthető.");
			}
			
			//eldönti hány jegyű
			
			int k=Integer.parseInt(args[8]);
			
			if (k>0&&k<1000000) {
				if (k>0&&k<10) {
					System.out.println("egy jegyű");
				}
				else if (k>=10&&k<100) {
					System.out.println("két jegyű");
				}
				else if (k>=100&&k<1000) {
					System.out.println("három jegyű");
				}
				else if (k>1000&&k<10000) {
					System.out.println("négy jegyű");
				}
				else if (k>=10000&&k<100000) {
					System.out.println("öt jegyű");
				}
				else if (k>=100000&&k<1000000) {
					System.out.println("hat jegyű");
				}
				
			}else System.out.println("A szám nem 1 és 1000000 közé esik");
	
			//ugyanez stringgel:
			
			char[]teszt=args[8].toCharArray();
			if(teszt[0]=='-') {
				System.out.println("ennyi számjegyű: "+(teszt.length-1));
			}
			else {
				System.out.println("ennyi számjegyű: "+(teszt.length));
			}
					
			
			// 5.feladat:Melyik a nagyobb?
			
			if (a>b) {
				System.out.println(a+" nagyobb, mint "+b);
			}
			else if (a<b) {
				System.out.println(b+" nagyobb, mint "+a);
			}
			else 
			{
				System.out.println("a két szám egyenlő");
			}
			
			//visszaszámol
			
			if (a>0) {
			switch (a) {
			case(9):
				System.out.println("nyolc, hét, hat, öt, négy, három, kettő, egy, nulla");
			break;
			case(8):
				System.out.println("hét, hat, öt, négy, három, kettő, egy, nulla");
			break;
			case(7):
				System.out.println("hat, öt, négy, három, kettő, egy, nulla");
			break;
			case(6):
				System.out.println("öt, négy, három, kettő, egy, nulla");
			break;
			case(5):
				System.out.println("négy, három, kettő, egy, nulla");
			break;
			case(4):
				System.out.println("három, kettő, egy, nulla");
			break;
			case(3):
				System.out.println("kettő, egy, nulla");
			break;
			case(2):
				System.out.println("egy, nulla");
			break;
			case(1):
				System.out.println("nulla");
			break;
			default:
				System.out.println("a szám túl nagy");}
			}
			else 
			{
				System.out.println("nullánál nagyobb számot adj meg!");
			}
				
			
			
	}
	
	

}
