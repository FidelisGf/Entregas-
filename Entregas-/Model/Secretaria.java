package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Secretaria extends Pessoa {
    private BigDecimal salario;
    private LocalDateTime dataContratacao;
    private String pis;


    public Secretaria(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(nome, celular, nacionalidade, cpf, email, login, senha);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria(BigDecimal salario, LocalDateTime dataContratacao, String pis) {
        this.salario = salario;
        this.dataContratacao = dataContratacao;
        this.pis = pis;
    }

    public Secretaria() {
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDateTime getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDateTime dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    @Override
    public String toString() {
        return "Secretaria{" +
                "salario=" + salario +
                ", dataContratacao=" + dataContratacao +
                ", pis='" + pis + '\'' +
                '}';
    }
}
