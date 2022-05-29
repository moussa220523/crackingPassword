public class User {

    private String password;    
    
    public User(String password){
        this.setPassword(password);
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Boolean authentificate(String pw){
        if (this.password.equals(pw))
        return true;
    return false;
    }
}
