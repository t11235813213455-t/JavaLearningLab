package integrate;

import java.util.function.DoubleUnaryOperator;

public class integrate {

    public static void main(String[] args) {
        //System.out.println(integrate(x -> 1, 0, 10));//10.0
        //System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        //System.out.println(integrate(x -> Math.sin(x) / x , 1, 5));//0.603848
    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 1.0, sum1 = calculateIntegral(f, a, b, step), sum2, accuracy = 1e-6;
        do {
            step /= 2;
            //System.out.println(step);
            sum2 = calculateIntegral(f, a, b, step);
            if ((Math.abs(sum2 - sum1) < accuracy)) {
                return sum2;
            }
            sum1 = sum2;
        } while (true);
    }

    private static double calculateIntegral(DoubleUnaryOperator f, double a, double b, double step) {
        double sum = 0;
        long i = 0;
        for (double x = a; x < b; x = a + step * i++) {
            sum += step * f.applyAsDouble(x);
        }
        return sum;
    }
}

