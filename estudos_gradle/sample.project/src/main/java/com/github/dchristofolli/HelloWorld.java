package com.github.dchristofolli;

import java.io.PrintStream;
public class HelloWorld {
    public static void main(String[] args) {
        print(System.out);
    }

    public static void print(PrintStream out){
        out.println("Hello, World!");
    }

}