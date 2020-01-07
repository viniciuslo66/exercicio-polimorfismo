package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;
import Entidades.EmpregadoTerc;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Empregado> lista = new ArrayList<>();

		System.out.print("Entre com o numero de empregados: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Empregado #" + i);

			System.out.print("Tercerizado (y/n)? ");
			char ch = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Horas: ");
			int horas = sc.nextInt();

			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Valor adicionar: ");
				double cobrancaAdicional = sc.nextDouble();
				lista.add(new EmpregadoTerc(nome, horas, valorPorHora, cobrancaAdicional));
			} else {
				lista.add(new Empregado(nome, horas, valorPorHora));
			}

		}

		System.out.println();
		System.out.println("Pagamentos: ");

		for (Empregado emp : lista) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.pagamento()));
		}
		sc.close();
	}

}
