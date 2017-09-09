public class firstRes {

    public static void main(String[] args) {
        firstRes firstRes = new firstRes();
        firstRes.printNum();
    }

    private void printNum() {
        int beerNum = 5;
        while (beerNum > 0) {
            beerNum = beerNum - 1;
            System.out.println(beerNum);
        }
    }
}
