package com.rom.works.operators;

public class Assignment {

    public static final String STRING = "=9\t\t\t";
    public static final String NEXT_LINE = "\n";

    public static void main(String[] args) {
        // =
        int x = 9;
        System.out.println(STRING +x+ NEXT_LINE);
        // +=, adding then assigning
        x += 3;
        System.out.println("+=3\t\t\t"+x+ NEXT_LINE);
        // -=, subtract then assign
        x -= 3;
        System.out.println("-=3\t\t\t"+x+ NEXT_LINE);
        // *= 3, multiply then
        x *= 3;
        System.out.println("*=3\t\t\t"+x+ NEXT_LINE);
        // /= divide then
        x /= 3;
        System.out.println("/=3\t\t\t"+x+ NEXT_LINE);
        // %= mod
        x %= 3;
        System.out.println("%=3\t\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // &= Binary AND Operator copies a bit to the result if it exists in both operands.
        x &= 3;
        System.out.println("&=3\t\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // |= Binary OR Operator copies a bit if it exists in either operand.
        x |= 3;
        System.out.println("|=3\t\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // ^= Binary XOR Operator copies the bit if it is set in one operand but not both.
        x ^= 3;
        System.out.println("^=3\t\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // ~= Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.
        x = (~3);
        System.out.println("~3\t\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // >>=
        x >>= 3;
        System.out.println(">>=3\t\t"+x);
        System.out.println(STRING+(x=9)+ NEXT_LINE);
        // <<=
        x <<= 3;
        System.out.println("<<=3\t\t"+x);
        System.out.println(STRING +(x=9)+ NEXT_LINE);
    }
}
