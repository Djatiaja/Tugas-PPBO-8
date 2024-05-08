public class Salesman extends KaryawanBiasa{
    int target, penjualan;
    Salesman(String nama, double gaji, int target, int penjualan, jenisKelamin jeniskelamin){
        super(nama, gaji, jeniskelamin);
        this.penjualan=penjualan;
        this.target=target;
    }

    @Override
    public String membuatNIK() {
        String temp = "S" + this.NIKcounter;
        this.NIKcounter ++;
        return temp;
    }

    @Override
    public double getTHR() {
        double temp;
        if (penjualan>= target){
            temp= this.gaji *2;
        }else {
        temp=this.gaji;
        }
        System.out.println(this.nama + " merupakan seorang salesman dengan target " +this.target+" dan memiliki penjualan sebanyak "+this.penjualan+". Karena "+this.nama+" memiliki gaji sebanyak "+ this.gaji+" sehingga thr anda sebanyak " +temp);
        return temp;
    }
}
