import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> grades = new HashMap<>();

        while (true) {
            System.out.println("\n--- Öğrenci Not Sistemi ---");
            System.out.println("1 - Öğrenci Ekle");
            System.out.println("2 - Not Güncelle");
            System.out.println("3 - Öğrenci Sil");
            System.out.println("4 - Tüm Öğrencileri Göster");
            System.out.println("5 - En Yüksek Notu Bul");
            System.out.println("6 - Ortalama Hesapla");
            System.out.println("0 - Çıkış");
            System.out.print("Seçim: ");

            int secim = input.nextInt();
            input.nextLine();

            if (secim == 1) {
                System.out.print("Öğrenci adı: ");
                String name = input.nextLine();
                System.out.print("Not: ");
                int grade = input.nextInt();
                grades.put(name, grade);
                System.out.println("Eklendi!");

            } else if (secim == 2) {
                System.out.print("Öğrenci adı: ");
                String name = input.nextLine();
                if (grades.containsKey(name)) {
                    System.out.print("Yeni not: ");
                    int grade = input.nextInt();
                    grades.put(name, grade);
                    System.out.println("Güncellendi!");
                } else {
                    System.out.println("Öğrenci bulunamadı!");
                }

            } else if (secim == 3) {
                System.out.print("Silinecek öğrenci adı: ");
                String name = input.nextLine();
                grades.remove(name);
                System.out.println("Silindi!");

            } else if (secim == 4) {
                System.out.println("\n--- Öğrenci Listesi ---");
                for (String name : grades.keySet()) {
                    System.out.println(name + " → " + grades.get(name));
                }

            } else if (secim == 5) {
                int max = -1;
                String maxName = "";
                for (String name : grades.keySet()) {
                    if (grades.get(name) > max) {
                        max = grades.get(name);
                        maxName = name;
                    }
                }
                System.out.println("En yüksek not: " + maxName + " → " + max);

            } else if (secim == 6) {
                int total = 0;
                for (int grade : grades.values()) {
                    total += grade;
                }
                double avg = (double) total / grades.size();
                System.out.println("Ortalama: " + avg);

            } else if (secim == 0) {
                System.out.println("Çıkılıyor...");
                break;

            } else {
                System.out.println("Geçersiz seçim!");
            }
        }
    }
}
