public class mataKuliah {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;

    public mataKuliah(String kodeMatkul, String namaMatkul, int sks) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return kodeMatkul + " " + namaMatkul + " " + sks + " sks";
    }
}
