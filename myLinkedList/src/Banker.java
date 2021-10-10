public class Banker {

    private String Name;
    private double cBalance;

    public Banker(String name, double cBalance) {
        Name = name;
        this.cBalance = cBalance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getcBalance() {
        return cBalance;
    }

    public void setcBalance(double cBalance) {
        this.cBalance = cBalance;
    }
}
