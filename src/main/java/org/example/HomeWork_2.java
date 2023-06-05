package org.example;

import java.util.ArrayList;

public class HomeWork_2 {

    public static void main(String[] args) {

// შექმენით მასივი რიცხვითი მნიშვნელობებით და დათვალეთ ამ მასივის ელემენტების ჯამი.

        int [] number = {100, 10, 20, 50};
        int sumOfNum = 0;
        for (int i =0; i< number.length; i++){
            sumOfNum += number[i];
        }
        System.out.println(sumOfNum);

        // ან while-ის გამოყენებით:

        int [] numBer = {100, 200, 300, 500};
        int num = 0;
        int sum = 0;
        while (num < numBer.length){
            sum +=numBer[num];
            num++;
        }
        System.out.println(sum);

/*შექმენით მასივი რიცხვითი მნიშვნელობებით და თუკი მასივში არის ლუწი ელემენტი, დამიბეჭდოს ამ ლუწი ელემენტების რაოდენობა
  (თუ მასივში ხუთი ლუწი ელემენტია, დამიბეჭდოს 5-იანი)*/

        int [] evenNum = {4, 5, 10, 17, 20, 22, 6, 12};
        int count = 0;
        for ( int n =0; n< evenNum.length; n++){
            if (evenNum[n] % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);

        // ან while-ის გამოყენებით:

        int [] evenNumb = {4, 5, 10, 17, 20, 22, 6, 12};
        int counter = 0;
        int j =0;
        while (j< evenNumb.length){
            if (evenNumb[j] % 2 == 0){
                counter ++;
            }
            j++;
        }
        System.out.println(counter);

/*დაამატეთ ArrayList-ში წელიწადის თვეები და შემდეგ მასში მოძებნეთ კონკრეტული მნიშვნელობა "ივნისი",
  რომლის ინდექსიც უნდა იყოს 5.*/

        ArrayList<String> months = new ArrayList<String>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");

        int indEx = months.indexOf("June");
        System.out.println(indEx);


//დაამატეთ ArrayList-ში წელიწადის თვეები და ციკლის დახმარებით დაბეჭდეთ ისინი.


        ArrayList<String> monthsOfYear = new ArrayList<String>();

        monthsOfYear.add("January");
        monthsOfYear.add("January");
        monthsOfYear.add("February");
        monthsOfYear.add("March");
        monthsOfYear.add("April");
        monthsOfYear.add("May");
        monthsOfYear.add("June");
        monthsOfYear.add("July");

        for (int month = 0; month < monthsOfYear.size(); month++){
            System.out.println(monthsOfYear.get(month));
        }

        // ან while-ის გამოყენებით:

        int mnt = 0;
        while(mnt < monthsOfYear.size()){
            System.out.println(monthsOfYear.get(mnt));
            mnt++;
        }









    }
}
