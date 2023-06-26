package com.vamsi.javaPractice;

import java.math.BigDecimal;

public class bnhjk {
    public static void main(String[] args) {
        BigDecimal d=BigDecimal.valueOf (10.00);
        boolean b = d.compareTo (BigDecimal.valueOf (10.00)) == 0;
        System.out.println (b);
    }
}
