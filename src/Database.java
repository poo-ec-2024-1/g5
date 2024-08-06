import java.sql.*;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

/**
 *A classe `Database` fornece funcionalidades básicas para abrir e fechar uma conexão com um banco de dados SQLite, utilizando a biblioteca ORMLite para simplificar o gerenciamento da conexão JDBC.
 */

public class Database
{
    private String databaseName = null;
    private JdbcConnectionSource connection = null;

    public Database(String databaseName) {
        this.databaseName = databaseName;
    }

    public JdbcConnectionSource getConnection() throws SQLException {
        if ( databaseName == null ) {
            throw new SQLException("database name is null");
        }
        if ( connection == null ) {
            try {
                connection = new JdbcConnectionSource("jdbc:sqlite:"+databaseName);
            } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
            }
            System.out.println("Opened database successfully");
        }
        return connection;
    }

    public void close() {
        if ( connection != null ) {
            try {
                connection.close();
                this.connection = null;
            } catch (java.lang.Exception e) {
                System.err.println(e);
            }
        }
    }
}