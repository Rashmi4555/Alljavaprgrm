public class logicalopr  {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;
        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }
        boolean hasPassport = false;
        boolean hasIDCard = true;

        if (hasPassport || hasIDCard) {
            System.out.println("You can verify your identity.");
        } else {
            System.out.println("No valid ID found.");
        }
        boolean isRaining = false;

        if (!isRaining) {
            System.out.println("You can go outside without an umbrella.");
        } else {
            System.out.println("Take an umbrella!");
        }
    }
}
