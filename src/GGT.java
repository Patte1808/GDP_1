
public class GGT {
	
	public static int ggT(int m, int n) {
		
		if(m < 0 || n < 0){
			System.out.println("nur positive ganze Zahlen als Argumente erlaubt");
			System.exit(-1);
		}
		
		if(m < n) {
			int tmpM = m;
			
			m = n;
			n = tmpM;
		}
		
		int r = m - n;
		m = n;
		n = r;
		
		if(r > 0) {
			return ggT(m, n);
		}
		
		return m;
	}
}
