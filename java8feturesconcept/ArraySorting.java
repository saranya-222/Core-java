package java8feturesconcept;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a[]= {15,3,67,58,98,67,9,56,45,89};
          System.out.println("Before sorting...");
          for (int i : a) {
			System.out.print(i+" ");
		}
          Arrays.parallelSort(a);
         // Arrays.parallelSort(a,0,7);//start index is inclusive and end index is exclusive
          System.out.println("\nAfter sorting...");
          for (int i : a) {
        	  System.out.print(i+" ");
		}
          
           
          
	}

}
