package xyz.ventosa.leetcode.problems;

import java.util.Arrays;
import java.util.HashSet;

public class NumberOfWeakCharacters {

    //brute
    public int bruteNumberOfWeakCharacters(int[][] properties) {
        HashSet<Integer> result = new HashSet<>();

        for (int i = 0; i < properties.length; i++) {
            for (int[] property : properties) {
                if (properties[i][0] < property[0] && properties[i][1] < property[1]) {
                    result.add(i);
                }
            }
        }

        return result.size();
    }

    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a, b) -> {
            if (a[0] != b[0]) {
                return b[0]-a[0];
            } else {
                return a[1]-b[1];
            }
        });

        for (int[] thing: properties)  {
            System.out.println(thing[0] + "," + thing[1]);
        }

        int result = 0;
        int maxDef = properties[0][1];

        for (int i = 1; i < properties.length; i++) {
            if (properties[i][1] < maxDef) result++;
            maxDef = Math.max(maxDef, properties[i][1]);
        }

        return result;
    }

    public static void main(String[] args) {
        new NumberOfWeakCharacters().numberOfWeakCharacters(new int[][]{{1,2},{3,4},{1,1},{9,9},{3,5},{3,11}});
    }
}
