package com.company;

public class Member implements Comparable<Member>{
    public int id;
    public double age;

    public Member(int id, int year, int month){
        this.id = id;
        age = Double.parseDouble(year + "." + month);
    }

    @Override
    public String toString() {
        return "Member{\n" +
                "'id':" + id +
                "\n'age':" + age +
                "\n}";
    }

    @Override
    public int compareTo(Member member) {
        return Double.compare(this.age, member.age);
    }
}
