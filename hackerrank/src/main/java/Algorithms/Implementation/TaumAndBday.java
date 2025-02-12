package Algorithms.Implementation;

public class TaumAndBday {

    private static long taumBay(int b, int w, int bc, int wc, int z) {
        long optimalBC = Math.min(bc, wc + z);
        long optimalWC = Math.min(wc, bc + z);

        return b * optimalBC + w * optimalWC;
    }

    public static void main(String[] args) {

        System.out.println(taumBay(3,5,3,4,1));
        System.out.println(taumBay(10,10,1,1,1));
        System.out.println(taumBay(5,5,2,3,4));
        System.out.println(taumBay(3,6,9,1,1));
        System.out.println(taumBay(7,7,4,2,1));
        System.out.println(taumBay(3,3,1,9,2));
    }

}
