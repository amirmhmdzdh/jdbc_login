public class User {

    private  int id ;
    private String firsname;
    private String lastname;
    private String username;
    private String password;

    public User() {
    }

    public User(int id , String firsname, String lastname, String username, String password) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.id=id;
     }

    public User(String firsname, String lastname, String username, String password) {
        this.firsname = firsname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firsname='" + firsname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}



