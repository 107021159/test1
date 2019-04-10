public abstract class Monster {
    protected float hp, def;
    protected int x, y;
    protected static int count;

    public abstract float[] attack();

    public void showInfo() {
        System.out.println("(HP:" + hp + ",defence:" + def + "), Locatoin:(" + x + "," + y + ")");
    }

    public static int getMonsterCount() {
        return count;
    }

    public void hurt(float data[]) {
        if (this.hp - data[0] > 0) {
            this.hp -= data[0];
        } else {
            this.hp = 0;
        }
    }
}

