public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        mesaj.substring(0,2);
        String yeniMesaj = mesaj.substring(0,2);
        System.out.println(yeniMesaj);
        int sayi = toplam(4,3);
        System.out.println(sayi);

    }

    public static void ekle(){
    System.out.println("Eklendi");
    }
    public static void sil(){
    System.out.println("Silindi");
    }
    public static void güncelle(){
    System.out.println("Güncellendi");
    }

    public static int toplam (int sayi1, int sayi2){
        return sayi1 + sayi2;
    }
}