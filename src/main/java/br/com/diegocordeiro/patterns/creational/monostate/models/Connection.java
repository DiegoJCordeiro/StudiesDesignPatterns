package br.com.diegocordeiro.patterns.creational.monostate.models;

public class Connection {
    private static Connection connection = null;

    private String url;

    private String username;

    private String password;

    private String database;

    private String port;

    public Connection(){

    }

    public Connection(String url, String username, String password, String database, String port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
    }

    public Connection get() {

        if (connection == null) {
            connection = new Connection("jdbc:mysql://localhost",
                    "root",
                    "root",
                    "MonoState", "8080");
        }

        return connection;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getDatabase() {
        return database;
    }

    public String getPort() {
        return port;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", database='" + database + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
