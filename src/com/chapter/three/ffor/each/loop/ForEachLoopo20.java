package com.chapter.three.ffor.each.loop;

public class ForEachLoopo20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array1 = {1,2,3,4,5};
		int [] array2 = {2,5,0,6,7};
		int size = array1.length+array2.length;
		int [] array3 = new int [size];
		
		for (int i=0;i<array3.length;i++) {
			 if (i < array1.length) {
			        array3[i] = array1[i];
			    } else {
			        array3[i] = array2[i - array1.length];
			    }
		}
		
          for (int w:array3) {
        	  System.out.println(w);
          }
	}

}
