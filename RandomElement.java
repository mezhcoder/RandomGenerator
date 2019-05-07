package luckyblocks.utils.random;

public abstract class RandomElement {

    private int chance;

    public RandomElement(int chance) {
        this.chance = chance;
    }

    protected int getChance() {
        return chance;
    }

    protected void setChance(int chance) {
        this.chance = chance;
    }
}
