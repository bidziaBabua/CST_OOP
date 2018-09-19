import java.util.Scanner;

public class EasyMath {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("გთხოვთ, შემოიტანოთ x-ის მნიშვნელობა");
        int x = input.nextInt();
        System.out.println("გთხოვთ, შემოიტანოთ y-ის მნიშვნელობა");
        int y = input.nextInt();
        System.out.println("გთხოვთ, შემოიტანოთ z-ის მნიშვნელობა");
        int z = input.nextInt();

        int result = x > 10 ? x + y - z : x + y + z;

        System.out.println("მიღებული შედეგი: " + result);
    }
}
