package returntype;

public class Prog2 {
    public static void main(String[] args) {
        char res=get_char(65);
        System.out.println(res);
    }
    public static char get_char(int num) {
        char ch=(char)num;
        return ch;
        
    }

}
