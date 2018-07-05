import java.util.List;

public class ChristmasTree {


    private int height;
    private boolean live;
    private List<ChristmasTreeToy> christmasTreeToys;


    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public List<ChristmasTreeToy> getChristmasTreeToys() {
        return christmasTreeToys;
    }

    public void setChristmasTreeToys(List<ChristmasTreeToy> christmasTreeToys) {
        this.christmasTreeToys = christmasTreeToys;
    }

    public ChristmasTree(int height, boolean live, List<ChristmasTreeToy> christmasTreeToys) {
        this.height = height;
        this.live = live;
        this.christmasTreeToys = christmasTreeToys;

    }

}


