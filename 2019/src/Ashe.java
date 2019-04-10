public class Ashe extends Hero {

    public Ashe() {
        description = "冰霜射手 艾希 ";
        hp = 539f;mp = 280f;ad = 61f;speed = 325;
    }
    public float[] passiveAttack () {
        float data[] = {15f, 10f, 0f};
        return data;
    }
    public float[] QAttack () {
        float data[] = {12f, 10f, 2f};
        return data;
    }
    public float[] WAttack () {
        float data[] = {22f, 2f, 0.3f};
        return data;
    }
    public float[] EAttack () {
        float data[] = {20f, 5f, 0f};
        return data;
    }
    public float[] RAttack () {
        float data[] = {1000f, 5f, 0.5f};
        return data;
    }
}
