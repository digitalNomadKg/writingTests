import java.util.Scanner;

public class StudentsGrade {

    private void getGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter grade: Choose from A to F:");

        String inputChar = scanner.nextLine();

        switch (inputChar.toUpperCase()) {
            case "A": {
                System.out.println("Your grade is - excellent");
                for (int i = 0; i < 5; i++) {
                    System.out.print("★");
                }
                break;
            }
            case "B": {
                System.out.println("Your grade is - very good");
                for (int i = 0; i < 4; i++) {
                    System.out.print("★");
                }
                break;
            }
            case "C": {
                System.out.println("Your grade is - good");
                for (int i = 0; i < 3; i++) {
                    System.out.print("★");
                }
                break;
            }

            case "D": {
                System.out.println("Your grade is - satisfactory");
                for (int i = 0; i < 2; i++) {
                    System.out.print("★");
                }
                break;
            }

            case "E": {
                System.out.println("Your grade is - sufficient");
                for (int i = 0; i < 1; i++) {
                    System.out.print("★");
                }
                break;
            }

            case "F": {
                System.out.println("Your grade is - insufficient");
                for (int i = 0; i <= 0; i++) {
                    System.out.print("☆");
                }
                break;
            }

            default: {
                System.out.println("Sorry no such mark, please try again: ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        StudentsGrade studentsGrade = new StudentsGrade();

        studentsGrade.getGrade();
    }
}
