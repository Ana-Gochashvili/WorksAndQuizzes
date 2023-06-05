package HomWork_2;

public class MainHomeWork_2 {


    static void aReplaceM(String myString){
        System.out.println(myString.replace('a', '%' ));

    }


    public static void main(String[] args) {



// 1. პირველი დავალება:


       AbstractOneChild object = new AbstractOneChild();

        object.countVowel("Autumn is my favorite time of year");



// 2. დავალება:

        MyInterfaceChild evenAge =  new MyInterfaceChild();
        int [] myArray = {2, 21, 70001, 41};

        evenAge.maxEvenAge(myArray);



/* 3. დავალება: პირდაპირ მეინ კლასში შექმენით მეთოდი, რომელიც პარამეტრად მიიღებს სტრინგს და
    ამ სტრინგში არსებულ ყველა a ასოს შეცვლის % ის ნიშნით. */

        String mySTR = "Today is a great day";

        aReplaceM(mySTR);




    }
}