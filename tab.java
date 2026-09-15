import java.util.Scanner;

public class tab {
	private String [] t; 
	private int d; 
	private int f;
	private int size;
	
	
	 public tab (int deb, int fin){
		 if ( deb > fin){ 
			 System.out.println("impossible");
		}
		else {
			this.d = deb;
			this.f = fin;
			this.size = fin - deb;
		}
		this.t = new String[size];
		}
		
	public int length() {
		return this.size;
	}
	
	public String get(int i){
		return t[i - d];
	 }
		
	public void set(int i, String s){
		t[i - d] = s;
	}
	
	public static void main(String[] args){
		tab t = new tab(3,6);
		System.out.println("longueur tableau"+ t.length());
		t.set(3,"Hello");
		System.out.println("indice 3"+ t.get(3));
	}
}
		
