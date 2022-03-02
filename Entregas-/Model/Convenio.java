package Model;

import java.math.BigDecimal;

public class Convenio {
    private String nome;
    private BigDecimal custos;

    public Convenio(String nome, BigDecimal custos) {
        this.nome = nome;
        this.custos = custos;
    }

    public Convenio() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getCustos() {
        return custos;
    }

    public void setCustos(BigDecimal custos) {
        this.custos = custos;
    }

    @Override
    public String toString() {
        return "Convenio{" +
                "nome='" + nome + '\'' +
                ", custos=" + custos +
                '}';
    }
}
