package resources;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "bottle";
            }
            System.out.println(beerNum + " " + word + " of beef on the wall");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take down one.");
            System.out.println("Take it around");
            beerNum -= 1;
            if (beerNum > 0 && beerNum == 1) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("There is no bottle on the wall");
            }
        }
    }
}
