// import java.util.Scanner;

// public class MergeTwoArray {

//     static int[] mergeArr(int[] arr1, int[] arr2, int n1, int n2)
//     {
        
//         int c[] = new int[n1+n2-1];
//         int i=0, j=0, k=0;
//         while(i<n1 && j<n2)
//         {
//             if(arr1[i]<arr2[j])
//                 c[k++] = arr1[i];
//             else 
//                 c[k++] = arr2[k];
//         }
//         while(i<n1)
//             c[k++] = arr1[i++];
//         while(j<n2)
//             c[k++] = arr1[j++];
        
//         return c;
//     }
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         int n1 = sc.nextInt();
//         int[] a = new int[n1];
//         for(int i=0; i<n1; i++)
//             a[i] = sc.nextInt();
//         int n2 = sc.nextInt();
//         int[] b = new int[n2];
//         for(int i=0; i<n2; i++)
//             b[i] = sc.nextInt();
//         sc.close();
//         System.out.println(mergeArr(a, b, n1, n2));

//     }
// }
