public class United_States extends Country {

    private int numStates;

    public United_States(String name, int population, int gdp, String capital) {
        super(name, population, gdp, capital);
        numStates = 50;
    }

    public void annexState() {
        System.out.println("We have annexed a new state into our union!");
    }
}
