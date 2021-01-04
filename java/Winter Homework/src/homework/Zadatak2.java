package homework;

public class Zadatak2 {

public static void main (String[] args) {

    final int N = 15;

    System.out.print("   |");
    for (int i = 1; i <= N; i++)
       System.out.print(pad(i) + " ");
    System.out.println();
    
    System.out.print("---+");
    for (int i = 1; i <= N; i++)
       System.out.print("----");
    System.out.println();
    
    for (int i = 1; i <= N; i++) {
       System.out.print(pad(i) + "|");
       for (int j = 1; j <= N; j++) {
          System.out.print(pad(i*j) + " ");
       }
       System.out.println();
    }
 } 

 
 public static String pad(int x) {
    String s = new String();
    if (x < 10) s = "  " + x;
    else if (x < 100) s = " " + x;
    else s = "" + x;
    return s;
 }

}