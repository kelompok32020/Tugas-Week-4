import java.util.Scanner ;
class PERMUTASIJAVA{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("PERMUTASI");
         MAINJAVA Soal;
         Soal = new MAINJAVA();
        System.out.println("Masukkan jumlah semua orang yang diketahui n =  ");
        Soal.n=input.nextInt();
        System.out.println("Masukkan yang hanya terpilih r = ");
        Soal.r = input.nextInt();
        Soal.permutasi();
    }
}