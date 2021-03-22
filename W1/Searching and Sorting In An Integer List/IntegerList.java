// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create, fill,
// sort, and search in a list of integers.
//
// ****************************************************************
import java.util.Scanner; 
public class IntegerList
{
 int[] list; //values in the list
 //-------------------------------------------------------
 //create a list of the given size
 //-------------------------------------------------------
 public IntegerList(int size)
 {
 list = new int[size];
 }
 //-------------------------------------------------------
 //fill array with integers between 1 and 100, inclusive
 //-------------------------------------------------------
 public void randomize()
 {
 for (int i=0; i<list.length; i++)
 list[i] = (int)(Math.random() * 100) + 1;
 }
 //-------------------------------------------------------
 //print array elements with indices
 //-------------------------------------------------------
 public void print()
 {
 for (int i=0; i<list.length; i++)
 System.out.println(i + ":\t" + list[i]);
 }
 //-------------------------------------------------------
 //return the index of the first occurrence of target in the list.
 //return -1 if target does not appear in the list
 //-------------------------------------------------------
 public int search(int target)
 {
 int location = -1;
 for (int i=0; i<list.length && location == -1; i++)
 if (list[i] == target)
 location = i;
 return location;
 }
 //-------------------------------------------------------
 //sort the list into ascending order using the selection sort algorithm
 //-------------------------------------------------------
 public void selectionSort() {
    int minIndex;
    for (int i = 0; i < list.length - 1; i++) {
        //find smallest element in list starting at location i
        minIndex = i;
        for (int j = i + 1; j < list.length; j++) {
            if (list[j] < list[minIndex]) {
                minIndex = j;
            }
        }
        //swap list[i] with smallest element
        int temp = list[i];
        list[i] = list[minIndex];
        list[minIndex] = temp;
    }
}

void replaceFirst(int oldVal, int newVal) {
    int loc = search(oldVal);
    if(loc != -1) {
        list[loc] = newVal;
    }
}

void replaceAll(int oldVal, int newVal) {
    int location = -1;
    for (int i = 0; i < list.length; i++) {
        if (list[i] == oldVal) {
            location = i;
            list[location] = newVal;
        }
    }
}

void sortDecreasing() {
    int maxIndex;
    for (int i = 0; i < list.length - 1; i++) {
        maxIndex = i;
        for (int j = i + 1; j < list.length; j++) {
            if (list[j] > list[maxIndex]) {
                maxIndex = j;
            }
        }
        int temp = list[i];
        list[i] = list[maxIndex];
        list[maxIndex] = temp;
    }
}

int binarySearchD(int target)
{
    int min=0;
    int max=list.length-1; 
    int middle=0; 
    int loc=-1;
    while (loc == -1 && min <= max)
    {
        middle = (min+max) / 2;
        if (target == list[middle])
            loc = middle;
        else {
            if (target > list[middle])
                max = middle-1;
            else
                min = middle+1;
        }
    }
    return loc;
}
}