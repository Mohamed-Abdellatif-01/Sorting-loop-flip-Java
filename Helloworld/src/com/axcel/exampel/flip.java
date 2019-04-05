package com.axcel.exampel;
import java.io.*; 
import java.util.*; 
public class flip {
 public static void main(String[] args) {
	
	
	 int[][] temp = new int[3][3];  
	int[][] Foo = new int[][] {
	      {1, 2, 3}, 
	      {4, 5, 6}, 
	      {7, 8, 9},
	 };
	 int a =0;
	 for(int i=2; i > -1  ; i--) 
	 {
		 int c =0;
		
		 for(int j = 2; j > -1; j--) 
		 {
			 System.out.println(" "+ Foo[i][j]);
			temp[a][c]=Foo[i][j];
			
			c++;
		 }
		 a++;
	 }
//	 for(int n=0; n < 3; n++) {
//	int[] arr = new int[3]; 
//	int j=Foo.length-1;
//	for(int i=0; i < Foo.length; i++ )
//	{
//		
//	    arr[i]=Foo[n][j];
//	    j--;
//	}
//	Foo[n]=arr;
	 
	 
//	 temp=Foo[0];
//	 Foo[0]=Foo[2];
//	 Foo[2]=temp;

	 
	 print2D(temp);
	 }
//	 	 
	 
 
 
 
 
 public static void print2D(int temp[][]) 
 { 
     // Loop through all rows 
     for (int[] row : temp) 

         // converting each row as string 
         // and then printing in a separate line 
         System.out.println(Arrays.toString(row)); 
 } 
}