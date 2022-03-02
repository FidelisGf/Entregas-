package Repository;

import ConnectionFactory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PacienteDAO {
    private Connection connection;


    public PacienteDAO() {
        connection = new ConnectionFactory().getConnection();

    }

    public void criarTabelaPaciente(){
        try {
            String sql = "CREATE SEQUENCE IF NOT EXISTS idPaciente_id_seq;";
            sql += "CREATE TABLE IF NOT EXISTS pacientes " +
                    "(IdPaciente BIGINT PRIMARY KEY DEFAULT nextval('idPaciente_id_seq')," +
                    " Nome TEXT NOT NULL," +
                    " Celular VARCHAR(255)  , " +
                    " Nacionalidade VARCHAR(255)  , " +
                    " Cpf VARCHAR(255)  , " +
                    " Email VARCHAR(255)  , " +
                    " Login VARCHAR(255)  , " +
                    " Senha VARCHAR(255)," +
                    " Numero_Cartao_Convenio VARCHAR(255)  , " +
                    " Tipo_Atendimento VARCHAR(255)  , " +
                    " Convenio VARCHAR(255)  , " +
                    " DtVencimento TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtCadastro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtAtualizacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtExclucao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP )";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }catch (SQLException e){
            throw new RuntimeException();
        }
    }
}
