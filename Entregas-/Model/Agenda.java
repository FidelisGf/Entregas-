package Model;

import java.time.LocalDateTime;

public class Agenda extends AbstractEntity{
    private StatusAgenda statusAgenda;
    private Paciente paciente;
    private Secretaria secretaria;
    private Medico medico;
    private LocalDateTime dataAgenda;
    private Boolean encaixe;
    private String Obs;
    private LocalDateTime dtCancelamento;
    private LocalDateTime dtAvaliacao;


    public Agenda() {
    }

    public Agenda(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento, LocalDateTime dtAvaliacao) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
        this.dtAvaliacao = dtAvaliacao;
    }

    public Agenda(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento, LocalDateTime dtAvaliacao) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
        this.dtAvaliacao = dtAvaliacao;
    }

    public Agenda(StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento, LocalDateTime dtAvaliacao) {
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
        this.dtAvaliacao = dtAvaliacao;
    }

    public Agenda(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
    }

    public Agenda(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
    }

    public Agenda(StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs, LocalDateTime dtCancelamento) {
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
        this.dtCancelamento = dtCancelamento;
    }

    public Agenda(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
    }

    public Agenda(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs) {
        super(id, cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
    }

    public Agenda(StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe, String obs) {
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
        Obs = obs;
    }

    public Agenda(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData, StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe) {
        super(cadastroData, atualizacaoData, exclucaoData);
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
    }

    public Agenda(StatusAgenda statusAgenda, Paciente paciente, Secretaria secretaria, Medico medico, LocalDateTime dataAgenda, Boolean encaixe) {
        this.statusAgenda = statusAgenda;
        this.paciente = paciente;
        this.secretaria = secretaria;
        this.medico = medico;
        this.dataAgenda = dataAgenda;
        this.encaixe = encaixe;
    }

    public StatusAgenda getStatusAgenda() {
        return statusAgenda;
    }

    public void setStatusAgenda(StatusAgenda statusAgenda) {
        this.statusAgenda = statusAgenda;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Secretaria getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDateTime getDataAgenda() {
        return dataAgenda;
    }

    public void setDataAgenda(LocalDateTime dataAgenda) {
        this.dataAgenda = dataAgenda;
    }

    public Boolean getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }

    public String getObs() {
        return Obs;
    }

    public void setObs(String obs) {
        Obs = obs;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "statusAgenda=" + statusAgenda +
                ", paciente=" + paciente +
                ", secretaria=" + secretaria +
                ", medico=" + medico +
                ", dataAgenda=" + dataAgenda +
                ", encaixe=" + encaixe +
                ", Obs='" + Obs + '\'' +
                ", dtCancelamento=" + dtCancelamento +
                ", dtAvaliacao=" + dtAvaliacao +
                '}';
    }

    public LocalDateTime getDtCancelamento() {
        return dtCancelamento;
    }

    public void setDtCancelamento(LocalDateTime dtCancelamento) {
        this.dtCancelamento = dtCancelamento;
    }

    public LocalDateTime getDtAvaliacao() {
        return dtAvaliacao;
    }

    public void setDtAvaliacao(LocalDateTime dtAvaliacao) {
        this.dtAvaliacao = dtAvaliacao;
    }
}
