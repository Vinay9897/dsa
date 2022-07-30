package infosis;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Game {

    /*
     * While playing an RPG game, you were assigned to complete one of the hardest
     * quests in this game. There are n monsters you’ll need to defeat in this
     * quest.
     * Each monster i is described with two integer numbers – poweri and bonusi.
     * To defeat this monster, you’ll need at least poweri experience points.
     * If you try fighting this monster without having enough experience points,
     * you lose immediately. You will also gain bonusi experience points if you
     * defeat this
     * monster. You can defeat monsters in any order.
     * 
     * The quest turned out to be very hard – you try to defeat the monsters but
     * keep losing repeatedly. Your friend told you that this quest is impossible to
     * complete.
     * Knowing that, you’re interested, what is the maximum possible number of
     * monsters
     * you can defeat?
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of monster you want: ");
        int n = sc.nextInt();
        System.out.println("Enter the Experience of the Hero");
        int exp = sc.nextInt();

        int[] monst = new int[n];
        int[] bonus = new int[n];
        System.out.println("Enter the power of " + n + " monsters :");
        for (int i = 0; i < n; i++) {
            monst[i] = sc.nextInt();
        }

        System.out.println("Enter the bonus after defeating " + n + " monsters :");
        for (int i = 0; i < n; i++) {
            bonus[i] = sc.nextInt();
        }

        class Monster {
            private final int power, bonus;

            public Monster(int power, int bonus) {
                this.power = power;
                this.bonus = bonus;
            }
        }

        Monster[] monster = new Monster[n];
        for (int i = 0; i < n; i++) {
            monster[i] = new Monster(monst[i], bonus[i]);
        }

        Arrays.sort(monster, Comparator.comparingInt(m -> m.power));

        // variable(count) will count the monsters(we will defeat)
        int count = 0;

        for (Monster a : monster) {
            if (exp < a.power)
                break;
            exp += a.bonus;
            count++;
        }
        System.out.println("No of monsters we have defeat : " + count);

        sc.close();
    }

}
