public class SigmCalculator {
    public static float sum(int c3){
        int a = 5;
        int b = 3;
        int n = 10;
        int m = 7;
        int c = c3;
        float oper2;
        float oper1;
        float sum = 0;

        if(a == 0){
            throw new ArithmeticException();
        }

        for (float i = (float) a; i <= n ; i++) {
            for (float j = (float) b; j <= m ; j++) {
                oper2 = i / j;
                oper1 = i - c;
                sum += oper2/oper1;
            }
        }
        return sum;
    }
}

