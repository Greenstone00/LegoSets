package brickset;

import java.time.Year;
import java.util.Set;

@lombok.Data
public class LegoSet {

    private String number;
    private String name;
    private Year year;
    private String theme;
    private String subtheme;
    private PackagingType packagingType;
    private int pieces;
    private String bricksetURL;
    private Set<String> tags;
    private Dimensions dimensions;


    public static void main(String[] args) {

        var repository_one = new LegoSetRepository();
        System.out.println("Duplo témájú szettek száma: " + repository_one.countSetThemeEqualsDuplo());

        var repository_two = new LegoSetRepository();
        System.out.println("Legtöbb lego darabot tartalmazó szett lego darabjainak száma: " + repository_two.setWithMostPieces());

        var repository_three = new LegoSetRepository();
        System.out.println(repository_three.startsWithA());

        var repository_four = new LegoSetRepository();
        System.out.println("'Car'-t tartalamzó szettek száma: " + repository_four.tagEqualsCar());

        var reposity_five = new LegoSetRepository();
        System.out.println("Az összes szett melynek csomagolása 'box' típusú: " + reposity_five.boxP());

    }
}




