public abstract class Beruang {
    static final int kaki = 4;
    static final String jenisMakan = "Omnivora";


    public static void keterangan(String jenis){
        System.out.println("\t" + jenis + ", sama seperti beruang lainnya memiliki " + kaki + " kaki.");
        System.out.println("\t" + jenis + " juga termasuk kedalam hewan " + jenisMakan + ".\n");
    }

    public abstract void habitat();

    public abstract void makananFavorit();

    public abstract void rataUsia();

    public abstract void namaIlmiah();

    public abstract void statusKonservasi();
}
