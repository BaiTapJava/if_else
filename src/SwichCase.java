import java.util.InputMismatchException;
import java.util.Scanner;

public class SwichCase {
    private static Scanner scanner = new Scanner(System.in);
    public static void index(int n){
        System.out.println("So ngay trong thang");
        switch (n){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            case 2:
                try{
                    System.out.println("Nhap vao nam cua thang: ");
                    int nam= scanner.nextInt();

                    if (nam%4==0||nam%400==0 && nam%100!=0){
                        System.out.println("Thang co 29 ngay");
                    }else {
                        System.out.println("Thang co 28 ngay");
                    }
                }catch (InputMismatchException ip){
                    System.out.println("Loi dau vao");
                    System.out.println(ip);
                }
            default:
                System.out.println("Ngoai le");
        }

    }

    public static void main(String[] args) {
        String chu="A";

        switch (chu){
            case "A":
                System.out.println("Day la chu A");
//                break;
            default:
                System.out.println("Khong co");
        }

        System.out.println("Nhap vao vao thang can kiem tra: ");
        int n = scanner.nextInt();

        index(n);

    }
}
