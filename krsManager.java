
import java.util.ArrayList;
import java.util.List;

public class krsManager {
    List<krs> listKrs = new ArrayList();
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    private int semester;
    
    public void printKrs(){
        if(listKrs.isEmpty()){
            System.out.println("Tidak ada KRS");
        } else {
            listKrs.forEach((k) -> {
                System.out.println(k);
            });
        }
    }
    
    public krs findKrs(String kodeMatkul){
        for(krs k : listKrs){
            if(k.getKodeMatkul().equals(kodeMatkul)){
                return k;
            }
        }
        return null;
    }
    
    public String findKode(String kodeMatkul){
        String t = "";
        for(krs k : listKrs){
            if(k.getKodeMatkul().equals(kodeMatkul)){
                t = "Y";
            } else {
                t = "N";
            }          
        }
        return t;
    }
    
    public void addKrs(String kodeMatkul, String namaMatkul, int sks, int smt){
        listKrs.add(new krs(kodeMatkul, namaMatkul, sks, smt));
        System.out.println("Mata Kuliah berhasil ditambahkan");
    }

    public void deleteKrs(String kodeMatkul){
        if(findKode(kodeMatkul).equalsIgnoreCase("Y")){
            listKrs.remove(findKrs(kodeMatkul));
            System.out.println("Mata Kuliah berhasil dihapus");
        } else {
            System.out.println("Mata Kuliah tidak ditemukan");
        }
    }
}
