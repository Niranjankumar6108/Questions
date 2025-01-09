// 14.1
// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         int[][] grid = new int[3][3];
//         grid[0][0]=10;
//         grid[0][1]=20;
//         grid[0][2]=30;
//         grid[1][0]=40;
//         grid[1][1]=50;
//         grid[1][2]=60;
//         grid[2][0]=70;
//         grid[2][1]=80;
//         grid[2][2]=90;
//         System.out.println(grid[0][1]);
//     }
// }

// //14.2

// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int[2][3];
//         int m = arr.length;// no of row//lines
//         int n = arr[0].length;// no of cols
//         // input of 2d arr
//         for(int i=0;i<2;i++){//row
//             for(int j=0;j<3;j++){//col
//                 arr[i][j]=sc.nextInt();
//             }
//         }

//         //output of 2d Array
//         for(int i=0;i<2;i++){//row
//             for(int j=0;j<3;j++){//col
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }


//14.3 print for each loop

// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         int[] a = {4,7,2,8};
//         for(int ele:a){
//             System.out.print(ele+" ");
//         }
//         System.out.println();
//         // 1 2 3 
//         //4 5 6 
//         int[][] b = {{1,2,3},{4,5,6}};
//         for(int[] ele : b){
//             for(int x : ele){
//                 System.out.print(x+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }


// 14.4 Question-1

// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][]arr = new int[4][2];
//         for(int i=0;i<4;i++){
//             for(int j=0;j<2;j++){
//                 arr[i][j]=sc.nextInt();
//             }
            
//         }
//         for(int i=0;i<4;i++){
//             for(int j=0;j<2;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
        
//     }
// }

// //14.5(Question-2) largest element in 2d array
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][]arr = {{1,50,6},{2,-9,3},{5,10,3}};
//         int mx = Integer.MIN_VALUE;
//         int m = arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 mx=Math.max(mx, arr[i][j]);
//             }  
//         }
//         System.out.println(mx); 
//     }
// }

// //14.5(Question 3) largest element in 2d array
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][]arr = {{1,50,6},{2,-9,3},{5,10,3}};
//         int mx = Integer.MIN_VALUE;
//         int m = arr.length;
//         int n = arr[0].length;
//         int sum=0;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 mx=Math.max(mx, arr[i][j]);
//                 sum+=arr[i][j];
//             }  
//         }
//         System.out.println(mx); 
//         System.out.println(sum); 
//     }
// }


// //14.6(Question 4) sum 2 matrix in 1 matrix
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = {{1,9,2},{3,7,4},{8,5,6}};
//         int[][] b = {{9,3,7},{8,6,5},{2,4,1}};
//         int mx = Integer.MIN_VALUE;
//         int m = a.length;
//         int n = a[0].length;
//         int[][] ans = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 ans[i][j]=a[i][j]+b[i][j];
//             }  
//         }
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(ans[i][j]+" ");
//             } 
//             System.out.println(); 
//         }
//     }
// }


// //14.7(Question 5)row  wise print
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = {{1,2},{3,4},{5,6}};
//         int m = a.length;
//         int n = a[0].length;
//         for(int i=0;i<m;i++){//row wise last me sout nhi lekhenge to bhi hoga
//             for(int j=0;j<n;j++){
//                 System.out.print(a[i][j]);
//             } 
//             System.out.println(); 
//         }
//     }
// }

//14.7(Question 5) col wise print
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = {{1,2},{3,4},{5,6}};
//         int m = a.length;
//         int n = a[0].length;
//         for(int j=0;j<n;j++){// col
//             for(int i=0;i<m;i++){// row
//                 System.out.print(a[i][j]+" ");
//             } 
//             System.out.println(); 
//         }
//     }
// }


//14.7(Question 5) col(Transpose) store in a new arr
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[][] a = {{1,2},{3,4},{5,6}};
//         int m = a.length;
//         int n = a[0].length;
//         for(int j=0;j<n;j++){// col
//             for(int i=0;i<m;i++){// row
//                 System.out.print(a[i][j]+" ");
//             } 
//             System.out.println(); 
//         }
//         System.out.println();

//         // storing 
//         int[][] transpo = new int[n][m];
//         for(int i=0;i<n;i++){// col
//             for(int j=0;j<m;j++){// row
//                 transpo[i][j] = a[j][i];
//                 System.out.print(transpo[i][j]+" ");
//             } 
//             System.out.println(); 
//         }
//     }
//}


