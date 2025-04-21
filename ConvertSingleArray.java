public class ConvertSingleArray {
    public static void main(String[] args) {
        int [] [] arr = { {1,2,3,4},{3,4,5,6},{4,5,6,7}};
        int totalcount=0;
         for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println(totalcount);
                totalcount++;
            }
        }
      /*   for(int i=0;i<arr.length;i++)
        {
            totalcount = totalcount + arr[i].length;
        }
        System.out.println(totalcount);*/
    }
}
