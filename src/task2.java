public class task2 {
    public static void main(String[] args) {

        double springCost = 150.50;
        double summerCost = 225.00;
        double autumnCost = 175.75;
        double winterCost = 310.25;


        double totalCost = springCost + summerCost + autumnCost + winterCost;


        System.out.println("--- Home Maintenance Cost Report ---");
        System.out.println("Spring Maintenance Cost: $" + springCost);
        System.out.println("Summer Maintenance Cost: $" + summerCost);
        System.out.println("Autumn Maintenance Cost: $" + autumnCost);
        System.out.println("Winter Maintenance Cost: $" + winterCost);
        System.out.println("------------------------------------");
        System.out.println("Total Yearly Maintenance Cost: $" + totalCost);
    }
}
