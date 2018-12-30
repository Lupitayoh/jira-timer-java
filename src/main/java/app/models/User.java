package app.models;

public class User {

    private String host;
    private String username;
    private String password;

    public User() {}

    public User(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public String getHost(){
        return host;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setUsername(String username) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
