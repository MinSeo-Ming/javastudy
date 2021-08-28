package com.javastudy.chapter09.ex26;

import java.util.*;
import java.util.Objects;

import static java.util.Objects.*;

public class ObjectTest {
    public static void main(String[] args) {
        String [][] str2D = new String[][] {{"abc","bbb"}, {"AAA","BBB"}};
        String [][] str2D_2 = new String[][] {{"abc","bbb"}, {"AAA","BBB"}};

        System.out.println("str2D = { ");
        for (String [] tmp : str2D)
            System.out.println(Arrays.toString(tmp));
        System.out.println("}");

        System.out.println("equals(str2D, str2D_2)="
        + Objects.equals(str2D,str2D_2));

        System.out.println("deepequals(str2D, str2D_2)="
                + Objects.deepEquals(str2D,str2D_2));

        System.out.println("isNull(null) = " + isNull(null));
        System.out.println("nonNull(null) = " + nonNull(null));
        System.out.println("hashCode(null) = " + Objects.hashCode(null));
        System.out.println("toString(null) = " + Objects.toString(null));

        System.out.println("toString(null,\"\") ="
                + Objects.toString(null,""));

        Comparator c = String.CASE_INSENSITIVE_ORDER;

        System.out.println("compare(\"aa\",\"bb\")="+compare("aa","bb",c));
        System.out.println("compare(\"bb\",\"aa\")="+compare("bb","aa",c));
        System.out.println("compare(\"ab\",\"AB\")="+compare("ab","AB",c));
    }
}
