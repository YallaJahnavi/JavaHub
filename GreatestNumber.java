public class GreatestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 5, d = 30;
        int greatest = (a > b && a > c && a > d) ? a :
                       (b > c && b > d) ? b :
                       (c > d) ? c : d;
        System.out.println("The greatest number is: " + greatest);
    }
}
