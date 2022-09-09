package codeWars;

public class Solution {

    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;
        } else {
            return 2 * l + 2 * w;
        } // end if/else condition
    } // end areaOrPerimeter method
} // end Solution class
