package questoes.src.questao09;

import questoes.src.questao09.entities.Venda;
import questoes.src.questao09.enums.MesDoAno;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Venda> vendas = new ArrayList<>();

        Venda venda1 = new Venda(150.00, LocalDate.of(2026, 1, 10));
        vendas.add(venda1);
        Venda venda2 = new Venda(320.50, LocalDate.of(2026, 1, 15));
        vendas.add(venda2);
        Venda venda3 = new Venda(89.90, LocalDate.of(2026, 1, 27));
        vendas.add(venda3);

        Venda venda4 = new Venda(450.00, LocalDate.of(2026, 2, 3));
        vendas.add(venda4);
        Venda venda5 = new Venda(275.75, LocalDate.of(2026, 2, 14));
        vendas.add(venda5);
        Venda venda6 = new Venda(120.00, LocalDate.of(2026, 2, 28));
        vendas.add(venda6);

        Venda venda7 = new Venda(600.00, LocalDate.of(2026, 3, 5));
        vendas.add(venda7);
        Venda venda8 = new Venda(199.90, LocalDate.of(2026, 3, 12));
        vendas.add(venda8);
        Venda venda9 = new Venda(350.00, LocalDate.of(2026, 3, 20));
        vendas.add(venda9);
        Venda venda10 = new Venda(75.50, LocalDate.of(2026, 3, 29));
        vendas.add(venda10);

        Venda venda11 = new Venda(50);
        vendas.add(venda11);
        Venda venda12 = new Venda(30);
        vendas.add(venda12);
        Venda venda13 = new Venda(180.50);
        vendas.add(venda13);
        Venda venda14 = new Venda(300);
        vendas.add(venda14);

        double maiorFaturamento = 0;
        MesDoAno mesComMaiorFaturamento = null;
        for (Venda vendaBase : vendas) {
            double faturamentoMes = vendaBase.getValor();
            for (Venda vendaComparada : vendas) {
                if (vendaComparada.getMesDaVenda().equals(vendaBase.getMesDaVenda())
                        && !vendaComparada.equals(vendaBase))
                {
                    faturamentoMes += vendaComparada.getValor();
                }
            }
            if (faturamentoMes > maiorFaturamento){
                maiorFaturamento = faturamentoMes;
                mesComMaiorFaturamento = vendaBase.getMesDaVenda();
            }
        }

        for (Venda venda : vendas) {
            IO.println(venda.toString());
            IO.println("-------------------------------------------------------");
        }

        IO.println("Mês com maior faturamento: " + mesComMaiorFaturamento);
        IO.println("Faturamento total: R$" + maiorFaturamento);
    }
}
