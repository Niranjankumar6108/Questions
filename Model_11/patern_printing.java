
//----- Rectangle----11.1
// m row-->number of lines,
//n col-->how much in each line

import java.util.Scanner;;
public class patern_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=3;i++){ // rows
            for(int j=1;j<=5;j++){ //cols
                System.out.print(2*i-1);
            }
            System.out.println();
        }
    }
}

//--------- 2 nd types-------
//Question. 1
// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of row:");
//         int m = sc.nextInt();
//         System.out.print("Enter the number of Column:");
//         int n = sc.nextInt();
//         for(int i=1;i<=m;i++){ // rows
//             for(int j=1;j<=n;j++){ //cols
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

//Question. 2--- Stars Squares ------- 11.1
// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of row:");
//         int m = sc.nextInt();
//         for(int i=1;i<=m;i++){ // rows
//             for(int j=1;j<=m;j++){ //cols
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//Question. 3--- number 1234 Squares ------- 11.1

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=num;j++){ //cols
//                 System.out.print(j+" "); // odd number ke liye 2*j-1
//             }
//             System.out.println();
//         }
//     }
// }


// //Question. 4--- number 1 1 1 1 Squares ------- 11.1

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=num;j++){ //cols
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// //Question. 5--- number A B C D Squares ------- 11.1

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=num;j++){ //cols
//                 System.out.print((char)(j+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// //Question. 6--- number A A A A Squares ------- 11.1

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=num;j++){ //cols
//                 System.out.print((char)(i+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// Question. 7--- number a a a a Squares ------- 11.1

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=num;j++){ //cols
//                 System.out.print((char)(i+96)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// //Question.1--- *,**,***,****Triangles ------- 11.2
// // square->i->1 to n,j->1 to n
// // tri->i->1 to n, j->1 to i
// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// //Question.2--- 1,12,123,1234 Triangles ------- 11.2

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }



//Question.3---  1,22,333,4444 Triangles ------- 11.2

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }


