public class CopyElementsAnotherArray {
    public static void main(String[] args) {
        int arr1[] = {5,10,15};
        int arr2[] = new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i] = arr1[i];
        }
        System.out.println("Copied Array :");
        for(int val : arr2)
        {
            System.out.println(val + " ");
        }
    }
}
