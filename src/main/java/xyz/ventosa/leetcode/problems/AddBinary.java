package xyz.ventosa.leetcode.problems;

import java.math.BigDecimal;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)));
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        boolean carryOver = false;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {
            int aa = 0;
            int bb = 0;

            try {
                aa = Integer.parseInt(a.substring(a.length()-1-i, a.length()-i));
            } catch (IndexOutOfBoundsException ignore) {}

            try {
                bb = Integer.parseInt(b.substring(b.length()-1-i, b.length()-i));
            } catch (IndexOutOfBoundsException ignore) {}

            switch (aa + bb) {
                case 2:
                    if (carryOver) {
                        result.insert(0, "1");
                    } else {
                        result.insert(0, "0");
                        carryOver = true;
                    }
                    break;
                case 0:
                    if (carryOver) {
                        result.insert(0, "1");
                        carryOver = false;
                    } else {
                        result.insert(0, "0");
                    }
                    break;
                case 1:
                    if (carryOver) {
                        result.insert(0, "0");
                    } else {
                        result.insert(0, "1");

                    }
                    break;

            }
        }
        if (carryOver) {
            result.insert(0, "1");
        }

        return result.toString();
    }
}
