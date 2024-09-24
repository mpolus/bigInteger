import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        BigInteger number1 = new BigInteger("36554654321324");
        BigInteger number2 = new BigInteger("65463557654765");
        BigInteger gcd = number1.gcd(number2);
        System.out.println(gcd);

        BigDecimal decimal1 = new BigDecimal("2456.2345256");
        BigDecimal power1 = decimal1.pow(2);
        System.out.println(power1);
        BigDecimal decimal2 = new BigDecimal("1123.4125256");
        BigDecimal power2 = decimal2.pow(2);
        System.out.println(power2);


    }

}