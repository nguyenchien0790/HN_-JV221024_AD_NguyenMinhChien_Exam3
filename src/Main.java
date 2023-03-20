import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> customer = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 3) {
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("     JAVA-HACKATHON-05-ADVANCE-1-MENU      ");
            System.out.println("  1. Nhập tên khách hàng chờ mua vé xem phim  ");
            System.out.println("  2. Khách tiếp theo  ");
            System.out.println("  3. Thoát\"  ");
            System.out.print("  Mời nhập: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Mời nhập tên khách hàng: ");
                    String nameCustomer = scanner.nextLine();
                    customer.add(nameCustomer);
                    System.out.printf("Khách hàng đã được thêm : %s\n",nameCustomer);
                    break;
                case 2:
                    if (customer.isEmpty()) {
                        System.err.println("Trống");
                    } else {
                        String next = customer.poll();
                        System.out.println("Tiếp theo : " + next);
                    }
                    break;
                case 3:
                    System.err.println("Đã kết thúc chương trình");
                    break;
                default:
                    System.err.println("Vui lòng chọn lại (1/2/3)");
                    break;
            }
        }
        scanner.close();
    }
}