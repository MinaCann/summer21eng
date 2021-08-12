package day18arraysmultidimensionalarrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		
		/*
		   arr1 ={ {1,2}, {3,4,5}, {6} }   and arr2 = { {7,8,9}, {10,11}, {12} }
		   Find the sum of elements whose indexes are same in arr1 and arr2
		   
		    (1+7) + (2+8) + (3+10) + (4+11) + (6+12) = 64 
		 */
//
//		int[][] arr1= {{1,2},{3,4,5},{6}};
//		int[][] brr= {{7,8,9},{10,11},{12}};
//		
//		int len =arr1.length<brr.length?arr1.length:brr.length;
//		int sum=0;
//		for(int i=0;i<len;i++) {
//			int column=arr1[i].length<brr[i].length ? arr1[i].length : brr[i].length;
//			for(int j=0;j<column;j++) {
//				sum+=arr1[i][j]+brr[i][j];
//			}
//		}
//		System.out.println(sum);
	//	Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana
	//	yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }
		
		int crr[][]={{1,2,3},{4,5,6}};
		
		int M=1;
		int A=0;
		for(int x=0;x<crr.length;x++) {
			
			for(int y=0;y<crr[x].length;y++){
				
			
			M=M*crr[x][y];
			A=A+crr[x][y];
			}
		}
		
	
	System.out.println(M);
    System.out.println(A);
}
}