//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    KaryawanBiasa Bambang = new KaryawanBiasa("Bambang", 1000, KaryawanBiasa.jenisKelamin.PRIA);
    Bambang.getTHR();
    Bambang.tambahCuti(KaryawanBiasa.tipeCuti.PERNIKAHAN);
        System.out.println();


    Manager Agus = new Manager("agus", 1000, Manager.Kantor.CABANG, KaryawanBiasa.jenisKelamin.PRIA);
    Agus.getTHR();
    Agus.tambahCuti(KaryawanBiasa.tipeCuti.PERSALINAN);
        System.out.println();

    Salesman Wiwit = new Salesman("Wiwit", 1000, 12,14, KaryawanBiasa.jenisKelamin.WANITA);
    Wiwit.getTHR();
    Wiwit.tambahCuti(KaryawanBiasa.tipeCuti.PERSALINAN);


    }
}