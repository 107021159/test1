public class Jhin extends Hero {

    public Jhin() {
        description = "炫技大師 燼";
        hp = 556f;mp = 300f;ad = 51f;speed = 330;
    }

    public float[] passiveAttack() {
        float data[] = {11f, 6f, 0f};
        return data;
    }

    public float[] QAttack() {
        float data[] = {12f, 12f, 2f};
        return data;
    }

    public float[] WAttack() {
        float data[] = {22f, 20f, 0.3f};
        return data;
    }

    public float[] EAttack() {
        float data[] = {30f, 15f, 0f};
        return data;
    }

    public float[] RAttack() {
        float data[] = {25f, 25f, 0.5f};
        return data;
    }




}
