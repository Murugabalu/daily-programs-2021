public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        int num1 = 2, num2 = 30, count = 0;

//        2, 3, 4, ... 30
        for(int i=num1; i<=num2; i++) {

            count = 0;

//            A number that has 2 distinct factors is a Prime Number
//            Logic: Number (num)
//              -> 1 to num (Loop)
//              -> Divide and see, if we could divide a number more exactly twice

//            i = 2, i=3, i=4,...
//            System.out.println("Value for I: " + i);

//            System.out.println("Running loop from 1 to " + i);
            for(int j=1; j<=i; j++) {
                if(i%j==0){
//                Determine whether it is divisible
//                    System.out.println("Number " + i + " is divisible by " + j);
                    count++;
                }
            }

//            System.out.println("Count here is: " + count);

            if(count==2)
                System.out.println("The number " + i + " is a Prime.");

        }

//        int num = 80;
//        int count = 0;
//
////        7
////        1, 2, 3, 4, 5, 6, 7
////        7/1==0. 7/2==0, 7/3==0,...
//        for(int i=1; i<=num; i++) {
//            if(num%i==0){
////                Determine whether it is divisible
//                  count++;
//            }
//        }
//
//        if(count==2) {
//            System.out.println("The number " + num + " is a Prime.");
//        } else {
//            System.out.println("The number " + num + " is Not a Prime.");
//        }

    }
}

// Write a program to check Prime or Not
// 1 to Num - Generate
// Num1, Num2 - Generate
// Num1, Num2 - Count number of Prime and Non Prime
// Write
