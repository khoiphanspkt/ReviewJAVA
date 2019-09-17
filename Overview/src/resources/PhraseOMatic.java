package resources;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"24/7","multi-Tier","30,0000 foot", "B-to-B", "win-win", "front-end", "web-based",
        "pervasive", "smart", "sixsigma","critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed",
                "clustered", "branded","outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        //Output: how many words that the array have
        int countWordListOne = wordListOne.length;
        int countWordListTwo = wordListTwo.length;
        int countWordListThree = wordListThree.length;

        //generate three random numbers

        int rand1 = (int)(Math.random() * countWordListOne);
        int rand2 = (int)(Math.random() * countWordListTwo);
        int rand3 = (int)(Math.random() * countWordListThree);

        //build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("What we need now is " + phrase);
    }
}
