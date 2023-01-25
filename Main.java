import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите lower:");
        int lower = scanner.nextInt();
        System.out.println("Введите upper:");
        int upper = scanner.nextInt();

        Random random = new Random();

        int intervalLength = upper - lower + 1;

        System.out.println("Рандом выдал:");
        System.out.print(random.nextInt(intervalLength) + lower + " ");
        System.out.print(random.nextInt(intervalLength) + lower + " ");
        System.out.print(random.nextInt(intervalLength) + lower + " ");
        System.out.print(random.nextInt(intervalLength) + lower + " ");
    }
}


        /*Random random = new Random();
        Random random1 = new Random(100l);

        int onlyRandom = random.nextInt();
        int seedRandom = random1.nextInt();
        int range0to5 = random.nextInt(1,16);

        System.out.println(onlyRandom);
        System.out.println(seedRandom);
        System.out.println(range0to5);
    }
}*/
