public class Main {
    public static void main(String[] args) {
        final int bookNum = 201;
        int c3 = bookNum % 3;
        System.out.println("c2 - " + bookNum%2); //02 - '-'
        System.out.println("c3,c - " + c3); //C - 0
        System.out.println("c5 - " + bookNum%5); //O1 - '/'
        System.out.println("c7 - " + bookNum%7); //i , j - float

        System.out.println("\n" + "Sum = " + SigmCalculator.sum(c3));
    }
}
