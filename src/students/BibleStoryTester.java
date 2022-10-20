package students;

import java.util.*;
public class BibleStoryTester{
    public static void main(String args[]){
        Scanner kb= new Scanner(System.in);
        System.out.println("How many stories do you want to be told?");
        int numOfStories= kb.nextInt();
        kb.nextLine();
        int x;
        for (x=0; x<numOfStories; x++){
            System.out.println("What Story do you want to be told? (Adam and Eve, Cain and Able, David and Goliath)");
            String userInput= kb.nextLine();
            System.out.println("What's the name of the first character? (Adam, Cain, David, other, or none)");
            String userInput2= kb.nextLine();
            System.out.println("What's the name of the second character? (Eve, Able, Saul, other, or none)");
            String userInput3= kb.nextLine();
            System.out.println("What's the name of the third character? (The Serpent, Goliath, other, or none)");
            String userInput4= kb.nextLine();
            System.out.println("What's the name of the fourth character? (God, other, or none)");
            String userInput5= kb.nextLine();
            System.out.println("What's the first object? (Fruit, a stone, stone, other, or none)");
            String userInput6= kb.nextLine();
            System.out.println("What's the second object? (Leaves, Meat, Sling, other, or none)");
            String userInput7= kb.nextLine();
            System.out.println("What's the third object? (Wheat, Sword, other, or none)");
            String userInput8= kb.nextLine();
            System.out.println("What's the first place/people? (Israelites, Garden of Eden, other, or none)");
            String userInput9= kb.nextLine();
            System.out.println("What's the second place/people? (Philistine, other, or none)");
            String userInput10= kb.nextLine();
            BibleStory story= new BibleStory(userInput, userInput2, userInput3, userInput4, userInput5, userInput6, userInput7, userInput8, userInput9, userInput10);
            String storyOutput= story.Story();
            System.out.println(storyOutput);
        }
        kb.close();
    }
}