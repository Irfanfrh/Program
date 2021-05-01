import java.util.Scanner;
public class ProgramPulsa {
     //data
     static String nohp;
     static String[] pulsa = {"5000","10000","15000","20000","25000","50000"};
     static int pulsaInput;
     
     public static void main(String[] args){
         login();
     }
     
     static void login(){
         Scanner operator = new Scanner(System.in);
         
         System.out.print("\nMasukkan Nomor Hp : "); 
         nohp = operator.nextLine();
         cekNomorHp();
         daftarpulsa();
         System.out.print("Masukkan Jumlah Pulsa ");
         pulsaInput = operator.nextInt();
         cekpulsa();    
     }
     
     static void cekNomorHp(){
         for(int b = 0; b < 12; b++){
             if(!nohp.matches("[0-9]*") == true){
                 System.out.println("Nomor Hp Yang Dimasukkan Salah");
                 login();
             }else if(nohp.length() < 12){ 
                 System.out.println("Nomor Hp Yang Dimasukkan Salah");
                 login();
             }
         }
  }
     
     static void daftarpulsa(){
         System.out.println("Daftar Pulsa : ");
         for(int b = 0; b < pulsa.length;){
            System.out.println("Daftar Pulsa\t" + pulsa[b]);
                 b++;
             }
     }
     
     static void cekpulsa(){     
      int pulsalength = 0;
          if(pulsaInput < pulsalength){
            berhasil();
         }else{
              login();
          }
     }
     
     static void berhasil(){
         System.out.println("Selamat Transaksi Berhasil");
         System.exit(0);
     }
  }
    

