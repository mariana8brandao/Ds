
package imc;

public class Calculadora {
	 double p;
	 double h;
	 double r1, r2;
	 
	 public double Imc() {
		 r1= p/(h*h);
		 r2= r1*10000;
		 return r2;
	 }
	 
}
 
