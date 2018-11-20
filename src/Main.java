/**
 * @author sokolov
 */
public class Main {
    public static void main(String[] args) {
        ShapeClassifier shapeClassifier = new ShapeClassifier();
        System.out.println(shapeClassifier.evaluateGuess("Equilateral,Large,Yes,100,100,100"));
    }
}
