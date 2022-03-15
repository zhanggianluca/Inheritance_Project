public class Country {
    private String name, capital;
    private int population, gdp;

    public Country (String name, int population, int gdp, String capital) {
        this.name = name;
        this.population = population;
        this.gdp = gdp;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public int getGDP() {
        return gdp;
    }

    public String getCapital() {
        return capital;
    }

    public void declareWar() {
        System.out.println("We declare WAR!");
    }
}
