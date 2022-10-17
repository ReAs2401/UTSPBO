import java.lang.Math;
public class NOMOR4 {
    private double r;
    private final double PHI = 3.14;

    public NOMOR4(){
        this.r = 0;
    }

    public NOMOR4(double jari2){
        this.r = jari2;
    }

    public void setR(int jari2) {
        this.r = jari2;
    }

    public double getR() {
        return this.r;
    }
    public double luas(){
        return this.PHI * Math.pow(this.r,2) ;
    }
    public double keliling(){
        return 2 * this.PHI * this.r;
    }

    public static void main(String[] args) {
        NOMOR4 link1 = new NOMOR4();
        link1.setR(10);
        System.out.println("Luas lingkaran  = " + link1.luas());

        NOMOR4 link2 = new NOMOR4(10);
        System.out.println("Keliling lingkaran  = " + link2.keliling());
    }
}