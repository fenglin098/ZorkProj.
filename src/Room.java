import java.util.ArrayList;

public class Room {
    private int row;
    private int col;
    private ArrayList<String> items;
    private String name;
    private ArrayList<String> direction;

    public Room() {
    }

    public Room(ArrayList<String> items, String name, ArrayList<String> direction) {
        this.items = items;
        this.name = name;
        this.direction = direction;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getDirection() {
        return direction;
    }

    public void setDirection(ArrayList<String> direction) {
        this.direction = direction;
    }

    public int userDirection(String x) {
        switch (x) {
            case "n":
                row--;
                break;
            case "s":
                row++;
                break;
            case "w":
                col--;
                break;
            case "e":
                col++;
                break;
        }
    }

}
