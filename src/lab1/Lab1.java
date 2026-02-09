package lab1;

import java.util.Scanner;

/**
 * @author Expedition 33
 */
public class Lab1 {

    static void menu() {
        System.out.println("CÁC CHỨC NĂNG CHƯƠNG TRÌNH");
        System.out.println("1. Check điểm học sinh");
        System.out.println("2. Tính chu vi, diện tích HCN");
        System.out.println("3. Tính thể tích khối lập phương");
        System.out.println("4. Tính delta phương trình bậc 2");
        System.out.println("0. Thoát chương trình");
        System.out.print("Chọn chức năng: ");
    }

    static void Chucnang1(Scanner scanner) {
        System.out.print("Họ và tên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Điểm TB: ");
        double diemTB = scanner.nextDouble();
        scanner.nextLine(); // bỏ dòng thừa
        System.out.printf("Kết quả: %s %.2f điểm\n", hoTen, diemTB);
    }

        static void Chucnang2() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập chiều dài: ");
            double dai = sc.nextDouble();
            System.out.print("Nhập chiều rộng: ");
            double rong = sc.nextDouble();
            double chuVi = (dai + rong) * 2;
            double dienTich = dai * rong;
            double canhNhoNhat = Math.min(dai, rong);
            System.out.println("Chu vi hình chữ nhật: " + chuVi);
            System.out.println("Diện tích hình chữ nhật: " + dienTich);
            System.out.println("Cạnh nhỏ nhất: " + canhNhoNhat);
        }

    static void chucnang3(Scanner sc) {
        System.out.print("Nhập cạnh của khối lập phương: ");
        double canh = sc.nextDouble();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích của khối lập phương là: " + theTich);
    }

    static void chucnang4(Scanner sc) {
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta = " + delta);
        if (delta >= 0) {
            double canDelta = Math.sqrt(delta);
            System.out.println("Căn delta = " + canDelta);
        } else {
            System.out.println("Delta âm, không có căn thực.");
        }
    }

    static void pressEnterToContinue(Scanner sc) {
        System.out.println("\nNhấn Enter để tiếp tục...");
        sc.nextLine();
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;
        
        do {
            menu();
            select = s.nextInt();
            s.nextLine();
            switch (select) {
                case 1:
                    Chucnang1(s);
                    pressEnterToContinue(s);
                    break;

                case 2:
                    Chucnang2();
                    pressEnterToContinue(s);
                    break;
                case 3:
                    chucnang3(s);
                    pressEnterToContinue(s);
                    break;
                case 4:
                    chucnang4(s);
                    pressEnterToContinue(s);
                    break;
                case 0:
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    System.out.println("Chức năng chưa được cài đặt!");
            }
            System.out.println("\n----------------------------");
        } while (select != 0);
        
        s.close();
    }
}