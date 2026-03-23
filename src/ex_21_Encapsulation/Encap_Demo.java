package ex_21_Encapsulation;

public class Encap_Demo {
    public static void main(String[] args){
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodVWOLogin vwmoLogin1 = new GoodVWOLogin("admin", "pwd123");
        String pass =vwmoLogin1.getPassword();
        System.out.println(pass);
        vwmoLogin1.setPassword("Vaishnavi@123",false);
    }

}

class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password){
        this.password = password;
        this.username = username;
    }
}

class GoodVWOLogin{
    //Instance Variable | Data variable | Attribute | Fields | properties | member variables
    private String username;
    private String password;

    GoodVWOLogin(String username, String password){
        this.password = password;
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password, boolean isGoodAuntyAdmin){
        if(isGoodAuntyAdmin){
            this.password = password;
        }else {
            System.out.println("No Allowed!");
        }
    }
}
