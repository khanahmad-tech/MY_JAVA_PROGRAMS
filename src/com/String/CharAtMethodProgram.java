package com.String;

public class CharAtMethodProgram {
    public static void main(String[] args) {
        // Define a string
        String str = "Ahmad, Husain";
        
        // Get the character at a specific index
        char ch = str.charAt(7); // Gets the character at index 7 (zero-based index)
        
        // Display the character
        System.out.println("Character at index 7: " + ch);
        
        // Iterate through the string and display each character
        System.out.println("Characters in the string:");
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println("Index " + i + ": " + c);
        }
    }
}
