import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Toto {
    public static void main(String[] args) {

        int[] ChoiceOfTheNumbers = new int[6];

        int[] FirstDraw = new int[6];
        int[] SecondDraw = new int[6];
        int[] ThirdDraw = new int[6];

        int HitTheFirstDraw = 0;
        int HitTheSecondDraw = 0;
        int HitTheThirdDraw = 0;




        youHitTheFirstNumber(ChoiceOfTheNumbers, FirstDraw,  HitTheFirstDraw);
        choiceOfNumer(ChoiceOfTheNumbers);
        drawingNumbers(FirstDraw, SecondDraw, ThirdDraw);

        for (int i = 0; i < 6 ; i++) {
            System.out.print(FirstDraw[i] + " , ");
            System.out.print(SecondDraw[i] + " , ");
            System.out.println(ThirdDraw[i] + " , ");
        }

        System.out.println(HitTheFirstDraw);
        System.out.println(HitTheSecondDraw);
        System.out.println(HitTheThirdDraw);

    }

    private static int youHitTheFirstNumber(int[] choiceOfTheNumbers, int[] firstDraw, int hitTheFirstDraw) {
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 6 ; j++) {
                if (choiceOfTheNumbers[i] == firstDraw[j]){
                    hitTheFirstDraw++;
                }
            }
        }
        return hitTheFirstDraw;
    }

    private static int choiceOfNumer(int[] choiceOfTheNumbers) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Моля въведете число номер " + i + " : ");
            choiceOfTheNumbers[i] = input.nextInt();
            return choiceOfTheNumbers[];
        }
    }

    private static int drawingNumbers(int[] firstDraw, int[] secondDraw, int[] thirdDraw) {
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            firstDraw[i] = rand.nextInt(49) + 1;
            return firstDraw[];
        }
        for (int i = 0; i < 6; i++) {
            secondDraw[i] = rand.nextInt(49) + 1;
            return secondDraw[];
        }
        for (int i = 0; i < 6; i++) {
            thirdDraw[i] = rand.nextInt(49) + 1;
            return thirdDraw[];
        }
    }
}
