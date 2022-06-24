import java.util.ArrayList;
import java.util.List;

public class mataKuliahManager {
    List<mataKuliah> mk = new ArrayList();
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    
    public void registerMataKuliah(String kodeMatkul, String namaMatkul, int sks){
        mk.add(new mataKuliah(kodeMatkul, namaMatkul, sks));
        System.out.println("Mata Kuliah berhasil ditambahkan");
    }
    
    public void deleteMataKuliah(String kodeMatkul){
        if(findKode(kodeMatkul).equalsIgnoreCase("Y")){
            mk.remove(findMataKuliah(kodeMatkul));
            System.out.println("Mata Kuliah berhasil dihapus");
        } else {
            System.out.println("Mata Kuliah tidak ditemukan");
        }
    }
    
    public void printAllMataKuliah(){
        if(!mk.isEmpty()){
            for(mataKuliah m : mk){
                System.out.println(m);
            }
        } else {
            System.out.println("Tidak ada Mata Kuliah");
        }  
    }
    
    public mataKuliah findMataKuliah(String kodeMatkul){
        for(mataKuliah m : mk){
            if(m.getKodeMatkul().equals(kodeMatkul)){
                return m;
            }
        }
        return null;
    }  
    
    public String findKode(String kodeMatkul){
        String t = "";
        for(mataKuliah k : mk){
            if(k.getKodeMatkul().equals(kodeMatkul)){
                t = "Y";
            } else {
                t = "N";
            }          
        }
        return t;
    }
}
