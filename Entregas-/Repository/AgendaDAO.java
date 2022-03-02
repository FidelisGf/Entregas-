package Repository;

import ConnectionFactory.ConnectionFactory;
import Model.*;

import java.sql.*;

public class AgendaDAO {
    private Connection connection;

    public AgendaDAO() {
        connection = new ConnectionFactory().getConnection();
    }
    public void criarTabelaAgenda(){
        try {
            String sql = "CREATE SEQUENCE IF NOT EXISTS idAgenda_id_seq;";
            sql += "CREATE TABLE IF not exists agendas " +
                    "(IdAgenda BIGINT PRIMARY KEY DEFAULT nextval('idAgenda_id_seq'), " +
                    " Paciente VARCHAR(255)  , " +
                    " Medico VARCHAR(255)  , " +
                    " Secretaria VARCHAR(255)  , " +
                    " StatusAgendamento VARCHAR(255)  , " +
                    " DtAgendamento TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                    " DtCancelamento TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                    " DtAvaliacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP," +
                    " Encaixe VARCHAR (4)," +
                    " Obs VARCHAR (255))";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
    public void agendarConsulta(Agenda agenda) {
        try {
            String sql = "INSERT INTO agendas (Paciente, Medico, Secretaria, " +
                    "StatusAgendamento, DtAgendamento, DtCancelamento, DtAvaliacao, Encaixe, Obs) " +
                    "VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, agenda.getPaciente().getNome().toUpperCase());
            statement.setString(2, agenda.getMedico().getNome());
            statement.setString(3, agenda.getSecretaria().getNome());
            statement.setString(4, agenda.getStatusAgenda().toString());
            statement.setTimestamp(5, Timestamp.valueOf(agenda.getDataAgenda()));
            statement.setTimestamp(6, Timestamp.valueOf(agenda.getExclucaoData()));
            statement.setTimestamp(7, Timestamp.valueOf(agenda.getAtualizacaoData()));
            statement.setString(8, agenda.getEncaixe().toString());
            statement.setString(9, agenda.getObs());
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
    public Agenda verConsulta(int idConsulta){
        Agenda agenda = new Agenda();
        Paciente paciente = new Paciente();
        Medico medico = new Medico();

        Secretaria secretaria = new Secretaria();
        try {
            String sql = "SELECT * FROM agendas WHERE idAgenda = ? ";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idConsulta);
            statement.execute();
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                medico.setNome(resultSet.getString("medico"));
                paciente.setNome(resultSet.getString("paciente"));
                secretaria.setNome(resultSet.getString("Secretaria"));
                agenda.setPaciente(paciente);
                agenda.setMedico(medico);
                agenda.setSecretaria(secretaria);
                StatusAgenda statusAgenda = StatusAgenda.valueOf(resultSet.getString("StatusAgendamento"));
                agenda.setStatusAgenda(statusAgenda);
                agenda.setDataAgenda(resultSet.getTimestamp("DtAgendamento").toLocalDateTime());
                agenda.setDtCancelamento(resultSet.getTimestamp("DtCancelamento").toLocalDateTime());
                agenda.setDtAvaliacao(resultSet.getTimestamp("DtAvaliacao").toLocalDateTime());
                agenda.setEncaixe(resultSet.getBoolean("Encaixe"));
                agenda.setObs(resultSet.getString("Obs"));
            }
            return agenda;
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
