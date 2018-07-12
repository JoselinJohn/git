
public class Sorting {

	//public static void main(String[] args) {
		
		int arra[]= null; //{5,1,9,12,10,7};
		
		public int[] getArray() {
			return arra;
		}
		public void setArray(int[] array) {
			this.arra = array;
		}
		
		public Sorting(int[] array) {
			this.arra = array;
		}
		
		public Sorting()
		{
			arra = null;
		}
		
		public static void sorting(int array[])
		{
		 System.out.println("BUBBLE SORT EXAMPLE");
		 
		 System.out.println(); 
		  
		 System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < array.length; i++){  
                 System.out.print(array[i] + " "); 
         }
         
         System.out.println();
         System.out.println();
		
         
         int n = array.length;  
         int temp = 0;  
         for(int i=0; i < n; i++)
         {  
                 for(int j=1; j < (n-i); j++)
                 {  
                          if(array[j-1] > array[j])
                          {
                                 temp = array[j-1];  
                                 array[j-1] = array[j];  
                                 array[j] = temp;  
                          }
                 }
         }
         
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < array.length; i++){  
        	 System.out.print(array[i] + " ");  
         }  
}
}
                  
                          


