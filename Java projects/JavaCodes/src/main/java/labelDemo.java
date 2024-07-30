
public class labelDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		x_lbl:
			for(int i=1;i<11;i++) {
				for(int j=1;j<11;j++) {
					if(i%2 == 0) {
						continue x_lbl;
					}
					System.out.println(i + "x" + j + "="+(i*j));
				}
			}
	}
 
}