package Model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Medico extends Pessoa{
    private String CRM;
    private BigDecimal porcentMedico;
    private String Consultorio;
    private Especialidade especialidade;
    private BigDecimal valorConsulta;

    public Medico() {
    }

    public Medico(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(nome, celular, nacionalidade, cpf, email, login, senha);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(id, cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha, Genero genero, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(nome, celular, nacionalidade, cpf, email, login, senha, genero);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(String CRM, BigDecimal porcentMedico, String consultorio, Especialidade especialidade, BigDecimal valorConsulta) {
        this.CRM = CRM;
        this.porcentMedico = porcentMedico;
        Consultorio = consultorio;
        this.especialidade = especialidade;
        this.valorConsulta = valorConsulta;
    }

    public Medico(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, String nome, String celular, String nacionalidade, String cpf, String email, String login, String senha) {
        super(cadastroData, atualizacaoData, exclucaoData, nome, celular, nacionalidade, cpf, email, login, senha);
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public BigDecimal getPorcentMedico() {
        return porcentMedico;
    }

    public void setPorcentMedico(BigDecimal porcentMedico) {
        this.porcentMedico = porcentMedico;
    }

    public String getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(String consultorio) {
        Consultorio = consultorio;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public BigDecimal getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(BigDecimal valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
    @Override
    public String toString() {
        return "Medico{" +
                "CRM='" + CRM + '\'' +
                ", porcentMedico=" + porcentMedico +
                ", Consultorio='" + Consultorio + '\'' +
                ", especialidade=" + especialidade +
                ", valorConsulta=" + valorConsulta +
                '}';
    }
}
