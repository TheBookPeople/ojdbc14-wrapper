package uk.co.thebookpeople.jdbc.oracle;

import java.sql.SQLException;
import java.util.Properties;
import oracle.jdbc.driver.OracleDriver;


public class Driver extends OracleDriver {

    static {
        try {
            java.sql.DriverManager.registerDriver(new Driver());
        } catch (SQLException e) {
            throw new RuntimeException("Can't register driver ojdbc14-wrapper driver");
        }
    }

    @Override
    public Connection connect(String string, Properties prprts) throws SQLException {
        return new Connection(super.connect(string, prprts));
    }

    public Driver() throws SQLException {
        // The MySQL driver says a constructor is required for Class.forName().newInstance()
    }
}
