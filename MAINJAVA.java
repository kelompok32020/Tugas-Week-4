public class MAINJAVA {
    int array[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    int r;
    int n;
    int s;
    int fa,fb; 
    int Permutasi;
    
    public MAINJAVA(){   
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
}