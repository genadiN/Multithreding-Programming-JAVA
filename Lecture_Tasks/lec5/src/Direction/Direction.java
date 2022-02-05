package Direction;

public enum Direction {
    //Enum types
    EAST(0) {public String shout(){return "Diretion is East !!!"; } },
    WEST(180) {public String shout(){return "Diretion is West !!!"; } },
    NORTH(90) {public String shout(){return "Diretion is North !!!"; } },
    SOUTH(270) {public String shout(){return "Diretion is South !!!"; } };

    //Constructor
    private Direction(final int angle){
        this.angle = angle;
    }

    //Internal state
    private int angle;
    public int getAngle(){
        return angle;
    }

    //abstract method which need to be implemented <strong>
    public abstract String shout();

    private static void exerEnumDirection(){
        for(Direction dir : Direction.values()){
            System.out.printf("%s %d %s\n" , dir , dir.getAngle() , dir.shout());
        }
    }

}//end enum Direction class

