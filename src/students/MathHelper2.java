package students;

import java.util.Scanner;

public class MathHelper2 {
    public static void main (String[] args){
        Scanner kbInput = new Scanner (System.in);
        System.out.println("How many problems to do?");
        int num = kbInput.nextInt();
        for (int i=0;i<num;i++){
        int randOperation = (int)Math.random()*4+1;
        int randNum = (int)(Math.random()*41+10);
        int randNum2 = (int)(Math.random()*41+10);
        switch (randOperation){
            case 1: 
                addition(randNum, randNum2);
                break;
            case 2:
                subtraction(randNum, randNum2);
                break;
            case 3:
                multiplication(randNum, randNum2);
                break;
            case 4: 
                division(randNum,randNum2);
                break;
        }
    }
        }
        public static int addition(int randNum, int randNum2){
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Answer the problem");
            System.out.print(randNum +"+" + randNum2 + "=");
            int sum = randNum +randNum2;
            int answer = kbInput.nextInt();
            if(answer == sum){
                System.out.println("You are correct");
            }else{
                System.out.println("You are incorrect");
            }
            return answer;
    }
        public static int subtraction(int randNum,int randNum2){
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Answer the problem");
            System.out.print(randNum + "-" + randNum2+ "=");
            int difference = randNum - randNum2;
            int answer2 = kbInput.nextInt();
            if(answer2 == difference){
                System.out.println("You are correct");
            }else{
                System.out.println("You are incorrect");
            }
            return answer2;
        }
        public static int multiplication(int randNum, int randNum2){
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Answer the problem");
            System.out.print(randNum + "x" + randNum2+ "=");
            int product = randNum * randNum2;
            int answer3 = kbInput.nextInt();
            if(answer3 == product){
                System.out.println("You are correct");
            }else{
                System.out.println("You are incorrect");
            }
            return answer3;
        }
        public static int division( int randNum, int randNum2){
            Scanner kbInput = new Scanner(System.in);
            System.out.println("Answer the problem");
            System.out.print(randNum + "/" + randNum2+ "=");
            int quotient = randNum / randNum2;
            int answer4 = kbInput.nextInt();
            if(answer4 == quotient){
                System.out.println("You are correct");
            }else{
                System.out.println("You are incorrect");
            }
            return answer4;
        }
        
}
