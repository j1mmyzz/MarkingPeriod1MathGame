import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner name1 = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = name1.nextLine();
        /*
         * All Scanners
         * either int or String
         */
        Scanner stringScanner = new Scanner(System.in);
        Scanner intScanner = new Scanner(System.in);
        Scanner doubleScanner = new Scanner(System.in);
        Player user = new Player();
        user.player(name,0, 0 ,0 );
        System.out.println(user); //prints object
        int max = 100;
        int min = -100;
        int random_int = (int)(Math.random()*(max-min+1)+min);
        System.out.println("\nHello " + name + " Welcome to the Math Game!");
        System.out.println("\nRules:");
        System.out.println("You will have to answer several math questions.");
        System.out.println("Your score starts at 0.");
        System.out.println("You win if you score is 5 or more by the end.");
        System.out.println("\nAre you ready? ");
        String yes_no = stringScanner.nextLine();
        if (yes_no.toLowerCase().equals("yes")){
            System.out.println("\nGood");
        }
        else{
            System.out.println("\nGoodbye then.");
            user = null;
            System.exit(0);
        }
        System.out.println("\nWhat number added to 90 equals to " + random_int);
        int answer1 = intScanner.nextInt();
        if (answer1 == (user.subtract(random_int, 90))){ //one method
            System.out.println("Correct!");
            user.addQright();
            user.addScore();
            System.out.println("Your current score is " + user.getScore());
        }
        else{
            System.out.println("Wrong");
            user.subtractScore();
            user.addQwrong();
            System.out.println("The correct answer was " + (random_int -90));
            System.out.println("Your current score is " + user.getScore());
        }
        double random_double = (double)(Math.random()*(max-min+1)+min);
        System.out.println("What is " + Math.round(random_double * 100)/100.0 + " - 5?");
        double answer2 = doubleScanner.nextDouble();
        if (answer2 == ((double)Math.round(random_double * 100)/100) - 5.0){
            System.out.println("Correct!");
            user.addQright();
            user.addScore();
            System.out.println("Your current score is " + user.getScore());
        }
        else{
            System.out.println("Wrong");
            user.subtractScore();
            user.addQwrong();
            System.out.println("The correct answer was " + (random_double - 5.0));
            System.out.println("Your current score is " + user.getScore());
        }
        int random_int2 = (int)(Math.random()*(max-min+1)+min);
        System.out.println("What is " + random_int2 + " squared");
        int answer3 = intScanner.nextInt();
        if (answer3 == (Math.pow(random_int2, 2))){
            System.out.println("Correct!");
            user.addQright();
            user.addScore();
            System.out.println("Your current score is " + user.getScore());
        }
        else{
            System.out.println("Wrong");
            user.subtractScore();
            user.addQwrong();
            System.out.println("The correct answer was " + (Math.pow(random_int2, 2)));
            System.out.println("Your current score is " + user.getScore());
        }
        System.out.println("What is 12.34 to the closest integer?");
        String answer4 = stringScanner.nextLine();
        double i = 12.34;
        Double doub = new Double(i);
        doub.toString();
        String asw = doub.toString().substring(0,2);
        if (answer4.equals(asw)){
            System.out.println("Correct!");
            user.addQright();
            user.addScore();
            System.out.println("Your current score is " + user.getScore());
        }
        else{
            System.out.println("Wrong");
            user.subtractScore();
            user.addQwrong();
            System.out.println("The correct answer was " + ((int)12.34));
            System.out.println("Your current score is " + user.getScore());
        }
        System.out.println("Round -1.5 to the nearest whole number");
        int answer5 = intScanner.nextInt();
        if (answer5 == ((int)(user.subtract(-1.5, 0.5)))){ //overloading previous subtract method with doubles as a prameter
            System.out.println("Correct!");
            user.addQright();
            user.addScore();
            System.out.println("Your current score is " + user.getScore());
        }
        else{
            System.out.println("Wrong");
            user.addQwrong();
            user.subtractScore();
            System.out.println("The correct answer was " + ((int)(-1.5)-(0.5)));
            System.out.println("Your current score is " + user.getScore());
        }
        System.out.println("\nCongrats, you've made it to the end. ");
        System.out.println("\nWould you like to answer a bounus question?\nYou have the chance to double your score!\nBut if you get it wrong then your score gets cut in half.");
        String response = stringScanner.nextLine();
        if (response.toLowerCase().equals("yes")){
            System.out.println("What is the remainder when 238 is divided by 3?");
            int mod_answer = intScanner.nextInt();
            int num = 238;
            int modAnswer = (num %= 3);
            if (mod_answer == modAnswer){
                user.doubleScore();
                user.addQright();
                System.out.println("CORRECT!");
                System.out.println("Your current score is " + user.getScore());
            }
            else{
                user.halfScore();
                user.addQwrong();
                System.out.println("Wrong");
                System.out.println("Your current score is " + user.getScore());
            }
        }
        else {
            System.out.println("Alright");
        }
        if ((user.result() == true)){
            Player.congrats();
            System.out.println("\nYOU WON!");
            System.out.println("Your score is " + user.getScore());
            System.out.println("You got " + user.getQright() + " question(s) right.");
            System.out.println("You got " + user.getQwrong() + " question(s) wrong.");
        }
        else{
            Player.congrats();
            System.out.println("\nYou Lost!");
            System.out.println("Your score is " + user.getScore());
            System.out.println("You got " + user.getQright() + " question(s) right.");
            System.out.println("You got " + user.getQwrong() + " question(s) wrong.");
        }
        System.out.println("\nDid you enjoy the game? ");
        String answer6 = stringScanner.nextLine();
        if (answer6.toLowerCase().equals("yes")){
            Scanner input8 = new Scanner(System.in);
            System.out.print("What would you rate it out of ten? ");
            int answer7 = input8.nextInt();
            if((answer7 > Integer.MAX_VALUE) || (answer7 < Integer.MIN_VALUE)){
                System.out.println("Java cannot comprehend. Goodbye");
                System.exit(0);
            }
            else{
                if(answer7 > 8){
                    System.out.println("Thank you for playing!");
                    System.out.println("Goodbye!");
                    System.exit(0);
                }
                else{
                    System.out.println("ok");
                    System.exit(0);
                }
            }
        }
        else{
            System.out.println("ok");
            System.exit(0);
        }
    }
}
