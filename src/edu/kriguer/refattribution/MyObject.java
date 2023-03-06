package edu.kriguer.refattribution;

public class MyObject {
    int num;

    public MyObject(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "num=" + num +
                '}';
    }
}
