import java.lang.reflect.Array;
import java.util.ArrayList;

public class ProgrammingExercises {
    public static void main(String[] args) {
        ProgrammingExercises exercises = new ProgrammingExercises();
        System.out.println("===one Asterisk===");
        exercises.oneAster();
        System.out.println("===line Asterisk===");
        exercises.oneLineAster(5);
        System.out.println("===multiple line Asterisk===");
        exercises.mutliLineAster(5);
        System.out.println("===triangle Asterisk===");
        exercises.triangle(5);
        System.out.println("===iso triangle Asterisk===");
        exercises.isoTriangle(0, 5);
        System.out.println("===iso diamond triangle Asterisk===");
        exercises.diamondTriangle(5);
        System.out.println("===iso diamond with name Asterisk===");
        exercises.diamondWithName(5, "yuqing");
        System.out.println("===fizzBuzz===");
        exercises.fizzBuzz();
        System.out.println("===prime Factor===");
        exercises.primeFactors(15);
    }

    private void oneAster() {
        System.out.println("*");
    }

    private void oneLineAster(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void mutliLineAster(int line) {
        for (int i = 0; i < line; i++) {
            System.out.println("*");
        }
    }

    private void triangle(int line) {
        for (int i = 0; i < line; i++) {
            oneLineAster(i + 1);
        }
    }

    private void isoTriangle(int spaceStart, int line) {
        String space = " ";
        spaceStart = line - 1 + spaceStart;
        for (int i = 0; i < line; i++) {
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < spaceStart; j++) {
                buf.append(space);
            }
            int asterNum = (i + 1) * 2 - 1;
            for (int k = 0; k < asterNum; k++) {
                buf.append("*");
            }
            spaceStart--;
            System.out.println(buf);
        }
    }

    private void isoTriangleInvert(int spaceStart, int line) {
        String space = " ";
        for (int i = 0; i < line; i++) {
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < spaceStart; j++) {
                buf.append(space);
            }
            int asterNum = (line - i) * 2 - 1;
            for (int k = 0; k < asterNum; k++) {
                buf.append("*");
            }
            spaceStart++;
            System.out.println(buf);
        }
    }

    private void diamondTriangle(int line) {
        isoTriangle(0, line);
        isoTriangleInvert(1, line - 1);
    }

    private void diamondWithName(int line, String name) {
        isoTriangle(1, line - 1);
        System.out.println(name);
        isoTriangleInvert(1, line - 1);
    }

    private void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private ArrayList<Integer> primeFactors(int data) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 2; i < data; i++) {
            if (data % i == 0) {
                list.add(i);
            }
        }
        for (Integer j:list) {
            System.out.println(j);
        }
        return list;
    }

}
