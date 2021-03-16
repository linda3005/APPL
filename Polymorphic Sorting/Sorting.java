//********************************************************************
// Sorting.java Author: Lewis/Loftus
//
// Demonstrates the selection sort and insertion sort algorithms.
//********************************************************************
public class Sorting
{
 //-----------------------------------------------------------------
 // Sorts the specified array of objects using the selection
 // sort algorithm.
 //-----------------------------------------------------------------
 public static void selectionSort (Comparable[] list)
 {
 int min;
 Comparable temp;
 for (int index = 0; index < list.length-1; index++)
 {
 min = index;
 for (int scan = index; scan < list.length; scan++)
 if (list[scan].compareTo(list[min]) < 0) 
 min = scan;
 // Swap the values
 temp = list[min];
 list[min] = list[index];
 list[index] = temp;
 }
 }
 //-----------------------------------------------------------------
 // Sorts the specified array of objects using the insertion
 // sort algorithm.
 //-----------------------------------------------------------------
 //Descending
 public static void DESinsertionsort (Comparable[] list)
 {
 for (int index = 1; index < list.length; index++)
 {
 Comparable key = list[index];
 int position = index;
 // Shift larger values to the right
 while (position > 0 && key.compareTo(list[position-1]) < 0)
 {
 list[position] = list[position-1];
 position--;
 list[position] = key;
 }

 }
 }
 //ascending
 public static void ASCinsertionSort (Comparable[] list)
 {
 for (int index = 1; index < list.length; index++)
 {
 Comparable key = list[index];
 int position = index;
 // Shift larger values to the right
 while (position > 0 && key.compareTo(list[position-1]) > 0)
 {
 list[position] = list[position-1];
 position--;
 list[position] = key;
 }

 }
 }
} 