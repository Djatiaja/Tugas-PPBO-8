public class Manager extends KaryawanBiasa{
    Kantor kantor;
    enum Kantor{
        CABANG, PUSAT
    }
    Manager(String nama, double gaji, Kantor kantor, jenisKelamin jeniskelamin){
        super(nama, gaji, jeniskelamin);
        this.kantor = kantor;

    }

    @Override
    public String membuatNIK() {
        String temp = "M" + NIKcounter;
        NIKcounter ++;
        return temp;
    }

    @Override
    public double getTHR() {
        double temp =this.gaji *2;
        switch (kantor){
            case CABANG -> {
                temp+= (this.gaji *0.5);
            }
            case PUSAT -> {
                temp+=this.gaji;
            }
        }
        System.out.println(this.nama + " merupakan seorang Manager "+ this.kantor+" dan memiliki gaji sebanyak "+this.gaji+" sehingga thr anda sebanyak " +temp);
        return temp;
    }
}
