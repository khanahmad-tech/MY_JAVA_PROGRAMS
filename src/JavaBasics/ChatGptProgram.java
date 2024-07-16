package JavaBasics;

import java.util.Arrays;

public class ChatGptProgram implements Comparable<ChatGptProgram> {
    private String name;
    private int age;

    public ChatGptProgram(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(ChatGptProgram other) {
        return this.age - other.age; // Sort by age
    }

    // Getters and toString method
    public String getName() { return name; }
    public int getAge() { return age; }
    
    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        ChatGptProgram[] people = {
            new ChatGptProgram("Alice", 30),
            new ChatGptProgram("Bob", 25),
            new ChatGptProgram("Charlie", 35)
        };
        
        Arrays.sort(people); // Uses compareTo method
        for (ChatGptProgram person : people) {
            System.out.println(person);
        }
    }
}
