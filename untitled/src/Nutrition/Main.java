package Nutrition;


abstract class Food {

    private double protein;
    private double fats;
    private double carbs;
    private double tastyScore;

    Food(double protein, double fats, double carbs) {
        this.protein = protein;
        this.fats = fats;
        this.carbs = carbs;

    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFats() {
        return fats;
    }

    public void setFats(double fats) {
        this.fats = fats;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }

    public double getTastyScore() {
        return tastyScore;
    }

    public void setTastyScore(double tastyScore) {
        this.tastyScore = tastyScore;
    }

    abstract void getMacroNuritions();
}

class Eggs extends Food {
    private int tastyScope = 7;
    private String type = "Non-vegtarian";

    Eggs(double protein, double fats, double carbs) {
        super(protein, fats, carbs);
    }

    @Override
    void getMacroNuritions() {
        System.out.println("Egg is " + type);
        System.out.printf("An egg has " + getProtein() + " gms of protein," + getFats() + " gms of fats and " + getCarbs() + "gms of carbohydrates.\n");
        System.out.println("Taste:" + tastyScope);
    }
}


class Bread extends Food {
    private int tastyScope = 8;
    private String type = "vegtarian";

    Bread(double protein, double fats, double carbs) {
        super(protein, fats, carbs);
    }

    @Override
    void getMacroNuritions() {
        System.out.println("Break is " + type);
        System.out.printf("A slice of break has " + getProtein() + " gms of protein," + getFats() + " gms of fats and " + getCarbs() + "gms of carbohydrates.\n");
        System.out.println("Taste:" + tastyScope);
    }
}

public class Main {
    public static void main(String[] args) {

        Bread bread = new Bread(4.0, 1.1, 13.8);
        bread.getMacroNuritions();
        Food eggs = new Eggs(7, 5, 3);
        eggs.getMacroNuritions();
    }
}
