package shivajava;
public class Encapsulation1 {


    private String username;
    private String pwd;

    public void setusername(String username) {
        this.username = username;
    }

    public String getusername() {
        if (username == "John") {
            return "Username is correct, Please Enter Password";
        } else {
            return "Username is Incorrect";
        }
    }


    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getpwd() {
        if (pwd == "John@14141") {
            return "Please go ahead";
        } else {
            return "Entered password is invalid";
        }
    }
}
    class PageUser {
        public static void main(String args[]) {
            Encapsulation1 l1 = new Encapsulation1();
            l1.setusername("John");
            System.out.println(l1.getusername());
            l1.setpwd("Something@143");
            System.out.println(l1.getpwd());
        }
    }
