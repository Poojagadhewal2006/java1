public class NumberCount {
    public static void main(String[] args) {
        
        int n=234;
        int count=0;
        if(n==0)
        {
            count = 1;
        }
        else
        {
            while(n>0)
            {
                n = n/10;
                count ++;
            }
        }
        System.out.println("The Number Of Digit :" + count);
    }
}
