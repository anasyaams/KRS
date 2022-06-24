import java.util.Scanner;

public class view {
    
    public String mulai(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLOGIN\n" +
                         "\nKaprodi (K)" +
                         "\nMahasiswa (MHS)");
        System.out.print("\nLogin sebagai: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String bioMhsNim(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("NIM: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String bioMhsNama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Lengkap: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String bioMhsProdi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Program Studi: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String mainMenuKaprodi(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDaftar Mata Kuliah yang ditawarkan (MK)" +
                         "\nTambah Mata Kuliah (ADD)" +
                         "\nHapus Mata Kuliah (DEL)" +
                         "\nKeluar (EXIT)");
        System.out.print("\nApa yang ingin Anda lakukan: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String kaprodiAddKode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode Mata Kuliah: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String kaprodiAddNama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Mata Kuliah: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public int kaprodiAddSks(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah SKS Mata Kuliah: ");
        int input = scanner.nextInt();
        return input;
    }
    
    public String kaprodiDelKodeMatkul(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode Mata Kuliah yang ingin dihapus: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String mainMenuMahasiswa(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nDaftar Mata Kuliah yang ditawarkan (MK)" +
                         "\nTambah Mata Kuliah (ADD)" +
                         "\nHapus Mata Kuliah (DEL)" +
                         "\nDaftar Mata Kuliah di KRS (PRINT)" +
                         "\nCetak KRS (KRS)" +
                         "\nKeluar (EXIT)");
        System.out.print("\nApa yang ingin kamu lakukan: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String mhsAddKode(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode Mata Kuliah: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public String mhsAddNama(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Mata Kuliah: ");
        String input = scanner.nextLine();
        return input;
    }
    
    public int mhsAddSks(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jumlah SKS Mata Kuliah: ");
        int input = scanner.nextInt();
        return input;
    }
    
    public int mhsAddSmt(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Semester: ");
        int input = scanner.nextInt();
        return input;
    }
    
    public String mhsDelKodeMatkul(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kode Mata Kuliah yang ingin dihapus: ");
        String input = scanner.nextLine();
        return input;
    }
}