// //14.7(Question 6) TransformIntoTranspose
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void print(int[][] arr){
//         int m=arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//         int m=arr.length;// squ hai to n bhi same hoga m ke 
//         print(arr);
//         for(int i=0;i<m;i++){
//             for(int j=0;j<i;j++){
//                 int temp = arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//        }
//        print(arr);
//     }
// }



// //14.8(Question 7) Rotate 90 degree
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void print(int[][] arr){
//         int m=arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     // Transpose
//     public static void main(String[] args) {
//         int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
//         int m=arr.length;// squ hai to n bhi same hoga m ke 
//         print(arr);
//         for(int i=0;i<m;i++){
//             for(int j=0;j<i;j++){
//                 int temp = arr[i][j];
//                 arr[i][j]=arr[j][i];
//                 arr[j][i]=temp;
//             }
//        }
//        print(arr);
//        // rotate 90->transpose->reversev each rows
//        for(int i=0;i<m;i++){
//             int a=0;
//             int b=m-1;
//         // swap arr[i][a] and arr[i][b]
//             while(a<b){
//                 int temp = arr[i][a];
//                 arr[i][a]= arr[i][b];
//                 arr[i][b]=temp;
//                 a++;
//                 b--;
//             }
//         }
//         print(arr);
//     }
// }



// //14.9(Question 8) Wave print
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void print(int[][] arr){
//         int m=arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     // Transpose
//     public static void main(String[] args) {
//         int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//         int n = arr[0].length;
//         int m=arr.length;// squ hai to n bhi same hoga m ke 
//         print(arr);
//         // Wave print
//         for(int i=0;i<m;i++){
//             if(i%2==0){
//                 for(int j=0;j<n;j++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             else{
//                 for(int j=n-1;j>=0;j--){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//         // print(arr);
//     }
       
        
// }


// //14.9(Question 8 ka example) Wave print Example
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void print(int[][] arr){
//         int m=arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     // Transpose
//     public static void main(String[] args) {
//         int[][] arr= {{1,2,3},{6,7,8},{11,12,13}};
//         int n = arr[0].length;
//         int m=arr.length;// squ hai to n bhi same hoga m ke 
//         print(arr);
//         // Wave print
//         for(int j=0;j<n;j++){
//             if(j%2==0){
//                 for(int i=0;i<m;i++){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//             else{
//                 for(int i=n-1;i>=0;i--){
//                     System.out.print(arr[i][j]+" ");
//                 }
//             }
//         }
//         // print(arr);
//     }
       
        
// }


// //14.10(Question 9) Spiral Print
// import java.util.Scanner;

// public class TwoDimensionalArray {
    // public static void print(int[][] arr){
    //     int m=arr.length;
    //     int n = arr[0].length;
    //     for(int i=0;i<m;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print(arr[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println();
    // }
//     public static void main(String[] args) {
//         int[][] arr= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
//         int n = arr[0].length;
//         int m=arr.length;// squ hai to n bhi same hoga m ke 
//         print(arr);
//         // Spiral print
//         int minr=0;
//         int maxr=m-1;
//         int minc=0;
//         int maxc=n-1;
//         while(minr<=maxr && minc<=maxc){
//             // left to right row constant
//             for(int j=minc;j<=maxc;j++){
//                 System.out.print(arr[minr][j]+" ");
//             }
//             minr++;
//             // top to bottom
//             if(minr>maxr || minc>maxc) break;
//             for(int i=minr;i<=maxr;i++){
//                 System.out.print(arr[i][maxc]+" ");
//             }
//             maxc--;
//             // right to left row constant
//             if(minr>maxr || minc>maxc) break;
//             for(int j=maxc;j>=minc;j--){
//                 System.out.print(arr[maxr][j]+" ");
//             }
//             maxr--;
//             // bottom to top
//             if(minr>maxr || minc>maxc) break;
//             for(int i=maxr;i>=minr;i--){
//                 System.out.print(arr[i][minc]+" ");
//             }
//             minc++;
//         }
//     }
       
        
// }



//14.12  2D array
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class TwoDimensionalArray {
//     public static void main(String[] args){
//        List<Integer> a = new ArrayList<>();
//        a.add(10);a.add(20);a.add(30);
//        List<Integer> b = new ArrayList<>();
//        b.add(40);b.add(50);
//        List<Integer> c = new ArrayList<>();
//        List<Integer> d = new ArrayList<>();
//        d.add(60);
//        List<List<Integer>> l = new ArrayList<>();
//        l.add(a);l.add(b);l.add(c);l.add(d);
//        for(int i=0;i<l.size();i++){
//         // System.out.println(l.get(i));
//         List<Integer> x = l.get(i);
//         for(int j=0;j<x.size();j++){
//             System.out.print(x.get(j)+" ");
//         }
//         System.out.println();

//        }
//     //    System.out.println(l.get(1).get(1));
       
//     }
       
        
// }

// 14.4 Question 11 Multiplication of wo marix
// public class TwoDimensionalArray {
//     public static void main(String[] args){
//         int[][] a = {{1,2,1},{2,1,2}};
//         int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
//         if(a[0].length!=b.length){
//             System.out.println("Multiplication not possible");
//         }
//         else{// Multiplication possible
//             int[][] c = new int[a.length][b[0].length];
//             for(int i=0;i<c.length;i++){
//                 for(int j=0;j<c[0].length;j++){
//                     // c[i][j]=a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j]+....;
//                     for(int k=0;k<b.length;k++){
//                         c[i][j]+=a[i][k]*b[k][j];
//                     }
//                     System.out.print(c[i][j]+" ");
//                 }
//                 System.out.println();

//             }
//         }
       
//     }
// }
       
 
// 14.4 Question 11
// public class TwoDimensionalArray {
//     public static void print(int[][] arr){
//         int m=arr.length;
//         int n = arr[0].length;
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(arr[i][j]+" ");
//             }
//             System.out.println();
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int[][] a = {{1,2,1},{2,1,2}};
//         int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
//         if(a[0].length!=b.length){
//             System.out.println("Multiplication not possible");
//         }
//         else{// Multiplication possible
//             int[][] c = new int[a.length][b[0].length];
//             for(int i=0;i<c.length;i++){
//                 for(int j=0;j<c[0].length;j++){
//                     // c[i][j]=a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j]+....;
//                     for(int k=0;k<b.length;k++){
//                         c[i][j]+=a[i][k]*b[k][j];
//                     }
//                 }
//             }
//             print(a);
//             print(b);
//             print(c);
//         }
       
//     }
// }


// 14.5 Question 12
public class TwoDimensionalArray {
    public static void main(String[] args){
       
    }
}

