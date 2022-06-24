public class mahasiswa {
    private String nim;
    private String nama;
    private String prodi;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return "No. Induk\t:" + nim + 
               "\nNama\t:" + nama + 
               "\nProgram Studi\t:" + prodi;
    }
}
