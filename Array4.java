public class Array4 {
   public static void main(String[] args) {
    int arr[] = {4,5,6,0,-1};
       int min = 0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]<min)
        {
          min = arr[i];
        }
       }
     System.out.println(min);
     
   } 
}
