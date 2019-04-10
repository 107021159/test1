import java.sql.SQLOutput;

public class Hero {
    protected String description;
    protected float hp,mp,ad;
    protected int speed;
    public void showInfo(){
        System.out.println(this.description+"("+this.hp+")");
        System.out.println(this.description+"("+this.mp+")");
        System.out.println(this.description+"("+this.speed+")");
    }
    public void hurt(float data[]) {
        if (this.hp - data[0] > 0) {
            this.hp -= data[0];
        } else {
            this.hp = 0;
        }
        if (this.mp - data[1] > 0) {
            this.mp -= data[1];
        } else {
            this.mp = 0;
        }
        if (this.speed - data[2] > 0) {
            this.speed -= data[2];
        } else {
            this.speed = 0;
        }
    }}
