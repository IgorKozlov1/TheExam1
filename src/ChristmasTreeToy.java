import java.util.Objects;

public class ChristmasTreeToy {
    private ColorOfToy color;
    private int size;

    public ChristmasTreeToy(ColorOfToy color, int size) {
        this.color = color;
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public ColorOfToy getColor() {
        return color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChristmasTreeToy that = (ChristmasTreeToy) o;
        return size == that.size &&
                color == that.color;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, size);
    }


    @Override
    public String toString() {
        return "ChristmasTreeToy{" +
                "color=" + color +
                ", size=" + size +
                '}';
    }
}



