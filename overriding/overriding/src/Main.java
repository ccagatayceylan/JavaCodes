public class Main {
    public static void main(String[] args) {
       BaseKrediManager[] krediManagers = new BaseKrediManager[]
               {new ÖğretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()};

       for (BaseKrediManager krediManager : krediManagers){
           System.out.println(krediManager.hesapla(1000));
       }
    }
}