public class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
        double x_t = finalPosition;
        double a = gravity;
        double t = fallingTime;
        double v_i = initialVelocity;
        double x_i = initialPosition;
        x_t = 0.5 * a * Math.pow(t,2) + v_i * t + x_i;
        System.out.println(x_t);
    }
}
