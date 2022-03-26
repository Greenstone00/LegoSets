package brickset;

import repository.Repository;

import java.util.Optional;

/**
 * Represents a repository of {@code LegoSet} objects.
 */
public class LegoSetRepository extends Repository<LegoSet> {

    public LegoSetRepository() {
        super(LegoSet.class, "brickset.json");
    }



        /**
         * Vissza adja a azoknak a szetteknek a számát ahol a theme "Duplo".
         *
         * @return a theme = duplo legoszettek számát
         */
        public long countSetThemeEqualsDuplo() {
            return getAll().stream().filter(legoTheme -> legoTheme.getTheme().contains("Duplo")).count();
        }

        /**
         * Vissza adja a legtöbb darabbal rendelkező szett darabjainak számát.
         *
         * @return a Pieces max értéket
         */
        public long setWithMostPieces() {
            return getAll().stream().mapToLong(legoPieces -> legoPieces.getPieces()).max().getAsLong();
        }

    /**
     * Vissza adja az első szett adatait, melynek neve 'A'-val kezdődik.
     * @return az első szettet melynek neve A-val kezdődik
     */
    public Optional<LegoSet> startsWithA() {
            return getAll().stream().filter(legonames -> legonames.getName().startsWith("A")).findFirst();
        }

    /**
     * vissza adja azoknak a szetteknek összegét, melyek tagjai tartalmazzák a 'Car'-t.
     * @return a számát a szettekenek ahol a 'Car' a tag-ok között van
     */
    public long tagEqualsCar() {
        return getAll().stream().filter(legoSet -> legoSet.getTags() != null && legoSet.getTags().contains("Car")).count();
    }

    /**
     * vissza adja a 'box' csomagolású legó szettek számát
     * @return a 'box' package-ingű típúsú szettek számát
     */
    public long boxP() {
        return getAll().stream().map(legopac -> legopac.getPackagingType()).count();
    }
}


