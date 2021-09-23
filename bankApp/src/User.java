
public class User {

    private String firstName, lastName;
    private int personalId;
    private double totalAmount, depositAmount;


    public User(String firstName, String lastName, int personalId, double totalAmount, double depositAmount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.totalAmount = totalAmount;
        this.depositAmount = depositAmount;
    }

    public String fullName() {
        return firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }


    private void printInstruction() {


    }


}
