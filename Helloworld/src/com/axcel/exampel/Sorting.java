package com.axcel.exampel;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Foo = new int[] {4, 7, 10, 6, 2};
		
		for(int i=0; i < Foo.length; i++) {
			int j;
			for(j = i; j<Foo.length; j++){
				
				if(Foo[i]>Foo[j]) {
					int temp = Foo[j];
					Foo[j] =Foo[i];
					Foo[i]= temp;
					
				}
				
			}
			System.out.println(Foo[i]);
		}
		System.out.print("Foo = {");
		for(int c=0; c<Foo.length; c++) {
		System.out.print(Foo[c]+", ");
		
		}
		System.out.print("}");
	}

}
