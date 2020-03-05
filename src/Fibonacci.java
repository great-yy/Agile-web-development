import java.math.BigDecimal;//int 无法存储fib(200);
public class Fibonacci {

    public  static BigDecimal of (int n){
        if(n == 0) {
            return BigDecimal.valueOf(1);
        }
        else if (n == 1) {
            return BigDecimal.valueOf(1);
        }
        else{
            BigDecimal a = BigDecimal.valueOf(1);
            BigDecimal b = BigDecimal.valueOf(1);
            for(int i=3;i<=n;i++){
                BigDecimal temp = a.add(b);
                a=b;
                b=temp;
            }
            return b;
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<=200;i++){
            System.out.println(Fibonacci.of(i));
        }
    }

}




