package Model;

import java.time.LocalDateTime;

public class Paciente extends Pessoa{
    private TipoAgendamento tipoAgendamento;
    private Convenio convenio;
    private String numCartao;
    private LocalDateTime dataVencimento;

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(nome, celular, nacionalidade, cpf, email, login, senha);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(TipoAgendamento tipoAgendamento, Convenio convenio, String numCartao, LocalDateTime dataVencimento) {
        this.tipoAgendamento = tipoAgendamento;
        this.convenio = convenio;
        this.numCartao = numCartao;
        this.dataVencimento = dataVencimento;
    }

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
    }

    public Paciente(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
    }

    public Paciente(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(nome, celular, nacionalidade, cpf, email, login, senha);
    }

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
    }

    public Paciente(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
    }

    public Paciente(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        super(nome, celular, nacionalidade, cpf, email, login, senha, genero);
    }

    public Paciente(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        super(cadastroData, atualizacaoData, exclucaoData);
    }

    public Paciente(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
    }

    public Paciente() {
    }

    public TipoAgendamento getTipoAgendamento() {
        return tipoAgendamento;
    }

    public void setTipoAgendamento(TipoAgendamento tipoAgendamento) {
        this.tipoAgendamento = tipoAgendamento;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "tipoAgendamento=" + tipoAgendamento +
                ", convenio=" + convenio +
                ", numCartao='" + numCartao + '\'' +
                ", dataVencimento=" + dataVencimento +
                '}';
    }


}
