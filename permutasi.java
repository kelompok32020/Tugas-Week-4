import java.util.Scanner ;
class permutasi{
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("PERMUTASI");
         main Soal;
         Soal = new main();
        System.out.println("Masukkan jumlah semua orang yang diketahui n =  ");
        Soal.n=input.nextInt();
        System.out.println("Masukkan yang hanya terpilih r = ");
        Soal.r = input.nextInt();
        Soal.permutasi();
    }
}