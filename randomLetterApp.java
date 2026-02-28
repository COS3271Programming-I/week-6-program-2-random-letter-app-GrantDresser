// randomLetterApp.java
// Grant Dresser
// 2/27/2026

public class randomLetterApp {
    public static void main(String[] args) {

        // generate random 10 letter word
        String word = "";

        for (int i = 0; i < 10; i++) {
            char randomLetter = (char) ('a' + (int)(Math.random() * 26));
            word += randomLetter;
        }

        System.out.println("Word #1: " + word);

        // change one random letter 19 times
        for (int count = 2; count <= 20; count++) {

            // pick random position
            int position = (int)(Math.random() * 10);

            // generate new random letter
            char newLetter = (char) ('a' + (int)(Math.random() * 26));

            // replace letter at position with a new letter
            word = word.substring(0, position) 
                 + newLetter 
                 + word.substring(position + 1);

            System.out.println("Word #" + count + ": " + word);
        }
    }
}