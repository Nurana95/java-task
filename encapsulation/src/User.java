public class User {
    private String password;
    private  String username;

    public User(String pasword, String username) {
        this.password = password;
        this.username = username;
setPassword(pasword);
    setUsername(username);
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "pasword='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public void setPassword(String password) {
        if (password.length()==8){
        this.password = password;}else {
            System.out.println("8 symbol");
        }
    }
    public void changePassword(String old,String newPassword){
       old=this.password;
        setPassword(newPassword);

    }

    public boolean checkPassword(String pass){
        return pass!=password?false:true;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username.toLowerCase();
    }
}
