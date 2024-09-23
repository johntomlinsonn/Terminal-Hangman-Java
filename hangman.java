import java.util.Scanner;
import java.util.Random;
public class hangman{
    
    public static void main(String args []){
        //Creating objects 
        output outPutt = new output();
        Scanner input = new Scanner(System.in);
        String word;
        String wordBuilder = "";
        String guess = "";
        String[] letters =  {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
                            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
                            "u", "v", "w", "x", "y", "z"};
        boolean goodGuess = false;
        
        
        
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

        //Creating a string of underscores that represent the word that the user will see
        for (int i = 0; i < word.length(); i++){
            wordBuilder += "_";
        }

        

        
        //Showing the player the starting drawing of hangman
        System.out.println(outPutt.defualtOutPut);

        //Showing the player the word that they have guessed so far
        System.out.println(outPutt.showWordBuilder(guess, word, wordBuilder));


        while (wordBuilder.equals(word) == false){

            while (goodGuess == false){
                //Asking the player to guess a letter
                System.out.println("\nPlease guess a letter of the word");

                //Gathering the players guess
                guess = input.nextLine();
                

            for (int i = 0; i < letters.length; i++){
                if (guess.equals(letters[i])){
                    goodGuess = true;
                    letters[i] = "<>";
                }
            }
            if (goodGuess == false){
                System.out.println("You have already guessed that letter or you need to guess only one letter\nplease guess a different letter");
            }
            }

            

            
            //Showing the player the word that they have guessed so far
            wordBuilder = outPutt.showWordBuilder(guess, word, wordBuilder);
            System.out.println("Here is what you have guessed of the word: "+ wordBuilder);

            //Showing the player the starting drawing of hangman
            System.out.println(outPutt.defualtOutPut);
            goodGuess = false;
            if (outPutt.Lose == true){

                System.out.println("You Lose! The word was: " + word);
                break;
            }



        }
        
        input.close();
        if (wordBuilder.equals(word)){
            System.out.println("You Win");
        }
        

    }
    
}