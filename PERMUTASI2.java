import java.util.Scanner ;
public class PERMUTASI2 {
    int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int r, n, s; 
    int fa,fb; 
    int Permutasi;
    
    public PERMUTASI2(){   
}
    public void permutasi(){
        fa=1; fb=1; s=n-r;
        if(n<=0){System.out.println("Angka yang anda pilih salah");
        }
        else{
            while(n>0){
            fa=fa*n;
            n=n-1;
            }
            while (s>0){
            fb=fb*s;
            s=s-1;
            }
        }
        Permutasi= fa / fb;
        System.out.println("Banyaknya kemungkinan adalah \t:"+Permutasi);
    }
    
    public static void main(String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println("PERMUTASI");
         PERMUTASI2 Soal;
         Soal = new PERMUTASI2();
        System.out.println("Masukkan jumlah semua orang yang diketahui n =  ");
        Soal.n=input.nextInt();
        System.out.println("Masukkan yang hanya terpilih r = ");
        Soal.r = input.nextInt();
        Soal.permutasi();
    }
}