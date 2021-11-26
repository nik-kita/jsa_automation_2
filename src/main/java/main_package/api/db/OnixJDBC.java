package main_package.api.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class OnixJDBC {
    private String dbHost;
    private String dbUser;
    private String dbPassword;
    private String dbName;
    Logger logger;
    static Connection connection;

    public OnixJDBC() {
        logger = LoggerFactory.getLogger(this.getClass());
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/main/resources/credentials.properties"));
        } catch (IOException e) {
            logger.error("It looks like you forgot to create 'src/resources/credentials.properties' file");
        }
        dbHost = properties.getProperty("jsaTestingDbHost");
        dbUser = properties.getProperty("jsaTestingDbUser");
        dbName = properties.getProperty("jsaTestingDbName");
        dbPassword = properties.getProperty("jsaTestingDbPassword");
        try {
            if(connection == null || connection.isClosed()) {
                connection = connect();
            }
        } catch (SQLException throwables) {
            logger.error(throwables.getMessage());
        }
    }

    private void close() {
        try {
            connection.close();
        } catch (SQLException throwables) {
            logger.error(throwables.getMessage());
        }
    }

    ResultSet executeQuery(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (SQLException throwables) {
            logger.error(throwables.getMessage());
        }
        close();
        return resultSet;
    }

    private Connection connect() {
        try {
            connection = DriverManager.getConnection(dbHost, dbUser, dbPassword);
            connection.setAutoCommit(false);
            logger.debug("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            logger.error(e.getMessage());
        }

        return connection;
    }

}
