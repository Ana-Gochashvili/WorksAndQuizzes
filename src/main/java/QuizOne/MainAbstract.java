package QuizOne;
import static QuizOne.MyAbstractClass.printLastName;


public class MainAbstract {
    public static int printSum(int x, int y){
        return x + y;
    }
    public static double printSum(double x, int y){
        return x + y;
    }

    public static void main(String[] args) {


/*1. შექმენით მეთოდი, რომელსაც გააჩნია ორი int ტიპის პარამეტრი და აბრუნებს მათ ჯამს. ასევე შექმენით მეორე მეთოდი,
 რომელსაც ექნება იგივე სახელი რაც პირველს, მაგრამ ორი int ტიპის პარამეტრის ნაცვლად პირველი პარამეტრი
 აქვს double ტიპის და მეორე int ტიპის და ასევე აბრუნებს რიცხვების ჯამს. ორივე მეთოდი გამოიძახეთ main მეთოდში და დააბეჭდინეთ მათი შედეგები.
   */

        System.out.println(printSum(5,10));
        System.out.println(printSum(5.5, 100));


/*
2.	შექმენით აბსტრაქტული კლასი, რომელსაც ექნება შემდეგი ორი მეთოდი. პირველი მეთოდი აბსტრაქტული printName() და
    მეორე მეთოდი სტატიკური printLastName() რომელიც ბეჭდავს თქვენს გვარს. შექმენით შვილი კლასი, რომელიც ამ აბსტრაქტულ
    მეთოდს printName() გაუკეთებს რეალიზებას და დაბეჭდავს თქვენს სახელს. შექმენით ამ შვილი კლასის ობიექტი Main კლასში და
    შვილი კლასის ობიექტიდან გამოიძახეთ printName() მეთოდი, ასევე გამოიძახეთ მშობელ აბსტრაქტულ კლასში არსებული printLastName() მეთოდი.
*/

        MyAbstractChild absObject = new MyAbstractChild();

        absObject.printName();
        printLastName();

        // ან შემოვაიმპორტოთ import static QuizOne.MyAbstractClass.printLastName;

        printLastName();



// 3. იპოვეთ ის რიცხვი, რომელიც ყველაზე ხშირად გვხვდება int ტიპის მასივში.

        int[] array = {3, 4, 3, 3, 7, 0, 0, 7, 7, 7, 9 };

        int x = 0;
        int countX = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = array[0]; j < array.length; j++) {
                if (array[i] == array[j]) {

                    count++;
                }
                if (count > x) {
                    x = count;
                    countX = array[i];

                }
            }
        }
        System.out.println(countX);




    }



}
