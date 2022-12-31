import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	int n, r, u;
	int total1=1, total2 = 1, total3=1;
	double kombinasyon;
	
	Scanner scanner = new Scanner(System.in);
	
    System.out.print("n sayısını giriniz: ");
    n = scanner.nextInt();
    System.out.print("r sayısını giriniz: ");
    r = scanner.nextInt();
    
    if(n>=r) {
    
	for(int i= 1; i<=n ; i++) {	
		total1 = total1 * i;
	}
	System.out.println( "n!: " + total1);
	
	for(int j= 1; j<=r ; j++) {	
		total2= total2 * j;
	}
	System.out.println( "r!: " + total2);
	
	u= n- r;
	for(int k= 1; k<=u ; k++) {	
		total3= total3 * k;
	}
	System.out.println("(n-r)!: "+ total3);
	
	kombinasyon = total1/(total2*total3);
	
	System.out.println("n nin r li ombinasyonu: " + kombinasyon);
	
    }
    else {
    	System.out.println("n sayısı r sayısından küçük seçilemez.");
    }
	
}

}
