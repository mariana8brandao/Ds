import java.util.*;
public class App {
	public static void main (String[]args) {
	  Scanner sc= new Scanner(System.in);
	  leitorNome c= new leitorNome();
	  System.out.println("Digite o nome");
	  
		String nome = sc.nextLine();
		nome = sc.nextLine();
		System.out.println("Digite a idade");
		int idade = sc.nextInt();
		System.out.println("Digite o peso");
		double peso = sc.nextDouble();
		leitorNome user = new leitorNome();
		String[] a = user.Info(nome, idade, peso);
		for(int i=0; i<4; i++) {
			System.out.println(a[i]);
		}
  }
}
