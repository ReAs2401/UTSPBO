import java.util.Scanner;
public class NOMOR3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String jwb;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i +". nomor= ");
            jwb = keyboard.nextLine();
            sum += i;
        }
        System.out.println("jumlah = "+ sum);
    }
}
