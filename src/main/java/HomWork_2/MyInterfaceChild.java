package HomWork_2;

public class MyInterfaceChild implements MyInterface{
    public void maxEvenAge(int[] myArr) {
        int count = 0;
        int maxEven = 0;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 == 0) {
                count++;
                if (myArr[i] > maxEven) {
                    maxEven = myArr[i];
                }
            }
        }
        if (count > 0){
            System.out.println("მაქსიმალური ლუწი ასაკია " + maxEven);
        }else {
            System.out.println("ყველა ასაკი კენტია");
        }
    }
}
