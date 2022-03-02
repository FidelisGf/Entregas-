package Repository;

import ConnectionFactory.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class SecretariaDAO {
    private Connection connection;

    public SecretariaDAO() {
        this.connection = new ConnectionFactory().getConnection();
        criarTabelaSecretaria();
    }

    public void criarTabelaSecretaria(){
        try {
            String sql = "CREATE SEQUENCE IF NOT EXISTS idSecretaria_id_seq;";
            sql += "CREATE TABLE IF not exists secretarias " +
                    "(IdSecretaria BIGINT PRIMARY KEY DEFAULT nextval('idSecretaria_id_seq'), " +
                    " Nome VARCHAR(255)  , " +
                    " Celular VARCHAR(255)  , " +
                    " Nacionalidade VARCHAR(255)  , " +
                    " Cpf VARCHAR(255)  , " +
                    " Email VARCHAR(255)  , " +
                    " Pis VARCHAR(255)  , " +
                    " Salario decimal (8 , 5)  , " +
                    " Login VARCHAR(255)  , " +
                    " Senha VARCHAR(255)," +
                    " DtContratacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtCadastro TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtAtualizacao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ," +
                    " DtExclucao TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP )";
            Statement statement = connection.createStatement();
            statement.execute(sql);
            statement.close();
        }catch (SQLException e){
            throw new RuntimeException();
        }
//        public void encaixarPaciente(){
//
//        }
//        public void cadastrarMedico(){
//
//        }
//        public void editarMedico(){
//
//        }
//        public void listarMedico(){
//
//        }
//        public void cadastrarSecretaria(){
//
//        }
//        public void editarSecretaria(){
//
//        }
//        public void verSecretarias(){
//
//        }
    }


}
