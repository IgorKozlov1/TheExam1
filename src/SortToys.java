import java.util.List;

public class SortToys {

    public static int quantityOfRedToys(List<ChristmasTreeToy> christmasTreeToys) {
        int b = 0;
        for (ChristmasTreeToy toy : christmasTreeToys) {
            if (toy.getColor() == ColorOfToy.red) {
                b++;
            }
        }
        return b;
    }


}
