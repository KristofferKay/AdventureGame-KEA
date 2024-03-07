import java.util.ArrayList;

public class Adventure {
    private Map map;
    private Player player;

    public Adventure() {
        map = new Map();
        player = new Player(map.getRoom1());
    }

    public Map getMap() {
        return map;
    }

    public Player getPlayer() {
        return player;
    }


    public Room goNorth(){
        return player.goNorth();
    }

    public Room goSouth(){
        return player.goSouth();
    }

    public Room goWest(){
        return player.goWest();
    }

    public Room goEast(){
        return player.goEast();
    }

    public ArrayList<Item> getPlayerItems(){
        return player.getAllItems();
    }

    public Item takeItem(String shortName) {
        Room currentRoom = player.getCurrentRoom();
        Item takenItem = currentRoom.removeItemInRoom(shortName);
        if (takenItem != null) {
            player.addItem(takenItem); // Add the item to the player's inventory
        }
        return takenItem;
    }

        public Item dropItem(String shortName){
        return player.dropItem(shortName);
    }

}