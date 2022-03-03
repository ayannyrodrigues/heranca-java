package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceirizado;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		System.out.print("Digite o número de funcionários: ");
		int numeroFuncionarios = sc.nextInt();
		System.out.println();
		
		for(int cont = 1; cont <= numeroFuncionarios; cont++) {
			System.out.println("Dados Funcionário #" + cont + ":");
			System.out.print("O funcionário é terceirizado? (y/n)? ");
			char terceirizado = sc.next().charAt(0);
						
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas Trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			System.out.print("Valor por horas: ");
			Double valorPorHora = sc.nextDouble();		
				
			if(terceirizado == 'y') {
				System.out.print("Despesa Adicional: ");
				Double despesaAdicional = sc.nextDouble();
				
				Funcionario terc = new Terceirizado(nome, horasTrabalhadas, valorPorHora, despesaAdicional);	
				funcionarios.add(terc);
			}else {
				Funcionario func = new Funcionario(nome, horasTrabalhadas, valorPorHora);
				funcionarios.add(func);
			}
			
			System.out.println();
		}

		System.out.println("PAGAMENTOS: ");
		for(Funcionario f : funcionarios) {
			System.out.println(f.getNome() + " - $ " + String.format("%.2f", f.pagamento()));
		}
		
		sc.close();
	}

}
