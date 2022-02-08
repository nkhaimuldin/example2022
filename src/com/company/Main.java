package com.company;

import com.company.interfaces.IAthlete;

public class Main {
    public static void main(String[] args) {
        IAthlete athlete = new JumpingSwimmer("Ivan");
        athlete.compete();
        athlete.sayHooray();
    }
}
