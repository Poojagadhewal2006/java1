public class Arrays {
   public static void main(String[] args) {
      
   int arr[] = {-4,0,5,5,0,0,-5};
   int index=0;
   int newArr[] = new int[arr.length];
   for(int i=0;i<arr.length;i++)
   {
      if(arr[i] < 0)
      {
         newArr[index++] = arr[i];
      }
   }
   
   for(int j=0;j<arr.length;j++)
   {
      if(arr[j] == 0)
      {
         newArr[index++] =arr[j];
      }
   }
   for(int k=0;k<arr.length;k++)
   {
      if(arr[k] > 0)
      {
         newArr[index++] = arr[k];
      }
   }
   for(int p : newArr){
   System.out.println(p);
   }
}
}
