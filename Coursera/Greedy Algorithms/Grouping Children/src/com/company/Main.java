package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static int minimumGroups(ArrayList<Member> members){
        Collections.sort(members);
        int numberOfGroups = 0;
        return numberOfGroups;
    }

    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>(
                Arrays.asList(new Member(1, 4, 2),
                        new Member(2, 3, 2),
                        new Member(3, 5, 0),
                        new Member(4, 4, 6)
                ));



    }
}
