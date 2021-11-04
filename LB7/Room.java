package LB7;

public class Room {
        private int id;
        private String type;
        private int square;

        public Room(int id, String type, int square){
            this.id = id;
            this.type = type;
            this.square = square;
        }

    public String getType() {
        return type;
    }

    public int getSquare() {
        return square;
    }
}
