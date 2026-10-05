package questoes.src.questao07;

import questoes.src.questao07.entities.Departamento;
import questoes.src.questao07.entities.Funcionario;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args) {

        Funcionario funcionario1 = new Funcionario(
                "F001",
                "João Silva",
                2500.00
        );

        Funcionario funcionario2 = new Funcionario(
                "F002",
                "Maria Santos",
                3200.00,
                LocalDate.of(2023, 3, 15)
        );

        Funcionario funcionario3 = new Funcionario(
                "F003",
                "Pedro Oliveira",
                2800.00
        );

        Funcionario funcionario4 = new Funcionario(
                "F004",
                "Ana Souza",
                4100.00,
                LocalDate.of(2022, 8, 10)
        );

        Funcionario funcionario5 = new Funcionario(
                "F005",
                "Carlos Pereira",
                3500.00
        );

        Funcionario funcionario6 = new Funcionario(
                "F006",
                "Juliana Costa",
                2900.00,
                LocalDate.of(2024, 1, 22)
        );

        Funcionario funcionario7 = new Funcionario(
                "F007",
                "Lucas Almeida",
                4500.00
        );

        Funcionario funcionario8 = new Funcionario(
                "F008",
                "Fernanda Lima",
                3800.00,
                LocalDate.of(2021, 11, 5)
        );

        Funcionario funcionario9 = new Funcionario(
                "F009",
                "Rafael Martins",
                2700.00
        );

        Funcionario funcionario10 = new Funcionario(
                "F010",
                "Beatriz Rodrigues",
                5000.00,
                LocalDate.of(2020, 6, 18)
        );

        Funcionario funcionario11 = new Funcionario(
                "F011",
                "Guilherme Guimarães",
                5000
        );

        Funcionario funcionario12 = new Funcionario(
                "F012",
                "João Lemos",
                7500, LocalDate.of(2024, 4, 1)
        );


        Departamento departamento = new Departamento("Marketing", "0012");
        departamento.resgistrarFuncionarioAntigo(funcionario1);
        departamento.contratarFuncionario(funcionario2);
        departamento.resgistrarFuncionarioAntigo(funcionario3);
        departamento.contratarFuncionario(funcionario4);
        departamento.resgistrarFuncionarioAntigo(funcionario5);
        departamento.contratarFuncionario(funcionario6);
        departamento.resgistrarFuncionarioAntigo(funcionario7);
        departamento.contratarFuncionario(funcionario8);
        departamento.resgistrarFuncionarioAntigo(funcionario9);
        departamento.contratarFuncionario(funcionario10);
        departamento.resgistrarFuncionarioAntigo(funcionario11);
        departamento.contratarFuncionario(funcionario12);

        departamento.listarFuncionarios();
        double folhaSalarial = departamento.calcularFolhaSalarial();
        IO.println("Folha salarial: R$" + folhaSalarial);
        IO.println("Funcionário com maior salário: " + departamento.funcionarioComMaiorSalario());
        IO.println("Total de funcionários admitidos em 2024: " +
                departamento.totalDeFuncionariosAdmitidos(2026) + " funcionários."
        );
    }
}
