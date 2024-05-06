import java.util.Scanner; //scanner class
public class Computer20questionGame { 

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); //scanner class 
         String[][] easyQuestions = { //declare arrays to hold our quiz easy questions and options
                {"What is the capital of France?", "London", "Paris", "Berlin", "Madrid"},
                {"What is the largest planet in our solar system?", "Mars", "Saturn", "Jupiter", "Venus"},
                {"Who painted the Mona Lisa?", "Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Michelangelo"},
                {"What is the chemical symbol for water?", "NaCl", "CO2", "O2", "H2O"},
                {"Who wrote 'Romeo and Juliet'?", "William Shakespeare", "Charles Dickens", "Jane Austen", "Mark Twain"},
                {"Who is the author of 'Harry Potter' book series?", "J.R.R. Tolkien", "Stephen King", "George R.R. Martin", "J.K. Rowling"},
                {"What is the atomic number of oxygen?", "12", "6", "10", "8"}
        };
        String[][] mediumQuestions = {//declare arrays to hold our quiz medium questions and options
                {"What is the boiling point of water in Celsius?", "0", "100", "50", "200"},
                {"Who discovered penicillin?", "Alexander Fleming", "Louis Pasteur", "Marie Curie", "Gregor Mendel"},
                {"What is the chemical symbol for gold?", "Ag", "Ag", "Pt", "Au"},
                {"Who painted the famous artwork 'The Starry Night'?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Claude Monet"},
                {"What is the smallest prime number?", "3", "1", "2", "5"},
                {"What is the freezing point of water in Celsius?", "-5", "-10", "10", "0"},
                {"Who discovered gravity?", "Isaac Newton", "Albert Einstein", "Galileo Galilei", "Stephen Hawking"}
        };
        String[][] hardQuestions = {//declare arrays to hold our quiz hard questions and options
                {"What is the largest ocean on Earth?", "Indian Ocean", "Atlantic Ocean", "Pacific Ocean", "Arctic Ocean"},
                {"What is the largest desert in the world?", "Gobi Desert", "Sahara Desert", "Arabian Desert", "Kalahari Desert"},
                {"What is the square root of 144?", "18", "10", "15", "12"},
                {"What is the capital of Japan?", "Tokyo", "Beijing", "Seoul", "Bangkok"},
                {"What is the smallest planet in our solar system?", "Mars", "Venus", "Mercury", "Earth"},
                {"Who is credited with discovering the theory of relativity?", "Albert Einstein", "Isaac Newton", "Galileo Galilei", "Stephen Hawking"},
                {"What is the boiling point of ethanol in Celsius?", "50", "100", "78.37", "0"}
        };
        
        int score = 0;//declare score
        
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Enter your choice: ");
          int difficulty = scanner.nextInt();
        //welcomes user to game and ask for difficulty, input stored in difficulty variable
        
        String[][] questions = {};//arrary to hold questions
        switch (difficulty) {//based on the difficulity the switch case assigns 7 questions to a aprropriate array of difficulity
            case 1:
                questions = easyQuestions;
                break;
            case 2:
                questions = mediumQuestions;
                break;
            case 3:
                questions = hardQuestions;
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                System.exit(0); //if choice is invalid exit the program
        }
     
        for (int i = 0; i < questions.length; i++) { //this loop goes through each question in the selected difficulity array.
            System.out.println("Question " + (i + 1) + ": " + questions[i][0]);// displays questions number and displays all questions in difficluty 
            System.out.println("Options:");//displays option:
            System.out.println("A. " + questions[i][1]);
            System.out.println("B. " + questions[i][2]);
            System.out.println("C. " + questions[i][3]);
            System.out.println("D. " + questions[i][4]);//displays the options
            System.out.print("Your answer (A/B/C/D): ");//asks for answer
            String answer = scanner.next();//scanner so you can type anwer
            
            if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Paris")) {
                score++; //this is basically using if else to check the users answer for A B C D. 
                // if the person answers b which is paris then its right if he answer a and its not paris then its wrong.
                //same thing applies to every other question and option
//if he selects any of them it shows if it is right or wrong. if right then added to score if wrong then no 
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Paris")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Paris")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Paris")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Jupiter")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Jupiter")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Jupiter")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Jupiter")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Leonardo da Vinci")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Leonardo da Vinci")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Leonardo da Vinci")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Leonardo da Vinci")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Dog")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Dog")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Dog")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Dog")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("H2O")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("H2O")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("H2O")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("H2O")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Isaac Newton")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Isaac Newton")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Isaac Newton")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Isaac Newton")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Pacific Ocean")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Pacific Ocean")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Pacific Ocean")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Pacific Ocean")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("100")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("100")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("100")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("100")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("William Shakespeare")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("William Shakespeare")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("William Shakespeare")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("William Shakespeare")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Mars")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Mars")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Mars")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Mars")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("12")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("12")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("12")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("12")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Vincent van Gogh")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Vincent van Gogh")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Vincent van Gogh")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Vincent van Gogh")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("2")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("2")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("2")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("2")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Tokyo")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Tokyo")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Tokyo")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Tokyo")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Au")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Au")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Au")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Au")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("J.K. Rowling")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("J.K. Rowling")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("J.K. Rowling")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("J.K. Rowling")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("0")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("0")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("0")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("0")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Sahara Desert")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Sahara Desert")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Sahara Desert")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Sahara Desert")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("Alexander Fleming")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("Alexander Fleming")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("Alexander Fleming")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("Alexander Fleming")) {
                score++;
            } else if (answer.equalsIgnoreCase("A") && questions[i][1].equalsIgnoreCase("8")) {
                score++;
            } else if (answer.equalsIgnoreCase("B") && questions[i][2].equalsIgnoreCase("8")) {
                score++;
            } else if (answer.equalsIgnoreCase("C") && questions[i][3].equalsIgnoreCase("8")) {
                score++;
            } else if (answer.equalsIgnoreCase("D") && questions[i][4].equalsIgnoreCase("8")) {
                score++;
            }
            
            
            System.out.println();
        }
        
        System.out.println("Quiz complete!");//prints the end of quiz
        System.out.println("Your score: " + score + "/" + questions.length); //print score out of total number of questions
        
        scanner.close();//closes scanner ends code
    }
}










