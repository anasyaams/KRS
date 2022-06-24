public class krsController {
    private view View = new view();
    mataKuliahManager mkm = new mataKuliahManager();
    krsManager krsm = new krsManager();
    mahasiswa mhs = new mahasiswa();
    private boolean stopProgram = false;
    
    
    public void jalan() {
        mulaiControl(View.mulai());
        while(!stopProgram) {
            System.exit(0);
        }
    }
    
    public void mulaiControl(String input){
        boolean isNotDone = true;
        while (isNotDone) {
            switch(input.toUpperCase())
            {
                case "K":
                    mainMenuKaprodiControl(View.mainMenuKaprodi());
                    isNotDone = false;
                    while(!stopProgram) {
                        mainMenuKaprodiControl(View.mainMenuKaprodi());
                    }
                    break;
                case "MHS":
                    setMhs(View.bioMhsNim(), View.bioMhsNama(), View.bioMhsProdi());
                    mainMenuMahasiswaControl(View.mainMenuMahasiswa());
                    isNotDone = false;
                    while(!stopProgram) {
                        mainMenuMahasiswaControl(View.mainMenuMahasiswa());
                    }
                    break;
            } 
        } 
    }
    
    public void mainMenuKaprodiControl(String input) {
        boolean isNotDone = true;
        while (isNotDone) {
            switch(input.toUpperCase()) {
                case "MK":
                    kaprodiPrintControl();
                    isNotDone = false;
                    break;
                case "ADD":
                    kaprodiAddControl(View.kaprodiAddKode(), View.kaprodiAddNama(), View.kaprodiAddSks());
                    isNotDone = false;
                    break;
                case "DEL":
                    kaprodiDelControl(View.kaprodiDelKodeMatkul());
                    isNotDone = false;
                    break;
                case "EXIT":
                    System.exit(0);
                    stopProgram = true;
                    isNotDone = false;
                    break;
                default:
                    System.out.println("\nInput salah!");
                    input = View.mainMenuKaprodi();
            }
        }
    }
    
    public void kaprodiPrintControl(){
        mkm.printAllMataKuliah();
    }
    
    public void kaprodiAddControl(String kodeMatkul, String namaMatkul, int sks){
        mkm.registerMataKuliah(kodeMatkul, namaMatkul, sks);
    }
    
    public void kaprodiDelControl(String kodeMatkul){
        mkm.deleteMataKuliah(kodeMatkul);
    }
    
    public void mainMenuMahasiswaControl(String input) {
        boolean isNotDone = true;
        while (isNotDone) {
            switch(input.toUpperCase()) {
                case "MK":
                    kaprodiPrintControl();
                    isNotDone = false;
                    break;
                case "ADD":
                    mhsAddControl(View.mhsAddKode(), View.mhsAddNama(), View.mhsAddSks(), View.mhsAddSmt());
                    isNotDone = false;
                    break;
                case "DEL":
                    mhsDelControl(View.mhsDelKodeMatkul());
                    isNotDone = false;
                    break;
                case "PRINT":
                    mhsPrintKrsControl();
                    isNotDone = false;
                    break;
                case "KRS":
                    bioMhs();
                    mhsPrintKrsControl();
                    isNotDone = false;
                    break;
                case "EXIT":
                    System.exit(0);
                    stopProgram = true;
                    isNotDone = false;
                    break;
                default:
                    System.out.println("\nInput salah!");
                    input = View.mainMenuMahasiswa();
            }
        }
    }
    
    public void mhsPrintKrsControl(){
        krsm.printKrs();
    }
    
    public void mhsAddControl(String kodeMatkul, String namaMatkul, int sks, int smt){
        krsm.addKrs(kodeMatkul, namaMatkul, sks, smt);
    }
    
    public void mhsDelControl(String kodeMatkul){
        krsm.deleteKrs(kodeMatkul);
    }  
    
    public void bioMhs(){
        System.out.println("No. Induk\t:" + mhs.getNim() + 
                           "\nNama\t\t:" + mhs.getNama() + 
                           "\nProgram Studi\t:" + mhs.getProdi() +"\n");
    }
    
    public void setMhs(String nim, String nama, String prodi){
        mhs.setNim(nim);
        mhs.setNama(nama);
        mhs.setProdi(prodi);
    }
}
