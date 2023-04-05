package tabuadaClasses;
import java.util.*;
public class App {
	 public static void main (String[]args) {
		 Scanner sc= new Scanner (System.in);
		 Calculadora c= new Calculadora();
		 System.out.println("Digite o número que deseja saber a tabuada");
		 c.n = sc.nextInt();
		 c.Calculo();
		 
	 }
}
