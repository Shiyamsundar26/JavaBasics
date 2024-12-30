package returntype;

public class Prog4 {
    public static void main(String[] args) {
        String username=("admin");
        String password=("admin");
        System.out.println(check("admin","jkdhfge"));
    }
    public static String check(String username,String password) {
        String s= username=="admin"&&password=="123"?"logging in":"invalid password";
        return s;
    }

}
