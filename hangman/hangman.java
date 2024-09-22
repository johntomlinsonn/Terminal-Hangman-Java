import java.util.Scanner;
import java.util.Random;
public class hangman{
    
    public static void main(String args []){
        //Creating objects 
        output outPutt = new output();
        Scanner input = new Scanner(System.in);
        String word;
        
        //Array of words the the computer can choose from for hangman
        String[] words = {"apple", "banana", "cherry", "date", "audio", "video", "music", "movie", "image", "picture", "computer", "keyboard", "mouse", "monitor", "printer", "scanner", "software", "hardware", "network", "internet", "website", "database", "server", "client", "program", "application", "system", "operating", "windows", "linux", "macintosh", "android", "iphone", "smartphone", "tablet", "laptop", "desktop", "notebook", "server", "cloud", "storage", "memory", "processor", "motherboard", "circuit", "chip", "device", "technology", "science", "engineering", "mathematics", "physics", "chemistry", "biology", "geology", "astronomy", "meteorology", "environment", "ecology", "geography", "history", "economics", "politics", "sociology", "psychology", "philosophy", "religion", "literature", "language", "grammar", "vocabulary", "writing", "reading", "speaking", "listening", "learning", "teaching", "education", "school", "college", "university", "institute", "academy", "library", "museum", "gallery", "theater", "cinema", "concert", "festival", "exhibition", "conference", "seminar", "workshop", "meeting", "discussion", "conversation", "dialogue", "debate", "argument", "agreement", "disagreement", "conflict", "resolution", "compromise", "negotiation", "mediation", "arbitration"};

        //Welcome message
        System.out.println("Welcome to Hangman! \n Do you want to input a word or have the computer choose one for you?");
        System.out.println("1 to Input a word or 2 to Have the computer choose one for you");
        
        //gathering players input
        String choice = input.nextLine();

        

        //checking players input
        if (choice.equals("1")){
            System.out.println("Please input a word");

            //gathering the users word
            word = input.nextLine();
        }
        else{
            //creating a random object if the player chooses to have the computer choose a word
            Random rand = new Random();

            //getting a random int between 0 and the length of the words array
            int index = rand.nextInt(words.length);

            //getting the word at the random int index
            word = words[index];
        }



        //Showing the player the starting drawing of hangman
        System.out.println(outPutt.defualtOutPut);

        //Showing the blank word to the player 
        System.out.print("Here is the word:");
        outPutt.showBlankWord(word);

        //Asking the player to guess a letter
        System.out.println("\nPlease guess a letter of the word");

        String guess = input.nextLine();
        

        
        

    }
}