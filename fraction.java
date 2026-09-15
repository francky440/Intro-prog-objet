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
			T.numerateur = this.numerateur * f.denominateur;
			T.denominateur = this.denominateur * f.numerateur;
		}
	}
			
