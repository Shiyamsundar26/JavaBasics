package returntype;

public class Prog3 {
    public static void main(String[] args) {
        System.out.println(sum1(2,3));
        System.out.println(sum2(2,3,6));
        System.out.println(sum3(2,3,6,5));
    
}
    public static int sum1(int a,int b) {
        return a+b;
        
    }
    public static int sum2(int a,int b,int c) {
        return a+b+c;
        
    }
    public static int sum3(int a,int b,int c,int d) {
        return a+b+c+d;
        
    }
}

