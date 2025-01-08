// import java.util.Scanner;

// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             System.out.print("Enter ellement for index-"+i+":");
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Array elements :");
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// ///Qs-2(Marks)

// import java.util.Scanner;

// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the marks :");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<n;i++){
//             if(arr[i]<35){
//                 System.out.print(i);
//             }
//         }
//     }
// }


// //Qs-3(sum of all element)

// import java.util.Scanner;

// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the marks :");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int sum=0;
//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//         }
//         System.out.print("Sum of all the Element is :"+sum);
//     }
// }


// //Qs-4(Search element 8 in array found at index)


// import java.util.Scanner;

// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the marks :");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the target number:");
//         int target=sc.nextInt();
//         int index=-1;
//         for(int i=0;i<n;i++){
//             if(arr[i]==target){
//                 index=i;
//                 break;
//             }
//         }
//         if(index!=-1) System.out.println("Element "+ target+" fount at index :"+index);
//         else System.out.println("Element "+target+" not fount in the array.");
//     }
// }



// //Qs-5(Max element in array)

// import java.util.Scanner;
// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the array element :");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        // }
//         System.out.println("Max element in the array is : "+max);
//     }
// }


// //Qs-6(Second largest element)


// import java.util.Scanner;
// public class ClassQs {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Size of array :");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         System.out.print("Enter the array element :");
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int fmax=Integer.MIN_VALUE;
//         int Smax=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]>fmax){
//                 Smax=fmax;
//                 fmax=arr[i];
//             }
//             else if(arr[i]>Smax && fmax !=arr[i]){
//                 Smax=arr[i];  
//             }
//         }
//         if(Smax!=Integer.MIN_VALUE) System.out.println("Second max is :"+Smax);
//         else System.out.println("Second max is not found.");
//     }
// }

// //Qs-7(Second largest element)

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {1,2,3,4,5,6,7,8,10};
//         int x = 5;
//         int count = 0;
//         for(int num : arr){
//             if(num>x){
//                 count++;
//             }
//         }
//         System.out.println("Numb of grater then "+x+":"+count);
//     }
// }


// //Qs-8(find the doublet in array)

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {2,5,8,4,15,11,10};
//         int n = arr.length;
//         int x = 18;
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==x){
//                     System.out.print("Doublet with sum "+ x +" : "+arr[i] +" "+ arr[j]);
//                 }
//             }
//         }
//     }
// }


//Qs-9(find the doublet in array)

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] originalArr = {1,2,3,4,5};
//         int[] reverseArr = new int[originalArr.length];
//         for(int i=0;i<originalArr.length;i++){
//             reverseArr[i]=originalArr[originalArr.length-1-i];
//         }
//         System.out.print("OriginalArr : ");
//         displayArray(originalArr);
//         System.out.print("reverseArr : ");
//         displayArray(reverseArr);
//     }
//     static void displayArray(int[] arr){
//         for(int num : arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
//     }
// }

// // 9 Question reverse array without using extra array

// // package arrays;
// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60,70};
//         int n=arr.length;
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         //reverse
//         for(int i=0;i<n/2;i++){
//             int j=n-1-i;
//             int temp = arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
// }

// // Method 2
// // 9 Question reverse array without using extra array
// // using two pointer but while loop
// // package arrays;
// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60};
//         int n=arr.length;
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         //reverse
//         int i=0;
//         int j=n-1;
//         while(i<=j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
// }


// // Method 3

// // 9 Question reverse array without using extra array
// // using two pointer but while loop
// // package arrays;
// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60,80};
//         int n=arr.length;
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         //reverse
//         int i=0;
//         int j=n-1;
//         while(i<=j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
//     public static void swap(int[] arr,int i,int j) {
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }



// // Method 4 reverse Part of array

// // 10,20,30,40,50,60,90,95 me 30 se 90 tak reverse
// // package arrays;
// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr = {10,20,30,40,50,60,90,95};
//         int n=arr.length;
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         //reverse
//         int i=2;
//         int j=6;
//         while(i<=j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
//     public static void swap(int[] arr,int i,int j) {
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
// }




// // Question 10 Rotate
// // Rotate the given array 'a' by k steps where k is non-negative,without using extra array
// // Note: k can be grater than n as well where n is the size of array 'a'

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
        
//     }
// }


// Question 11 
// Sort 0's and 1's

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={1,0,0,1,1,0,0,0,1,0};
//         int n=arr.length;
//         int noOfZeros=0;
//         // int noOfOnes = 0;
//         for(int i=0;i<n;i++){
//             if(arr[i]==0) noOfZeros++;
//             // else noOfOnes++;
//         }
//         for(int i=0;i<n;i++){
//             if(i<noOfZeros) arr[i]=0;
//             else arr[i]=1;
//         } 
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//     }
// }


