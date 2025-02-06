import java.util.Scanner;

public class reverseApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Please chose a starting word or phrase: ");
        Scanner reverseScanner= new Scanner(System.in);
        String startWord = reverseScanner.nextLine(); //allows the entry to be multiple words if the user wants
        String reversedWord = "";
        char ch;
        for (int i = 0; i <startWord.length(); i++){
            //this loop is what reverses the orignal word/phrase
            ch = startWord.charAt(i);
            reversedWord = ch + reversedWord;
        }
        System.out.println("Your starting word/phrase was " + startWord + ".");
        System.out.println("The reversed version is " + reversedWord + ".");
        reverseScanner.close();
    }
}
