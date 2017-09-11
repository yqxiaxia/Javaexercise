package FibonacciGenerator;

public class FibonacciGenerator {

    public int getNumAtPosition(int position) {
        if (position < 2){
            return position;
        }
        return getNumAtPosition(position-1)+getNumAtPosition(position-2);
    }
}
