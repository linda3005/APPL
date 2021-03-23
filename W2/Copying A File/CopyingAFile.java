import java.io.File;
import java.io.*;
import java.io.FileNotFoundException; //??
import java.util.Scanner;
//import java.nio.charset.StandardCharsets;
public class CopyingAFile{
    public static void main(String[] args){
    System.out.print("Masukkan nama file : (tanpa spasi)");
    Scanner scan=new Scanner (System.in);
    File fl=new File(scan.nextLine());
    do{
        try{
            FileInputStream inputs=new FileInputStream(fl);
            System.out.println("Isi File: ");
            int i=0;
            while((i=inputs.read())!=-1){
                System.out.print((char)i);
            }scan.close();
            break;
    }catch(Exception ex){
        System.out.println("Name file is not valid, enter the valid name of file : ");
        fl=new File(scan.nextLine()); 
    }
  }while (true);
 }
}