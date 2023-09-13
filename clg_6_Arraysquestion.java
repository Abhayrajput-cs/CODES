public class clg_6_Arraysquestion {
    
    public static void main(String[] args) {
    //Add element of Array:
        // int[] a={1,2,3};
        // int sum=0;
        // for(int i=0;i<(a.length);i++){
        //     sum= sum+a[i];
        // }
        // System.out.println(sum);

    //Largest element:
        // int[] a={1,2,3};
        // int max = Integer.MIN_VALUE;
        // for(int i=0;i<(a.length);i++){
        //     if(max<a[i]) max=a[i];
        // }
        // System.out.println(max);

    //Even & Odd count:
        // int []a={1,2,3,4,5,6};
        // int b=0;
        // int c=0;
        // for(int i=0;i<(a.length);i++){
        //     if(a[i]%2==0){
        //         b++;
        //     }
        //     else{
        //         c++;
        //     }
        // }
        // System.out.println(b);
        // System.out.println(c);

    //Reverse loop:
        // int[] b = {23,45,56,67,78};
       // for(int i=b.length-1; i>=0; i--){
      //    System.out.println(b[i]);
     // }

    //Bubble sorting:
       int[] a = {1,3,2,4,5};
       for(int i=0; i<a.length;i++){
        for(int j=0; j<a.length-1;j++){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
        }
        System.out.println(a[i]);
       }

    
    }
}
