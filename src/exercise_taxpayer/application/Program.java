package exercise_taxpayer.application;

import exercise_taxpayer.entities.Company;
import exercise_taxpayer.entities.Individual;
import exercise_taxpayer.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Criamos uma lista de contribuintes tipo TaxPayer e estanciamos (criamos essa lista com tipo genérico que irá aceitar todos os outros tipos)
        List<TaxPayer> list = new ArrayList<TaxPayer>();

        // Guarda quantidade de contribuintes digitado pelo usuário
        System.out.println("Enter the number of taxpayers: ");
        int N = sc.nextInt();

        // Aqui se inicia o raciocínio do polimorfismo (UPCASTING = variável do tipo mais genérico aceita o objeto do tipo mais específico)
        for (int i = 1; i <= N; i++) {
            System.out.println("Taxpayer #" + i + " data:");
            System.out.print("Individual or company (i/c)?");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if(type == 'i') {
                System.out.println("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.println("Number of employees: ");
                Integer numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        // Percorrer e imprimir lista
        System.out.println();
        System.out.println("TAXES PAID:");
        // Chamada polimórfica: comportamento diferente determinado em tempo de execução, com base no tipo da objeto.
        for (TaxPayer tp: list) {
            System.out.println(tp.getName() + ": $ " + String.format("%.2f", tp.tax()));
        }

        System.out.println();
        double sum = 0.0;
        for (TaxPayer tp: list) {
            sum += tp.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum) );

        sc.close();
    }
}
