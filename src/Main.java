public class Main {
    public static void main(String[] args) {
        //Compound-assignment operators provide a shorter syntax for assigning the result of an arithmetic or bitwise operator.
        // They perform the operation on the two operands before assigning the result to the first operand.
        float a = 1093.5f;
         a*=29; //a=a*29;
         double b = 3482937.37474;
         b%=37; //b=b%37;
         int c= 32;
         int d=245, e=300,k=20,l=10;
         System.out.println(a);
        System.out.println(b);
        System.out.println("binary form of c="+" "+Integer.toBinaryString(c));
        System.out.println("binary form of 100="+" "+Integer.toBinaryString(100));
        c &= 100; //c=c&100
        System.out.println("After performing compound Bitwise & assignment operator between c and 100="+" "+Integer.toBinaryString(c));
        System.out.println("binary form of d="+" "+Integer.toBinaryString(d));
        System.out.println("binary form of 25="+" "+Integer.toBinaryString(25));
        d^=25; // d=d^25
        System.out.println("After performing compound Bitwise ^ assignment operator between d and 25="+" "+Integer.toBinaryString(d));
        System.out.println("binary form of e="+" "+Integer.toBinaryString(e));
        e>>=3; //e=e>>3
        System.out.println("After performing compound Bitwise right shift assignment operator by shifting 3 bits of e="+" "+Integer.toBinaryString(e));
        e<<=5; //e=e<<5
        System.out.println("After performing compound Bitwise left shift assignment operator by shifting 5 bits of e="+" "+Integer.toBinaryString(e));
        e>>>=2; //e=e>>>2
        System.out.println("After performing compound right-shift filled 0 assignment operator on e (2bits shifting)="+" "+Integer.toBinaryString(e));
        System.out.println("binary form of k="+" "+Integer.toBinaryString(k));
        System.out.println("binary form of l="+" "+Integer.toBinaryString(l));
        k |= l; //k=k|l
        System.out.println("After performing compound Bitwise | assignment operator between k and l=" + " "+Integer.toBinaryString(k));
    }
}
