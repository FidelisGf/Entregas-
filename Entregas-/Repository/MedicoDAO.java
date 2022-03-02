package Repository;

import ConnectionFactory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MedicoDAO {
    private Connection connection;

    public MedicoDAO() {
        connection = new ConnectionFactory().getConnection();

    }
    public void criarTabelaMedico(){
        try {
            String sql = "CREATE SEQUENCE IF NOT EXISTS idMedico_id_seq;";
             sql += "CREATE TABLE IF NOT EXISTS medicos " +
                    "(IdMedico BIGINT PRIMARY KEY DEFAULT nextval('idMedico_id_seq')," +
                    " Nome TEXT NOT NULL," +
                    " Celular VARCHAR(255)  , " +
                    " Nacionalidade VARCHAR(255)  , " +
                    " Cpf VARCHAR(255)  , " +
                    " Email VARCHAR(255)  , " +
                    " PorcMedico decimal (8 , 5)  , " +
                    " ValorConsulta decimal (8 , 5)  , " +
                    " Login VARCHAR(255)  , " +
                    " Senha VARCHAR(255)," +
                    " Especialidade VARCHAR(255)  , " +
                    " Consultorio VARCHAR(255)  , " +
                    " CRM VARCHAR(255)  , " +
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
