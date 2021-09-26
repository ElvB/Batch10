package InterviewQuestions;

public class AlphaCharacters {
    public static void main(String[] args) {


    /*
    print out only alphabetic characters
    print out only digit characters
    print out only symbols (other characters)
     */
        String given = "ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabetic = "";
        String onlyDigit = "";
        String onlySpecial = "";

        for (int i = 0; i < given.length(); i++) {
            char ch = given.charAt(i);
            if (Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
                onlyAlphabetic += ch;
            } else if (Character.isAlphabetic(ch) && Character.isDigit(ch)) {
                onlyDigit+= ch;
            } else {
                onlySpecial += ch;
            }
        }
        System.out.println(onlyAlphabetic);
        System.out.println(onlyDigit);
        System.out.println(onlySpecial);
    }
}
