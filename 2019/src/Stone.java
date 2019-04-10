import java.util.Random;

public class Stone extends Monster {
    private String name;
    public Stone(){
        super.count++;
        hp=1200;
        def=18;
        Random rand=new Random(System.currentTimeMillis());
        x=rand.nextInt(1024);
        y=rand.nextInt(1024);
        name="Stone"+Integer.toString(Monster.getMonsterCount());

    }
    @Override
    public float[] attack(){
        float data[]={1f,2f,0,0,0};
        return data;
    }
    public void showInfo(){
        System.out.println(name);
        super.showInfo();
    }
}
