package questoes.src.questao09.enums;

public enum MesDoAno {
    JANEIRO(1),
    FEVEREIRO(2),
    MARCO(3),
    ABRIL(4),
    MAIO(5),
    JUNHO(6),
    JULHO(7),
    AGOSTO(8),
    SETEMBRO(9),
    OUTUBRO(10),
    NOVEMBRO(11),
    DEZEMBRO(12);

    MesDoAno(int numeroMes){
    }

    public static MesDoAno numeroParaMes(int numeroMes){
        for (MesDoAno mes : MesDoAno.values()){
            if ((mes.ordinal() + 1) == numeroMes){
                return mes;
            }
        }
        throw new IllegalArgumentException("Mês inválido: " + numeroMes);
    }
}
