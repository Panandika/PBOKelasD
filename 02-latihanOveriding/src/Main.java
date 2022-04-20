import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int done =1 ;
        int hasilInput = 0;
        BeruangKutub beruangKutub = new BeruangKutub(); // memanggil constructor
        BeruangPanda beruangPanda = new BeruangPanda(); // memanggil constructor
        BeruangCokelat beruangCokelat =  new BeruangCokelat(); // memanggil constructor

        do {
            hasilInput = 0;
            while (hasilInput < 1 || hasilInput > 3) {
                hasilInput = menuUtama();
                System.out.print("\n");

                switch (hasilInput) {
                    case 1 -> {
                        Beruang.keterangan("Beruang Kutub");
                        beruangKutub.habitat();
                        beruangKutub.makananFavorit();
                        beruangKutub.namaIlmiah();
                        beruangKutub.rataUsia();
                        beruangKutub.statusKonservasi();
                    }
                    case 2 -> {
                        Beruang.keterangan("Beruang Panda");
                        beruangPanda.habitat();
                        beruangPanda.makananFavorit();
                        beruangPanda.namaIlmiah();
                        beruangPanda.rataUsia();
                        beruangPanda.statusKonservasi();
                    }
                    case 3 -> {
                        Beruang.keterangan("Beruang Cokelat");
                        beruangCokelat.habitat();
                        beruangCokelat.makananFavorit();
                        beruangCokelat.namaIlmiah();
                        beruangCokelat.rataUsia();
                        beruangCokelat.statusKonservasi();
                    }
                    default -> System.out.println("Input Anda Sepertinya Salah!");
                }
            }

            done = pengulangan();
        }
        while (done == 1);
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

    private static int pengulangan(){
        int selesai = 0;
        int cekulang;

        System.out.println("\n\t============================================================");
        System.out.print("\t[?] Jika ingin mengulang ketik 1. Jika tidak ketik 0 ");
        Scanner input = new Scanner(System.in);

        cekulang = input.nextInt();

        if (cekulang == 1 || cekulang == 0){
            if  (cekulang == 1){
                selesai = 1;
            }
        } else {
            System.out.println("\tInput Anda Sepertinya Salah!");
            pengulangan();
        }
        return selesai;
    }
}