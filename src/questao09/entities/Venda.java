package questoes.src.questao09.entities;

import questoes.src.questao09.enums.MesDoAno;

import java.time.LocalDate;
import java.util.UUID;

public class Venda {

    private static UUID ID;
    private double valor;
    private LocalDate dataVenda;
    private MesDoAno mesDaVenda;

    public Venda(double valor) {
        this.ID = UUID.randomUUID();
        this.valor = valor;
        this.dataVenda = LocalDate.now();
        this.mesDaVenda = MesDoAno.numeroParaMes(dataVenda.getMonthValue());
    }
    public Venda(double valor, LocalDate dataVenda) {
        this.ID = UUID.randomUUID();
        this.valor = valor;
        this.dataVenda = dataVenda;
        this.mesDaVenda = MesDoAno.numeroParaMes(dataVenda.getMonthValue());
    }

    public static UUID getID() {
        return ID;
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public MesDoAno getMesDaVenda(){
        return mesDaVenda;
    }

    public void corrigirValorDeVenda(double novoValor){
        setValor(novoValor);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "valor=" + valor +
                ", dataVenda=" + dataVenda +
                ", mesDaVenda=" + mesDaVenda +
                '}';
    }
}
