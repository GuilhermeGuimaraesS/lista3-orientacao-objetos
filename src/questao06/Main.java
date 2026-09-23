package questoes.src.questao06;

import questoes.src.questao06.entities.Departamento;
import questoes.src.questao06.entities.Empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        ArrayList<Departamento> departamentos = new ArrayList<>();
        Empresa empresa = new Empresa("DevForce","123456", LocalDate.now(), departamentos);

        Departamento departamento = new Departamento("RH", "123");
        empresa.registrarDepartamento(departamento);

        departamento = new Departamento("Marketing", "456");
        empresa.registrarDepartamento(departamento);

        departamento = new Departamento("Diretoria", "789");
        empresa.registrarDepartamento(departamento);

        empresa.listarDepartamentos();

        IO.println("Digite o código do departamento: ");
        String codigo = entrada.nextLine();
        Departamento departamentoBuscado = empresa.buscarDepartamento(codigo);
        if (departamentoBuscado == null){
            IO.println("Departamento não encontrado!");
        } else {
            IO.println(departamentoBuscado.toString());
        }
        
        entrada.close();
    }

}
