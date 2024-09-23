import java.util.ArrayList;
public class output {
    public int numWrong;
    public String defualtOutPut;
    public int wordLength;
    public Boolean Lose = false;

    public output(){
        numWrong = 0;
        defualtOutPut = "____________________  \n" + 
                        " |                  |  \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |                     \n" + 
                        " |___________________    ";
    }
    
    public void updateOutput(){
        switch (numWrong){
            case 1:
                defualtOutPut = "____________________     \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (.  . )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 2:
                defualtOutPut = "____________________  \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |                 |     \n" + 
                                " |                 |     \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 3:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                |     \n" + 
                                " |            \\   |     \n" + 
                                " |              \\ |     \n" + 
                                " |                 |      \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 4:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                  |     \n" + 
                                " |                      \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 5:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                  |     \n" + 
                                " |                 /    \n" + 
                                " |                /      \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 6:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                 |     \n" + 
                                " |                / \\   \n" + 
                                " |               /   \\  \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 7:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                 |     \n" + 
                                " |                / \\   \n" + 
                                " |               /   \\  \n" + 
                                " |             --     --   \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;

            case 8:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (.    )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                 |     \n" + 
                                " |                / \\   \n" + 
                                " |               /   \\  \n" + 
                                " |             --     --   \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;
            case 9:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (.  . )  \n" + 
                                " |              (     )  \n" + 
                                " |              (     )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                 |     \n" + 
                                " |                / \\   \n" + 
                                " |               /   \\  \n" + 
                                " |             --     --   \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                break;
            case 10:
                defualtOutPut = "____________________ \n" + 
                                " |                  |    \n" + 
                                " |               _____   \n" + 
                                " |              (.  . )  \n" + 
                                " |              (     )  \n" + 
                                " |              (  _  )  \n" + 
                                " |              -------  \n" + 
                                " |                 |     \n" + 
                                " |               \\ | /   \n" + 
                                " |                \\|/   \n" + 
                                " |                 |     \n" + 
                                " |                / \\   \n" + 
                                " |               /   \\  \n" + 
                                " |             --     --   \n" + 
                                " |                       \n" + 
                                " |                       \n" + 
                                " |___________________      ";
                Lose = true;
                break;

    


        }
    }
    
    public void wrongGuess(){
        numWrong++;
        System.out.println(numWrong);
        updateOutput();
    }
    public String showWordBuilder(String guess, String word, String wordBuilder){
        //creating a string array of wordbuilder to help with replacing the underscores with the correct letter
        String[] wordBuilderArray = wordBuilder.split("");
        ArrayList<Integer> indicies = new ArrayList<Integer>();

        //iterating through the target word to see if the players guess is in it 
        if (guess.equals("")){
            return wordBuilder;
        }
        for (int i = 0; i < word.length(); i++){

            if (word.charAt(i) == guess.charAt(0)){
                indicies.add(i);

            
                //replacing the underscores with the correct letter
               for (int j = 0; j < indicies.size(); j++){
                    
                    wordBuilderArray[indicies.get(j)] = guess;
                   }

        }
        }

        //if the guess is not in the word, the player gets a wrong guess and the original wordbuilder is returned
        if (indicies.size() == 0){
            System.out.println("Incorrect guess!");
            wrongGuess();
            return wordBuilder;
        }
        System.out.println("Correct guess!");
        return String.join("", wordBuilderArray);

    }
     
    
}
