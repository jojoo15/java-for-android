package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    public static void print(Building[] buildings, String header, OutputInterface out) {
        out.print(header + "\n");
        out.print("----------\n");
        for(Building b: buildings) {
            out.print(b.toString() + "\n");
        }
        out.print("\n");
    }

    public static int calcArea(Building[] buildings) {
        int total = 0;
        for(Building b: buildings) {
            total += b.calcLotArea();
        }
        return total;
    }

}
