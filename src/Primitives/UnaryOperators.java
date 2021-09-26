package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentsNumber = 25;
        // there 3 ways to increase the numbers
        studentsNumber = studentsNumber+1; // just by +1
        studentsNumber +=1; // += sign
        studentsNumber ++; // ++ sign
        ++studentsNumber; // we can put before the sign ++
        System.out.println(studentsNumber);

        studentsNumber--;
        System.out.println(studentsNumber); //28
        --studentsNumber;
        System.out.println(studentsNumber); //27
        studentsNumber--; studentsNumber--; studentsNumber--;
        System.out.println(studentsNumber); //24
//=============================================================================================================
        studentsNumber++;
        studentsNumber--;
        System.out.println(studentsNumber++); //25 --> this is going to show 24, bc it's inside sout
                                              // and increases afterwords, studentsNumber is now 25
        System.out.println(studentsNumber); // it will show 25

        System.out.println(++studentsNumber);// it will show 26, bc increases first and then prints out

        System.out.println(studentsNumber--); //-->shows 26 and decrease by 1
        studentsNumber--; // 24
        --studentsNumber; //23
        System.out.println(--studentsNumber); // decrease first 22 and then shows 22
        System.out.println(studentsNumber); // will print 22

        int a = studentsNumber++ + studentsNumber++ +5;
        a--;
        a=studentsNumber; // a = 24
        System.out.println(a--); // shows 24, but a = 23
        System.out.println(a--); // shows 23, but a = 22
        System.out.println(a); // show 22


    }
}
