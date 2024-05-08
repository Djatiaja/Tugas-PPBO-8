public class KaryawanBiasa {
    static int NIKcounter;
    double gaji;
    int cuti=12;
    String NIK, nama;
    jenisKelamin jeniskelamin;
    enum tipeCuti{
        PERNIKAHAN, PERSALINAN
    }
    enum jenisKelamin{
        PRIA, WANITA
    }

    KaryawanBiasa(String nama, double gaji, jenisKelamin jeniskelamin){
        this.NIK = this.membuatNIK();
        this.gaji = gaji;
        this.nama = nama;
        this.jeniskelamin=jeniskelamin;
    }

    public String membuatNIK(){
        String temp = "K" + NIKcounter;
        NIKcounter ++;
        return temp;
    }

    public double getTHR(){
        System.out.println(this.nama + " merupakan seorang karyawan biasa dan memiliki gaji sebanyak "+this.gaji+" sehingga thr anda sebanyak " +this.gaji);
        return this.gaji;
    }

    public void tambahCuti(tipeCuti tipecuti){
        switch (tipecuti){
            case PERNIKAHAN:{
                this.cuti+=3;
            }
            case PERSALINAN:{
                if (this.jeniskelamin.equals(KaryawanBiasa.jenisKelamin.PRIA)){
                    this.cuti+=3;
                } else {
                    this.cuti+=90;
                }
            }
        }
        System.out.println("Jumlah cuti " + this.nama +" sebanyak "+this.cuti);
    }

}
