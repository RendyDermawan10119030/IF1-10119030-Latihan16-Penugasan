package if1.pkg10119030.latihan16.penugasan;
/*
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program :Latihan Relational
 */  
public class IF110119030Latihan16Penugasan {

    public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 0;
    System.out.println("Nilai a = " + a);
    System.out.println("Nilai b = " + b);
    System.out.println("Nilai c = " + c+"\n");
    
    c = a + b;
    System.out.println("c = a + b = " + c);
    c += a;
    System.out.println("c += a = " + c);
    c -= a;
    System.out.println("c -= a = " + c);
    c *= a;
    System.out.println("c *= a = " + c);
    a = 10;
    c = 15;
    c /= a;
    System.out.println("c /= a = " + c);
    a = 10;
    c = 15;
    c %= a;
    System.out.println("c %= a = " + c);
    c <<=2;
    System.out.println("c <<= 2 = " + c);
    c >>=2;
    System.out.println("c >>= 2 = " + c);
    c >>=a;
    System.out.println("c >>= a = " + c);
    c &= a;
    System.out.println("c &= 2 = " + c);
    c ^= a;
    System.out.println("c ^= a = " + c);
    c |= a;
    System.out.println("c |= a = " + c);
    }
    
}
