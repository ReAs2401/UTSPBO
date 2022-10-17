import java.util.Scanner;
public class NOMOR2 {
    private  double berat;
    private  double tinggi;
    private  double rumus;

    public void setBerat(double brtbdn){
        this.berat = brtbdn;
    }
    public double getBerat(){
        return this.berat;
    }
    public void setTinggi(double tnggbdn){
        this.tinggi = tnggbdn;
    }
    public double getTinggi(){
        return this.tinggi;
    }

    public double rubah(){
        return (this.tinggi * this.tinggi) / 100;
    }
    public double rumus(){
        return this.berat / this.rubah();
    }

    public double kriteria(){
        double kriteria;
        kriteria = this.rumus;
        if (rumus>=18.5 && rumus<=22.9){
            System.out.println("Selamat Berat Badan Anda Ideal");
            System.out.println("Tetaplah Berolahraga dan Menjaga Pola Makan agar Tetap Sehat");
        } else if (rumus<18.5) {
            System.out.println("Maaf Berat Badan Anda Underweight");
            System.out.println("Sebaiknya Anda Menambah Porsi Makan dan Mengkonsumsi Lebih Banyak Protein");
        } else if (rumus>22.9) {
            System.out.println("Maaf Berat Badan Anda OverWeight");
            System.out.println("Perbanyak Olahraga dan Menjaga Pola Makan Anda");
        }
        return kriteria;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NOMOR2 beratbdn = new NOMOR2();
        System.out.println("Masukkan Berat Badan Anda Dalam Kilo (kg): ");
        beratbdn.setBerat(sc.nextInt());
        System.out.println("Massukkan Tinggi Badan Anda Dalam Meter (m): ");
        beratbdn.setTinggi(sc.nextInt());
        System.out.println(beratbdn.kriteria());
    }

}