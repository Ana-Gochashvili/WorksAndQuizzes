package HomWork_2;

public class AbstractOneChild extends AbstractOne {

// 1. ვარიანტი:
   /* void countVowel(String phrase){
        phrase = phrase.toLowerCase();
        int count = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u'){

                count ++;
            }
        }
        System.out.println(count);
    }
}*/




// 2. ვარიანტი:

        void countVowel(String phrase) {

            phrase = phrase.toLowerCase();

            Character [] myChar = {'a', 'i', 'e', 'o', 'u'};
            int count = 0;

            for (int i = 0; i < phrase.length(); i++) {
                for (int j = 0; j < myChar.length; j++){

                    if (phrase.charAt(i) == myChar[j]){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }










}
