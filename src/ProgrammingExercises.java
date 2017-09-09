public class ProgrammingExercises {
    public static void main(String[] args) {
        ProgrammingExercises exercises = new ProgrammingExercises();
        System.out.println("===one Asterisk===");
        exercises.oneAster();
        System.out.println("===line Asterisk===");
        exercises.oneLineAster(8);
        System.out.println("===multiple line Asterisk===");
        exercises.mutliLineAster(3);
        System.out.println("===triangle Asterisk===");
        exercises.triangle(6);
        System.out.println("===iso triangle Asterisk===");
        exercises.isoTriangle(5);
        System.out.println("===iso triangle invert Asterisk===");
        exercises.diamondTriangle(5);
        System.out.println("haha");
    }

    private void oneAster(){
        System.out.println("*");
    }

    private void oneLineAster(int num){
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private void mutliLineAster(int line){
        for (int i = 0; i < line; i++) {
            System.out.println("*");
        }
    }

    private void triangle(int line){
        for (int i = 0; i < line; i++) {
            oneLineAster(i+1);
        }
    }

    private void isoTriangle(int line){
        String space = " ";
        int spaceStart = line -1;
        for (int i = 0; i < line; i++) {
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < spaceStart; j++) {
                buf.append(space);
            }
            int asterNum = (i+1)*2-1;
            for (int k = 0; k < asterNum; k++) {
                buf.append("*");
            }
            spaceStart--;
            System.out.println(buf);
        }
    }

    private void isoTriangleInvert(int spaceStart, int line){
        String space = " ";
        for (int i = 0; i < line; i++) {
            StringBuffer buf = new StringBuffer();
            for (int j = 0; j < spaceStart; j++) {
                buf.append(space);
            }
            int asterNum = (line - i)*2 -1;
            for (int k = 0; k < asterNum; k++) {
                buf.append("*");
            }
            spaceStart++;
            System.out.println(buf);
        }
    }

    private void diamondTriangle(int line){
        isoTriangle(line);
        isoTriangleInvert(1,line-1);
    }

}
