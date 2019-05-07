package luckyblocks.utils.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomGenerator {

    /*
        API (RandomGenerator)

        Version: 0.1
        Coder: https://vk.com/zhcoder
     */

    private ArrayList<RandomElement> randomElements = new ArrayList<>();

    public void addRandomElements(RandomElement randomElement) {
        this.randomElements.add(randomElement);
    }

    public RandomElement getRandomElement() {
        int randomChance = new Random().nextInt(100) + 1;

        RandomElement randomElement = null;;

        for (RandomElement currentElement : randomElements) {
            int currentChance = currentElement.getChance();

            if (randomElement != null) {
                if (randomElement.getChance() >= currentChance) {
                    randomElement = currentElement;
                }
                continue;
            }

            if (currentChance >= randomChance) {
                randomElement = currentElement;
            }
        }
        return null;

    }




}
