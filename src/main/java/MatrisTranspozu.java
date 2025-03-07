import java.util.Scanner;

public class MatrisTranspozu {
    public static void main(String[] args) {

        //Verileri alıyoruz

        Scanner scanner = new Scanner(System.in);


        System.out.println("Satır sayısını giriniz : ");
        int satir = scanner.nextInt();
        System.out.println("Sütun sayısını giriniz : ");
        int sutun = scanner.nextInt();

        int[][] matris = new int[satir][sutun];
        int[][] transpoz = new int [sutun][satir];

        System.out.println("Matrisin sayılarını giriniz : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.println("Matris[" + i + "] [" + j + "] = ");
                matris[i][j] = scanner.nextInt();

            }

        }
        //Transpoz işlemini yapıyoruz
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                transpoz[j][i] = matris[i][j];

            }

        }
        scanner.close();

        // Sonuçları yazdırıyoruz

        System.out.println("Matris : ");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                System.out.print(matris[i][j] + "  ");

            }
            System.out.println();

        }
        System.out.println("Transpoz : ");
        for (int i = 0; i < sutun; i++) {
            for (int j = 0; j < satir; j++) {
                System.out.print(transpoz[i][j] + "  ");

            }
            System.out.println();

        }

    }
}
