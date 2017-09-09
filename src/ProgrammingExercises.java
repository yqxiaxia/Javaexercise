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
}
