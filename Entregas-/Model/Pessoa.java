package Model;

import java.time.LocalDateTime;

public abstract class Pessoa extends AbstractEntity{
    private String nome;
    private String celular;
    private String nacionalidade;
    private String cpf;
    private String email;
    private String login;
    private String senha;
    private Genero genero;

    public Pessoa(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public Pessoa(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.genero = genero;
    }

    public Pessoa(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.genero = genero;
    }

    public Pessoa(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero) {
        this.nome = nome;
        this.celular = celular;
        this.nacionalidade = nacionalidade;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.genero = genero;
    }

    public Pessoa(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        super(cadastroData, atualizacaoData, exclucaoData);
    }

    public Pessoa(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
    }

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public Medico setNome(String nome) {
        this.nome = nome;
        return null;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
