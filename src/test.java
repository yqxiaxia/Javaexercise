public class test {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle"; //
            }
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + "of beer on the wall");
            } else {
                System.out.println("No more bottles of beer on the wall");
            }//else
        } //while
    }
}
