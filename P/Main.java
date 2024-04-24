package P;

import P1.TwoDim;
import P2.ThreeDim;

public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        TwoDim twoDim = new TwoDim(5, 10);
        System.out.println(twoDim);
        twoDim = new TwoDim();
        System.out.println(twoDim);
        int z = 100;
        ThreeDim threeDim = new ThreeDim(x, y, z);
        System.out.println(threeDim);
        threeDim = new ThreeDim();
        System.out.println(threeDim);
    }
}
