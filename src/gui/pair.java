package gui;

public class pair {
    public int x,y;

    public pair(int x,int y) {
        this.x = x;
        this.y=y;
    }

    public String toString() {
        return Integer.toString(x)+","+Integer.toString(y);
    }
}
