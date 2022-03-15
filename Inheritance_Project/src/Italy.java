public class Italy extends Country {

    private boolean isInEU;

    public Italy(String name, int population, int gdp, String capital) {
        super(name, population, gdp, capital);
        isInEU = true;
    }

    public void leaveEU() {
        System.out.println("We have officially left the European Union");
        isInEU = false;
    }
}