// // Question 11 
// // Sort 0's and 1's 
// // one pass solution

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={1,0,0,1,1,0,0,0,1,0};
//         int n=arr.length;
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             if(arr[i]==0) i++;
//             if(arr[j]==1) j--;
//             if(i>j) break;// yiska koi jaruri nhi niche likh diye hai
//             if(i<j &&& arr[i]==1 && arr[j]==0){
//                 arr[i]=0;
//                 arr[j]=1;
//                 i++;
//                 j--;
//             }
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }


// Question 11 
// Sort 0's and 1's 
// one pass solution

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={1,0,0,1,1,0,0,0,1,0};
//         int n=arr.length;
//         int i=0;
//         int j=n-1;
//         while(i<j){
//             if(arr[i]==0) i++;
//             else if(arr[j]==1) j--;
//             // if(i>j) break;
//             else if(arr[i]==1 && arr[j]==0){
//                 arr[i]=0;
//                 arr[j]=1;
//                 i++;
//                 j--;
//             }
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }


// //Question 12 (method-1)
// //Sort 0's and 1's and 2's
// //Two pass solution

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={0,1,2,0,1,2,1,2,0,0};
        // int n=arr.length;
        // int noOfZeros=0;
        // int noOfOnes=0;
        // int j=n-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0) noOfZeros++;
        //     if(arr[i]==1) noOfOnes++;
        // }
        // for(int i=0;i<n;i++){
        //     if(i<noOfZeros) arr[i]=0;
        //     else if(i<noOfZeros+noOfOnes) arr[i]=1;
        //     else arr[i]=2;
        // }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }


// //Question 12 (method-2)
// //Sort 0's and 1's and 2's
// //hree pointer use

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={0,1,2,0,1,0,0,2,1,2,0,0,1};
//         int n=arr.length;
//         int mid=0;
//         int lo=0;
//         int hi=n-1;
//         while(mid<=hi){
//             if(arr[mid]==0){
//                 int temp=arr[mid];
//                 arr[mid]=arr[lo];
//                 arr[lo]=temp;
//                 lo++;
//                 mid++;
//             }
//             else if(arr[mid]==1) mid++;
//             else{//arr[mid]==2
//                 int temp=arr[mid];
//                 arr[mid]=arr[hi];
//                 arr[hi]=temp;
//                 hi--;
//             }
//         }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }




// //Question 13 ()
// //Merge two sorted arr in one sorted arr sort

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] a ={11,33,42,71};
//         int[] b ={26,54,69,81,94};
//         int m=a.length;
//         int n=b.length;
//         int[] c = new int[a.length+b.length];
//         int i=0;
//         int j=0;
//         int k=0;
//         //Merging 
//         while(i<a.length&&j<b.length){
//             if(a[i]<=b[j]){
//                 c[k]=a[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 c[k] = b[j];
//                 j++;
//                 k++;
//             }
//         }
//         if(i==a.length){// now take elem from b only
//             while(j<b.length){
//                 c[k]=b[j];
//                 j++;
//                 k++;
//             }
//         }
//         if(j==b.length){// now take elem from a only
//             while(i<a.length){
//                 c[k]=a[i];
//                 i++;
//                 k++;
//             }
//         }
//         for(int ele:c){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }



// //Question 14 (Mth-1)
// //Next gratest element

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={12,8,41,37,2,49,16,28,21};
        // int n=arr.length;
        // int[] ans =new int[n];
        // ans[n-1]=-1;
        // for(int i=0;i<n-1;i++){
        //     int mx = Integer.MIN_VALUE;
        //     for(int j=i+1;j<n;j++){
        //         mx=Math.max(mx, arr[j]);
        //     }
        //     ans[i]=mx;
        // }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         for(int ele:ans){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }


//Question 14 (Mth-2)
//Next gratest element

// import java.util.Arrays;
// //import java.lang.reflect.Array;

// public class ClassQs {
//     public static void main(String[] args) {
//         int[] arr ={12,8,41,37,2,49,16,28,21};
        // int n=arr.length;
        // int[] ans =new int[n];
        // ans[n-1]=-1;
        // int nge = arr[n-1];
        // for(int i=n-2;i>=0;i--){
        //     ans[i]=nge;
        //     nge = Math.max(nge,arr[i]);
        // }
//         for(int ele:arr){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         for(int ele:ans){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
        
//     }
// }







// public class ClassQs {
//     public static void main(String[] args) {
//         int[] originalArr = {1,2,3,4,5,6};
//         System.out.print("OriginalArr : ");
//         displayArray(originalArr);
//         reverseArr(originalArr);
//         System.out.print("ReverseArr : ");
//         displayArray(originalArr);
//     }
//     static void reverseArr(int[] arr){
//         int start = 3;
//         int end = arr.length-2;
//         while (start<end) {
//             int temp = arr[start];
//             arr[start]=arr[end];
//             arr[end]=temp;
//             start++;
//             end--;
//         }
//     }
//     static void displayArray(int[] arr){
//         for(int num : arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
//     }
// }




