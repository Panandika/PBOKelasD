import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int hasilInput = 0;
        BeruangKutub beruangKutub = new BeruangKutub(); // memanggil constructor
        BeruangPanda beruangPanda = new BeruangPanda(); // memanggil constructor
        BeruangCokelat beruangCokelat =  new BeruangCokelat(); // memanggil constructor

        while (hasilInput < 1 || hasilInput > 3) {
            hasilInput = menuUtama();
            System.out.print("\n");

            switch (hasilInput) {
                case 1:
                    beruangKutub.habitat();
                    beruangKutub.makananFavorit();
                    beruangKutub.namaIlmiah();
                    beruangKutub.rataUsia();
                    beruangKutub.statusKonservasi();

                    break;
                case 2:
                    beruangPanda.habitat();
                    beruangPanda.makananFavorit();
                    beruangPanda.namaIlmiah();
                    beruangPanda.rataUsia();
                    beruangPanda.statusKonservasi();
                    break;
                case 3:
                    beruangCokelat.habitat();
                    beruangCokelat.makananFavorit();
                    beruangCokelat.namaIlmiah();
                    beruangCokelat.rataUsia();
                    beruangCokelat.statusKonservasi();
                    break;
                default:
            }
        }
    }

    private static int menuUtama() {
        int inputMenu;
        System.out.println("\t============================================================");
        System.out.println("\t|#|                                                      |#|");
        System.out.println("\t|#|            Yuk Cari Tahu Tentang Beruang             |#|");
        System.out.println("\t|#|                                                      |#|");
        System.out.println("\t============================================================");

        System.out.println("\t============================================================");
        System.out.println("\t|#|                                                      |#|");
        System.out.println("\t|#|       [1] Beruang Kutub                              |#|");
        System.out.println("\t|#|       [2] Beruang Panda                              |#|");
        System.out.println("\t|#|       [3] Beruang Cokelat                            |#|");
        System.out.println("\t|#|                                                      |#|");
        System.out.println("\t============================================================");

        System.out.print("\t Pilihlah diantara kelima menu tersebut! (1-3) ");

        Scanner input = new Scanner(System.in);

        inputMenu = input.nextInt();

        return inputMenu;
    }
}