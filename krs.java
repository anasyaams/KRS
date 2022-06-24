public class krs {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;
    private int semester;

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public krs(String kodeMatkul, String namaMatkul, int sks, int semester) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
        this.semester = semester;
    }

    public krs(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
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

    public int getSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return kodeMatkul + " " + namaMatkul + " " + sks + " sks; semseter " + semester;
    }
}
