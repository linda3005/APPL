
import java.util.Scanner;
public class String
{
 // --------------------------------------------
 // Reads in an array of integers, sorts them,
 // then prints them in sorted order.
 // --------------------------------------------
 public static void main (String[] args)
 {
 String[] StringList;//Integer tipe array
 int size;
 Scanner scan = new Scanner(System.in);
 System.out.print ("\nHow many words do you want to sort? ");
 size = scan.nextInt()+1;
 StringList = new String[size];
 System.out.println ("\nEnter the words...");
 for (int i = 0; i < size; i++)
 StringList[i] = scan.nextLine();
 Sorting.selectionSort(StringList); 
 System.out.println ("\nYour words in sorted order...");
 for (int i = 0; i < size; i++)
 System.out.print(StringList[i] + " ");
 System.out.println();
 }
} 