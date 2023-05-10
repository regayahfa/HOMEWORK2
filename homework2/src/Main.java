import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = 125;
        int b = 24;

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "*" + b + "=" + (a * b));
        System.out.println(a + "/" + b + "=" + (a / b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a + "mod" + b + "=" + (a % b));

        System.out.println("--------------Q2------------------");

        String A = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println(A.toLowerCase());

        System.out.println("--------------Q3------------------");
        String X = "java Bootcamp";
        char one = X.charAt(1);

        System.out.println(one);

        System.out.println("--------------Q4------------------");
        int s = 20;
        if (s % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.println("--------------Q5------------------");
        String q = "admin";
        String su = "superuser";
        String u = "user";
        if (q == "admin") {
            System.out.println("welcome  " + q);
        } else if (su == "superuser") {
            System.out.println("welcome  " + su);
        } else {
            System.out.println("welcome  " + u);
        }
        System.out.println("--------------Q6------------------");
        Scanner in = new Scanner(System.in);
        System.out.println("ENTAR NUMBER 1: ");
        int one1 = in.nextInt();
        System.out.println("ENTAR NUMBER 2: ");
        int one2 = in.nextInt();
        System.out.println("ENTAR sum: ");
        int sum = in.nextInt();
        if (sum == one1 + one2) {
            System.out.println(true);
        }
        System.out.println("--------------Q7------------------");
        Scanner ma = new Scanner(System.in);
        System.out.println("ENTAR 1st: ");
        int one11 = in.nextInt();
        System.out.println("ENTAR 2nd: ");
        int one22 = in.nextInt();
        System.out.println("ENTAR  3rd ");
        int one33 = in.nextInt();
        if (one33 > one11 && one33 > one22) {
            System.out.println("the greatest: " + one33);
        }
        if (one11 > one22 && one11 > one33) {
            System.out.println("the greatest: " + one11);
        }
        if (one22 > one11 && one22 > one33) {
            System.out.println("the greatest: " + one22);
        }
        System.out.println("--------------Q8------------------");
        Scanner day1 = new Scanner(System.in);
        System.out.println("ENTAR number of day: ");
        int day= in.nextInt();
        String name=" ";
        switch (day){
            case 1:
                name="sunday";
                break;
            case 2:
                name="monday";
                break;
            case 3:
                name="TUesday";
                break;
            case 4:
                name="wednesday";
                break;
            case 5:
                name="thursday";
                break;
            case 6:
                name="friday";
                break;
            case 7:
                name="satday";
                break;
        }
       System.out.println( name);


    }
}
