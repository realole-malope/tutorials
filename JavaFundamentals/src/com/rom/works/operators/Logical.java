package com.rom.works.operators;

public class Logical {
    public static void main(String[] args) {
        System.out.println("================&& Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.");
        System.out.println("true && true    = "+(true && true));
        System.out.println("true && false   = "+(true && false));
        System.out.println("false && true   = "+(false && true));
        System.out.println("false && false  = "+(false && false));
        System.out.println("================|| Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.");
        System.out.println("true || true    = "+(true || true));
        System.out.println("true || false   = "+(true || false));
        System.out.println("false || true   = "+(false || true));
        System.out.println("false || false  = "+(false || false));
        System.out.println("================! Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.");
        System.out.println("!true           = "+(!true));
        System.out.println("!false          = "+(!false));
    }
}
