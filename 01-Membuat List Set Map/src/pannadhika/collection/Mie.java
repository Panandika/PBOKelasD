package pannadhika.collection;

class Mie {
    private String nama;
    private int harga;

    public Mie(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Ket Mie " + nama + ", harga: " + harga;
    }
}
