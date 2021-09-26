package String;

import javax.jws.soap.SOAPBinding;

public class Method2 {

    public static void main(String[] args) {

        String name = "Diana";

        // .indexOf ();

        name.indexOf('D');
        System.out.println(name.indexOf('D')); // index number of 'D'--> 0
        System.out.println(name.indexOf("D")); // index number of 'D' --> 0
        System.out.println(name.indexOf("Di")); // --> 0
        System.out.println(name.indexOf("ana")); // --> 2, it will look for matching sequence
                                                 // of provided chars and return first matching char's index number
        System.out.println(name.indexOf("tina")); // -1 there is no matching char sequence. It will always be -1,
                                                  // no matter what we put
        System.out.println(name.indexOf("k")); // --> -1 bc there is no "k" in the name of String name
        System.out.println("this is saturday morning");

        name = name.concat(" Bejan");
        System.out.println(name.concat(" Bejan")); // Diana Bejan, bc concat method adds whatever we put
        System.out.println(name); // Diana Bejan
        name.indexOf("a",3); // --> it will start looking for that char starting from given index
        System.out.println(name.indexOf("a",3));

        name.indexOf("B", name.indexOf(" ")); // Arzu Beril Sen

        name = "Arzu Beril Sen";

        System.out.println(name.indexOf("e", 7));

        // name.indexOf(); // values that you are giving inside the method parenthesize are called parameters
        // some methods take no parameters, some takes single parameter or multiple parameters

        name.length(); // --> no parameters
        name.charAt(3); //--> single parameter
        name.indexOf("e",3); // you can pass either one or two parameters by separating them with comma

    }}
