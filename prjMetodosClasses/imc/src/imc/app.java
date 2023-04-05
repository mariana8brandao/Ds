package imc;
import java.util.*;
public class app {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		Calculadora c= new Calculadora();
		System.out.println("digite o seu peso");
		c.p=sc.nextInt();
		System.out.println("digite sua altura em cm");
		c.h=sc.nextInt();
		if(c.Imc()>40) {
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Obesidade (Grau III)");
		}
		else if(c.Imc()>35) {
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Obesidade (Grau II)");
		}
		else if(c.Imc()>30) {
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Obesidade (Grau I)");
		}
		else if(c.Imc()>25) {			
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Excesso de peso");
		}
		else if(c.Imc()>=18.5 | c.Imc()==18.5) {
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Peso normal");
		}
		else {
			System.out.println( "seu IMC é ="+c.Imc());
			System.out.println("Excesso de magreza");
		}

	}
}
