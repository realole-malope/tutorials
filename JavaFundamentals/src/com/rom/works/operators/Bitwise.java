package com.rom.works.operators;

public class Bitwise {
    public static void main(String[] args) {
        final int a = 9;
        final int b = 3;
        System.out.println("a = " + Integer.toString(a, 2));
        System.out.println("b = " + Integer.toString(b, 2));
        System.out.println("================================& Binary AND Operator copies a bit to the result if it exists in both operands.");
        System.out.println("a&b\t\t=" + Integer.toString(a & b, 2));
        System.out.println("================================| Binary OR Operator copies a bit if it exists in either operand.");
        System.out.println("a|b\t\t=" + Integer.toString(a | b, 2));
        System.out.println("================================^ Binary XOR Operator copies the bit if it is set in one operand but not both.");
        System.out.println("a^b\t\t=" + Integer.toString(a ^ b, 2));
        System.out.println("================================~ Binary Ones Complement Operator is unary and has the effect of 'flipping' bits");
        System.out.println("~a vs ~b\t\t=" + Integer.toString(~a, 2) + " vs " + Integer.toString(~b, 2));
        System.out.println("================================<<  Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.");
        System.out.println("a<<b\t\t=" + Integer.toString(a << b, 2));
        System.out.println("b<<a\t\t=" + Integer.toString(b << a, 2));
        System.out.println("================================>>  Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.");
        System.out.println("a>>b\t\t=" + Integer.toString(a >> b, 2));
        System.out.println("b>>a\t\t=" + Integer.toString(b >> a, 2));
        System.out.println("================================>>>  Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.");
        System.out.println("a>>>b\t\t=" + Integer.toString(a >>> b, 2));
        System.out.println("b>>>a\t\t=" + Integer.toString(b >>> a, 2));
        System.out.println("a>>>2\t\t=" + Integer.toString(a >>> 2, 2));
        System.out.println("b>>>2\t\t=" + Integer.toString(b >>> 2, 2));
    }
}
