package com.company;
class Hero{
    private static Hero hero = new Hero();
    private int guns;

    private Hero(){
        this.guns = 2;
    }
    public static Hero getInstance(){
        return hero;
    }
    public int getGuns(){
        return guns;
    }
    public void setGuns(int guns){
        this.guns = guns;
    }}
public class Main{
    public static void main(String[] args) {
        Hero prHero = Hero.getInstance();
        System.out.println("Колличество оружия у героя: " + prHero.getGuns());
        prHero.setGuns(4);
        System.out.println("Колличество оружия у героя: "  + prHero.getGuns());
    }}