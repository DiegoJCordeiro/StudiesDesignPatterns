package br.com.diegocordeiro.patterns.creational.prototype.models;

public class Connection implements Cloneable {
    private static Connection connection = null;

    private final String url;

    private final String username;

    private final String password;

    private final String database;

    private final String port;

    public Connection(String url, String username, String password, String database, String port) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.database = database;
        this.port = port;
    }

    public static Connection getInstance() {

        if (connection == null) {
            connection = new Builder()
                    .withURL("jdbc:mysql://localhost")
                    .withUsername("root")
                    .withPassword("root")
                    .withDatabase("prototype")
                    .withPort("8080")
                    .build();
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

    @Override
    public Connection clone() {
        try {
            return (Connection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static class Builder {

        private String url;

        private String username;

        private String password;

        private String database;

        private String port;

        public Builder() {}

        public Builder withURL(String url){
            this.url = url;
            return this;
        }

        public Builder withUsername(String username){
            this.username = username;
            return this;
        }

        public Builder withPassword(String password){
            this.password = password;
            return this;
        }

        public Builder withDatabase(String database){
            this.database = database;
            return this;
        }

        public Builder withPort(String port){
            this.port = port;
            return this;
        }

        public Connection build(){

            return new Connection(this.url, this.username, this.password, this.database, this.port);
        }
    }
}
