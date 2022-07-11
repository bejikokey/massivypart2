public class Main {
    public static void main(String[] args) {
        int[] numbers = new int [3];
        int[] numbersCopy = new int [3];
        numbers[0] = 1;
        int fisrtNumber = numbers[0];
        numbers[1] = 2;
        int secondNumber = numbers[1];
        numbers[2] = 3;
        int thirdNumber = numbers[2];
        System.out.println(fisrtNumber + "," + secondNumber + "," + thirdNumber);

        int [] number = {1, 2, 3};
        for (int i = number.length-1; i >= 0; i--) {
            if (i <2) {
                System.out.print(",");
            }
            System.out.print(number[i]);
        }
        System.out.println();



        double [] letters = {1.57, 7.654, 9.986};
        letters[0] = 1.57;
        double firstLetter = letters[0];
        letters[1] = 7.654;
        double secondLetter = letters[1];
        letters[2] = 9.986;
        double thirdLettor = letters[2]; {
            System.out.print (firstLetter + "," + secondLetter + "," + thirdLettor);
        }
        System.out.println();

        double [] numbs = {1.57, 7.654, 9.986};
        numbs[0] = 1.57;
        double numbFirst = numbs[0];
        numbs[1] = 7.654;
        double numbSecond = numbs[1];
        numbs[2] = 9.986;
        double numbThird = numbs[2];

        System.out.print(numbThird + "," +numbSecond + "," +numbFirst);

        System.out.println();


        int [] mySalary = {39_000,41_000,49_000,53_000,2_000,70_000,900_00,150_000,200_000};
        for (int i = 0; i < mySalary.length; i++) {
            if (i>0 && i<= mySalary.length-1) {
                System.out.print(", ");
            }

            System.out.print(mySalary[i]);
        }


        System.out.println();

        int [] mySalarys = {39_000,41_000,49_000,53_000,2_000,70_000,900_00,150_000,200_000};
        for (int i = mySalarys.length-1; i >= 0; i--) {
            if (i< mySalarys.length-1 && i>=0 ) {
                System.out.print(", ");
            }
            System.out.print(mySalarys[i]);



            // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
            // (нужно прибавить 1).
            //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам
            // нужно использовать циклы.
            //Распечатайте результат преобразования в консоль.


        }
        System.out.println();
        int [] cifry = {1, 2, 3};
        for (int i = 0; i < cifry.length; i++) {
            if (cifry[i]%2==0) {
                System.out.print(cifry[i]);
                if (i>=0 && i<cifry.length-1)  {
                    System.out.print(", "); }
            } else {
                cifry[i]=cifry[i]+1;
                System.out.print(cifry[i]);
                if (i>=0 && i<cifry.length-1) {
                    System.out.print(", ");
                }
            }


        }
    }





}
