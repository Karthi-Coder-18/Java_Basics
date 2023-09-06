package practice.objects;

public class PoolPuzzle {

    double area;
    int height, length;

    public static void main(String[] args) {
        int x = 0;
        PoolPuzzle[] p = new PoolPuzzle[4];


        while (x < 4) {
            p[x] = new PoolPuzzle();
            p[x].height = (x + 1) * 2;
            p[x].length = x + 4;
            p[x].setArea();

            System.out.print(" Triangle " + x + " , area");
            System.out.println(" = " + p[x].area);
            x = x + 1;
        }

        int y = x;



        PoolPuzzle p1 = p[2];

        p[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", p1 area = " + p1.area);
    }

    void setArea() {
        area = (double) (height * length) / 2;
    }

}
