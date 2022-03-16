package pannadhika.collection;



import java.util.*;

public class ListSetMap {
    public static void main(String[] args) {

        int nomor;
        //Membuat List
        List<String> ListPanit = new ArrayList<>();
        ListPanit.add("Sporti 2021");
        ListPanit.add("ITCC 2021");
        ListPanit.add("Sporti 2022");
        ListPanit.add("MMBU 2021");


        System.out.println("Kepanitiaan yang telah saya jalani: ");

        for (int i = 0; i < ListPanit.size(); i++){
            nomor = i + 1;

            System.out.println("\t" + nomor + ". " + ListPanit.get(i));
        }

        Set<String> SetTemu = new HashSet<>();
        SetTemu.add("Viryan");
        SetTemu.add("Metta");
        SetTemu.add("Viryan");
        SetTemu.add("Agung");
        SetTemu.add("Picessa");
        SetTemu.add("Alex");
        SetTemu.add("Krisnok");
        SetTemu.add("Viryan");

        System.out.println("Berikut adalah orang-orang yang saya temui beberapa hari terakhir:");
        for (Iterator iterator = SetTemu.iterator(); iterator.hasNext(); ) {
            // looping menggunakan Iterator
            System.out.println("\t " + iterator.next());
        }


    }
}
