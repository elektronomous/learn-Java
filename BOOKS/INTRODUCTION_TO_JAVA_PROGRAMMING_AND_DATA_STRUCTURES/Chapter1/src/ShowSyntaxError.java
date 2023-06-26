package BOOKS.INTRODUCTION_TO_JAVA_PROGRAMMING_AND_DATA_STRUCTURES.Chapter1.src;

public class ShowSyntaxError {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}

/* 
= if you dont type void & missing the quotation mark in the string:

ShowSyntaxError.java:2: error: invalid method declaration; return type required
    public static main(String[] args) {
              ^
ShowSyntaxError.java:3: error: unclosed string literal
    System.out.println("Welcome to Java!);
                       ^ 
*/