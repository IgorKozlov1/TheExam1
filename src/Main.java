

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        ChristmasTreeToy toy1= new ChristmasTreeToy(ColorOfToy.red,5);
        ChristmasTreeToy toy2=new ChristmasTreeToy(ColorOfToy.white,8);
        ChristmasTreeToy toy3=new ChristmasTreeToy(ColorOfToy.green,6);
        ChristmasTreeToy toy4=new ChristmasTreeToy(ColorOfToy.white,5);
        ChristmasTreeToy toy5=new ChristmasTreeToy(ColorOfToy.blue,3);
        ChristmasTreeToy toy6=new ChristmasTreeToy(ColorOfToy.red,5);
        ChristmasTreeToy toy7=new ChristmasTreeToy(ColorOfToy.yellow,7);
        ChristmasTreeToy toy8=new ChristmasTreeToy(ColorOfToy.green,5);
        ChristmasTreeToy toy9=new ChristmasTreeToy(ColorOfToy.white,3);
        ChristmasTreeToy toy10=new ChristmasTreeToy(ColorOfToy.red,5);


        List<ChristmasTreeToy> toyList= new ArrayList<>();
        toyList.add(toy1);
        toyList.add(toy2);
        toyList.add(toy3);
        toyList.add(toy4);
        toyList.add(toy5);
        toyList.add(toy6);
        toyList.add(toy7);
        toyList.add(toy8);
        toyList.add(toy9);
        toyList.add(toy10);

        System.out.println(toyList);

        ChristmasTree tree = new ChristmasTree(3, true, toyList);
        int x = SortToys.quantityOfRedToys(tree.getChristmasTreeToys());
        System.out.println("На елке " +x+" красных шаров" );
        List<ChristmasTreeToy> toyList2 = tree.getChristmasTreeToys();


        System.out.println("Сортируем по размеру");
        toyList2.sort(Comparator.comparing(ChristmasTreeToy::getSize));
        for (ChristmasTreeToy toy : toyList2) {
            System.out.println(toy);
        }

    }



}

