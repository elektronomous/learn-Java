/* (Algebra: solve 2 x 2 linear equations) You can use Cramer's rule to solve
 * the following 2 x 2 system of linear equation provided that ad - bc is not 0:
 *      ax + by = e
 *      cx + dy = f
 * 
 *      x = (ed - bf) / (ad - bc)
 *      y = (af - ec) / (ad - bc)
 * 
 * Write a program that solves the following equations and displays the value for x
 * and y: (Hint: replace the symbols in the formula with numbers to compute x and y.
 *               This exercise can be done in Chapter1 without using materials in later
 *               chapters)
 * 
 *      3.4x + 50.2y = 44.5
 *      2.1x + 0.55y = 5.9
 * 
 * 
 * a = 3.4
 * b = 50.2
 * c = 2.1
 * d = 0.55
 * e = 44.5
 * f = 5.9
 
 * x = ((44.5 x 0.55) - (50.2 x 5.9)) / ((3.4 x 0.55) - (50.2 x 2.1))
 * y = ((3.4 x 5.9) - (44.5 x 2.1)) / ((3.4 x 0.55) - (50.2 x 2.1))
 */

public class Exercise1_13 {
    public static void main(String[] args) {
        System.out.print("x = ");
        System.out.println(((44.5 * 0.55) - (50.2 * 5.9)) / ((3.4 * 0.55) - (50.2 * 2.1)));
        System.out.print("y = ");
        System.out.println(((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * 0.55) - (50.2 * 2.1)));
    }
}