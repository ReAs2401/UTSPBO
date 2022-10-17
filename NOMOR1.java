
import java.util.Scanner;
public class NOMOR1 {
    //masukkan atribut yang akan digunakan disini
    // ada jAwl(jam awal),mAwl(menit awal),dAwl(detik awal) dan jAkh(jam akhir), mAkh(menit akhir), dAkh(detik akhir).
    private static int jAwl;
    private static int mAwl;
    private static int dAwl;
    private static int jAkh;
    private static int mAkh;
    private static int dAkh;

    //method

    public int getjAwl(){return jAwl;}
    public void setjAwl(int jAwl){this.jAwl = jAwl;}
    public int getmAwl(){return mAwl;}
    public void setmAwl(int mAwl){this.mAwl = mAwl;}
    public int getdAwl(){return dAwl;}
    public void setdAwl(int dAwl){this.dAwl = dAwl;}
    public int getjAkh(){return jAkh;}
    public void setjAkh(int jAkh){this.jAkh = jAkh;}
    public int getmAkh(){return mAkh;}
    public void setmAkh(int mAkh){this.mAkh = mAkh;}
    public int getdAkh(){return dAkh;}
    public void setdAkh(int dAkh){this.dAkh = dAkh;}

    public double waktuawl(){
        return (3600*jAwl + 60*mAwl + dAwl);
    }
    public double waktuakh(){
        return (3600*jAkh + 60*mAkh + dAkh);
    }
    public double durasi(){
        return (waktuakh()-waktuawl());
    }
    public double biaya(){
        return ((waktuakh()-waktuawl())*30);
    }
    public double durasijam() {return (durasi()/3600);}

    //main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NOMOR1 biaya_pulsa = new NOMOR1();
        System.out.print("Masukkan jam awal = ");
        jAwl = sc.nextInt();
        System.out.print("Masukkan menit awal = ");
        mAwl = sc.nextInt();
        System.out.print("Masukkan detik awal = ");
        dAwl = sc.nextInt();
        System.out.println("Waktu awal percakapan = (" + biaya_pulsa.getjAwl() + ":" + biaya_pulsa.getmAwl() + ":" + biaya_pulsa.getdAwl()+ ")");
        System.out.print("\nMasukkan jam akhir = ");
        jAkh = sc.nextInt();
        System.out.print("Masukkan menit akhir = ");
        mAkh = sc.nextInt();
        System.out.print("Masukkan detik akhir = ");
        dAkh = sc.nextInt();

        System.out.println("Waktu awal percakapan = (" + biaya_pulsa.getjAkh() + ":" + biaya_pulsa.getmAkh() + ":" + biaya_pulsa.getdAkh()+ ")");
        System.out.println("Durasi percakapan anda = " + biaya_pulsa.durasijam() + " jam atau " + biaya_pulsa.durasi() + "detik");
        System.out.println("Biaya pulsa untuk percakapan anda = Rp. " + biaya_pulsa.biaya());
    }
}
