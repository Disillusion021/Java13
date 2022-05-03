package com.coding.Test.枚举类;

public class TestColorSwitch {
    public static void main(String[] args) {
        Color color = Color.RED;
        switch (color) {
            case BLACK:
                System.out.println("BLACK");
                color.show();
                break;
            case RED:
                System.out.println("RED");
                color.show();
                break;
            case BLUE:
                System.out.println("BLUE");
                color.show();
                break;
            case GREEN:
                System.out.println("GREEN");
                color.show();
                break;
            case YELLOW:
                System.out.println("YELLOW");
                color.show();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + color);
        }
    }
}
