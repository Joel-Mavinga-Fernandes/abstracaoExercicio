package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List <Pessoa>list= new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n= sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite os dados do contribuinte #"+i);
			System.out.print("Pessoa Fisica ou Juridica (f/j)");
			char a = sc.next().charAt(0);
			if(a=='f') {
				
				System.out.print("Nome: ");
				String nome = sc.next();
				
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Gastos com saúde: ");
				double gastosSaude= sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}else if(a=='j') {
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Renda Anual: ");
				double rendaAnual = sc.nextDouble();
				System.out.print("Numero de funcionário: ");
				int numFuncionario = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionario));
			}
		}
		System.out.println();
		System.out.println("IMPOSTOS PAGOS");
		double imp=0.0;
		for(Pessoa pessoa: list) {
			System.out.println(pessoa.getNome()+": $"+pessoa.calculoImposto());
			  imp+=pessoa.calculoImposto();
		}
		
		System.out.println("TOTAL DE IMPOSTOS: "+ imp);
		
		sc.close();

	}

}
