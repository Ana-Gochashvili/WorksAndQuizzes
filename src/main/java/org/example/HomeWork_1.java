package org.example;

public class HomeWork_1 {
    public static void main(String[] args) {

//        1.ციკლის გამოყენებით გამოიტანეთ ეკრანზე ლუწი რიცხვები 1-20 ჩათვლით(2ქულა).

        for(int evenNum = 1; evenNum <= 20; evenNum++){
            if(evenNum % 2 == 0) {
                System.out.println(evenNum);
            }
        }


        /*2.ციკლის გამოყენებით გამოიტანეთ ეკრანზე მნიშვნელობები ასეთი თანმიმდევრობით
        10,9,8,7,6,5,4,3,2,1 (2ქულა).*/

        for(int number = 10; number >= 1; number--){
            System.out.println(number);
        }


        /*3.while ციკლის გამოყენებით გამოიტანეთ ეკრანზე 3ზე გამრავლების ტაბულა(1-10ჩათვლით) "3*7=21"
        ასეთ ტილში.(2ქულა).*/

        int num = 1;
        while(num<=10){
            System.out.println("3 * " + num + " = " + num * 3);
            num++;
        }


        /*4. if ოპერატორით შეამოწმეთ რიცხვი არის თუ არა ლუწი, თუ არის მაშინ გამოიტანეთ ეკრანზე
        "I love khinkali" თუ არ არის ლუწი, მაშინ გამოიტანე "I love mwvadi "(2ქულა).*/

        int isEvenNum = (int) (Math.random()*100);
        if(isEvenNum % 2 == 0){
            System.out.println("I love khinkali");
        }
        else {
            System.out.println("I love mwvadi");
        }


       /* 5.შექმენით ცვლადი და გადაეცით თქვენთვის სასურველი ნებისმიერი წინადადება,და შეამოწმეთ,
        თუ ამ წინადადების სიგრძე იქნება ლუწი რიცხვი, დაბეჭდეთ :"Hi", თუ კენტი მაშინ: "Bye". (2ქულა).*/

        String myPhrase = "Today it's a nice day.";
        //int phraseLength = myPhrase.length(); -ასეც შეიძლება
        if ((myPhrase.length()) % 2 == 0){
            System.out.println("Hi");
        }
        else {
            System.out.println("Bye");
        }


    }
}