//Question.4---  A,AB,ABC,ABCD Triangles ------- 11.2

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print((char)(j+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//Question.5---  A,BB,CCC,DDDD Triangles ------- 11.2

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print((char)(i+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// //Question.6---  A,AB,ABC,ABCD Triangles ------- 11.2
// // sahi karna hai galt hai

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print((char)(j+94)+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// Hw Question.7---  1,AB,123,ABCD,12345 Triangles ------- 11.2
// sahi karna hai galt hai if else se
// if else se check karna hai

// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();
//         for(int i=1;i<=num;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print((char)(j+94)+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// i=1;i<=n;i++
// j=1;j<=n;j++;  yis se squre print hota hai

// i=1;i<=n;i++
// j=1;j<=i;j++;  yis se tringle print hota hai

// i=1;i<=n;i++
// j=1;j<=n+1-i;j++;  yis se horigontal flipped tringle print hota hai

//Question.8--- horigontal trin *****,***,**,* Triangles ------- 11.2
// All type 1234,123,12,1-->1111,222,33,4-->ABCD,ABC,AB,A-->AAAA,BBB,CC,D


// import java.util.Scanner;;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n+1-i;j++){ //cols
//                 System.out.print((char)(i+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//Question.1--- Spacel Patterns-1 ------- 11.3

// 1,13,135,1357 print

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         // Method 1st

//         // for(int i=1;i<=n;i++){ // rows
//         //     for(int j=1;j<=i;j++){ //cols
//         //         System.out.print(2*j-1);
//         //     }
//         //     System.out.println();
//         // }

//         // //Method 2nd

//         // for(int i=1;i<=n;i++){ // rows
//         //     for(int j=1;j<=2*i-1;j+=2){ //cols
//         //         System.out.print(j+" ");
//         //     }
//         //     System.out.println();
//         // }

//         //Method 3rd

//         for(int i=1;i<=n;i++){ // rows
//             int a = 1;
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print(a+" ");
//                 a+=2;
//             }
//             System.out.println();
//         }
//     }
// }


//-------- Floya's Triangle-----11.3
//Question.2 1,23,456,78910


// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int a = 1;
//         for(int i=1;i<=n;i++){ // rows
           
//             for(int j=1;j<=i;j++){ //cols
//                 System.out.print(a+" ");
//                 a+=1;
                
//             }
//             System.out.println();
//         }
//     }
// }


//-------- Special Patterns-2---11.4
//Question.1  Sum ka logo jaisa hota hai(number odd hi rkhana hai)


// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         int mid = n/2+1;
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n;j++){ //cols
//                 if(i==mid || j==mid){
//                     System.out.print("*"+" ");
//                 }
//                 else {
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// //-------- Special Patterns-2---11.4
// //Question.2 Star Cross (number odd hi rkhana hai)


// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n;j++){ //cols
//                 if(i==j || i+j==n+1){
//                     System.out.print("*"+" ");
//                 }
//                 else {
//                     System.out.print(" "+" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// //-------- Special Patterns-2---11.4
// //Question.2 Binary triangle (n kuch vi odd ya even)


// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=i;j++){ //cols

//                 // Method 1st

//                 if(i%2==1){
//                     if(j%2==1){
//                         System.out.print("1"+" ");
//                     }
//                     else{
//                         System.out.print("0"+" ");
//                     }
//                 }
//                 else {
//                     if(j%2==0){
//                         System.out.print(1+" ");
//                     }
//                     else{
//                         System.out.print(0+" ");
//                     }
//                 }

//                 // Method 2nd

//                 // if((i+j)%2==0) System.out.print(1+" ");
//                 // else System.out.print(0+" ");
//             }
//             System.out.println();
//         }
//     }
// }



//-------- Special Patterns-2---11.4
//Question.4 Bin (n kuch vi odd ya even)


// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n;j++){ //cols
//                 if(i+j>n){
//                     System.out.print("*"+" ");// 2nd bar (i+" ")
//                 }
//                 else {
//                     System.out.print("-"+" "); // 2nd("i"+" ") 2nd to not dikat
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//---------- Composite------11.5

// // question.1 Vertical triangle Flipped

// ###*,##**,#***,****

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows ###,##,#
//             for(int j=1;j<=n-i;j++){ //cols // j=n+1-i mese 1 ko hataye hai
//                 System.out.print("#"+" ");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print("*"+" "); // *,**,***,****
//             }
//             System.out.println();
//         }
//     }
// }


// question.2  Number Vertical triangle Flipped---11.5

//enter the  number:6
// 1,12,123,1234,12345,123456

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n-i;j++){ //cols
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// question.3  Number Vertical triangle Flipped--11.5


//enter the  number:4
// A,AB,ABC,ABCD

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n-i;j++){ //cols
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<i;j++){
//                 System.out.print((char)(j+64)+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// question.4  Rhomnus --11.5

//enter the  number:4
// ---****,--****,-****,****

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n-i;j++){ //cols
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// Question.5  StarPyramid --11.5

//enter the  number:4
// ---****,--****,-****,****

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n-i;j++){ // Spaces
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=2*i-1;j++){ //cols // Star
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//         }
//     }
// }


// // Question.5  StarPyramid --11.5 Method-2

// //enter the  number:4
// // ---****,--****,-****,****

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int nsp=n-1;//start(suru)
//         int nst=1;// start
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=nsp;j++){ // Spaces
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=nst;j++){ //cols // Star
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//             nsp--;
//             nst+=2;
//         }
//     }
// }


//------------ Number Pyramid Palindrom------ 11.6


// // Question.1  Number Pyramid Palindrom

// //enter the  number:4
// // 1,121,12321,1234321

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n-i;j++){ // Spaces
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=i;j++){ // Spaces
//                 System.out.print(j+" ");
//             }
//             for(int j=i-1;j>=1;j--){ // Spaces
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// // Question.2 Star Bridge--11.6

// //enter the  number:4
// // *******,***-***,**---**,*-----*

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
         
//         for(int i=1;i<=n*2-1;i++) System.out.print("*"+" ");
//         System.out.println();
//         n--;
//         int nsp=1;
//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=n+1-i;j++){ // Star
//                 System.out.print("*"+" ");
//             }
//             for(int j=1;j<=nsp;j++){ // Spaces //nsp hata ke j<=2*i-1
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=n+1-i;j++){ // Star
//                 System.out.print("*"+" ");
//             }
//             System.out.println();
//             nsp+=2;
//         }
//     }
// }



// // Question.1 Number Bridge--11.7

// //enter the  number:4
// // 123456789,1234-6789,123--789,12----89,1-------9

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
         
//         for(int i=1;i<=n*2-1;i++) System.out.print(i+" ");
//         System.out.println();
//         n--;
//         int nsp=1;
//         for(int i=1;i<=n;i++){ // rows
//             int a=1;
//             for(int j=1;j<=n+1-i;j++){ // number
//                 System.out.print(a++ +" ");
//             }
//             for(int j=1;j<=nsp;j++){ // Spaces //nsp hata ke j<=2*i-1
//                 System.out.print(" "+" ");
//                 a++;//very important
//             }
//             nsp+=2;
//             for(int j=1;j<=n+1-i;j++){ // number
//                 System.out.print(a++ +" ");
//             }
//             System.out.println();
            
//         }
//     }
// }



// Question.1 Star diamond--11.8

//enter the  number:4
// 123456789,1234-6789,123--789,12----89,1-------9

// import java.util.Scanner;
// public class patern_printing {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();

//         int nsp=n-1;
//         int nst=1;

//         for(int i=1;i<=n;i++){ // rows
//             for(int j=1;j<=nsp;j++){ // Space
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=nst;j++){ // Spaces //nsp hata ke j<=2*i-1
//                 System.out.print("*"+" ");
//             }
//             nsp--;
//             nst+=2;
//             System.out.println();
            
//         }

//         nsp=1;
//         nst=nst-4;

//         for(int i=1;i<=n-1;i++){ // rows
//             for(int j=1;j<=nsp;j++){ // Space
//                 System.out.print(" "+" ");
//             }
//             for(int j=1;j<=nst;j++){ // Spaces //nsp hata ke j<=2*i-1
//                 System.out.print("*"+" ");
//             }
//             nsp++;
//             nst-=2;
//             System.out.println();
            
//         }
//     }
// }