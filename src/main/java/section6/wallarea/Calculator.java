package section6.wallarea;

import section6.carpetcostcalculate.Floor;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        System.out.println("total Cost : " + floor.getArea() * carpet.getCost());
        return floor.getArea() * carpet.getCost();
    }
}
