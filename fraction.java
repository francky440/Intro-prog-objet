import java.util.Scanner;


public class fraction {
	private int numerateur;
    private int denominateur;
    
    
     public fraction (int num, int den){
		 if (den < 0 || num < 0){ 
			 System.out.println("impossible");
		}
		else {
			this.numerateur = num;
			this.denominateur = den;
		}
	}
    
	public String toString(){
		int n = this.numerateur;
		int d = this.denominateur;
		if( d  == 1){
			return this.numerateur;
		} else{
			return this.numerateur + "/" + this.denominateur;
		}
	}
	
	public fraction add( fraction f){
		fraction T;
		if(this.denominateur == f.denominateur){
			T.numerateur = this.numerateur + f.numerateur;
			T.denominateur = this.denominateur;
		} else {
			 } else {
			T.numerateur = (this.numerateur * f.denominateur + this.denominateur* f.numerateur);
			T.denominateur = this.denominateur * f.denominateur;
		}
	}
			
	public fraction mul( fraction f){
		fraction t;
		T.numerateur = this.numerateur * f.numerateur;
		T.denominateur = this.denominateur * f.denominateur;
	} 

	public boolean egale (fraction f){
		return this.numerateur == f.numerateur && this.denominateur == f.denominateur;
	} 

	public int compareTo(fraction f){
		if(this.numerateur * f.denominateur > this.denominateur * f.numerateur){
			return 7;
		}
		else if (this.numerateur * f.denominateur < this.denominateur * f.numerateur){
			return -7;
		}
			return 0;
	}

	public static main (){
		fration t = new fraction ( 4, 7);
		fraction e = new fraction( 5,2);
		e.toString;
		t.toString;
		e.add(t);
	}
	}

	
			
