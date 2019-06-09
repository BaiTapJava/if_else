import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int namSinh,namMoi;
        try {
            do {
                System.out.println("Nhap vao nam moi");
                namMoi = scanner.nextInt();

                System.out.println("Nhap vao nam sinh ");
                namSinh = scanner.nextInt();

                if (namMoi<=0 || namSinh<=0){
                    System.out.println("Khong thuc hien");
                }else {
                    int tuoi =namMoi-namSinh;
                    System.out.println("Tuoi cua sinh vien la: "+tuoi);
                }
            }while (namMoi>0 && namSinh>0);

        }catch (Exception ex){
            System.out.println(ex);
            System.out.println("Yeu cau nhap so");
        }
    }
}
