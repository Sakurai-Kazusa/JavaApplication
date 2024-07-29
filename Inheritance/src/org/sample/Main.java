package org.sample;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(100, "Japan", "Red", "甘い");
        Apple apple2 = new Apple(200, "Japan", "Green", "酸っぱい");
        Apple apple3 = new Apple(300, "Japan", "Blue", "辛い");
        Apple apple4 = new Apple(400, "Japan", "Yellow", "苦い");
        /* Apple apple5 = new Apple(199, "Japan", "red", "sour");
        Apple apple6 = new Apple(199, "Japan", "red", "sour"); */

        /* FruitsPair<Apple> apair1 = new FruitsPair<>(apple1, apple2);
        FruitsPair<Apple> apair2 = new FruitsPair<>(apple3, apple4); */

        Quadruple<Apple> appleQuadruple = new Quadruple<>(apple1, apple2, apple3, apple4);

        HashSet<Fruits> fruitsHashSet1 = new HashSet<>();
        fruitsHashSet1.add(apple2);
        HashSet<Fruits> fruitsHashSet2 = new HashSet<>();
        fruitsHashSet2.add(apple3);

        Pair<String> p = new Pair<>("test1", "test2");

        Pair2<String, Integer> p2 = new Pair2<>("test1", 100);

        // Pair<Integer> p3 = new Pair<>(100, 200);



        System.out.println();

        /*
        Appleクラスのインスタンスを作成して
        Fruitsクラスのファイルに書いてある属性
        「price」「madeIn」を参照してみよう
        */
        System.out.println("PRICE:" + apple1.price + "\n" + "MADE IN:" + apple1.madeIn + "\n" + "COLOR:" + apple1.color + "\n");

        /*
        Appleクラスのインスタンスを作成して
        Fruitsクラスのメソッド「isMadeInJanan()」を使ってみよう
        */
        System.out.println(apple1.isMadeInJapan() + "\n");

        /*
        FruitsクラスのgetDetailメソッドを
        Appleクラスでオーバーライドしてみよう
        */
        System.out.println(apple1.getDetail());

        /*
        FruitsクラスのtoStringメソッドを
        オーバーライドしてみよう
        (Objectクラスが親クラス)
        */
        // System.out.println(fruits6);

        /* Pairクラスを作ってみよう */
        System.out.println(p);

        /* 型パラメータを2つ持つPairクラスを作ってみよう */
        System.out.println(p2);

        /* 四ツ組のジェネリクス作成 */
        System.out.println(appleQuadruple);

        System.out.println();

        /* Fruitsクラスのequalsメソッドを
        オーバーライドしてみよう！
        (Objectクラスが親クラス) */
        /* System.out.println(fruits2.equals(fruits3));
        System.out.println(fruits2.equals(fruits4));
        System.out.println(fruits2.equals(fruits5));
        System.out.println(fruits2.equals(fruits6)); */


        System.out.println();

        System.out.println(fruitsHashSet1.equals(fruitsHashSet2));

        System.out.println();

        /* ジェネリクスで使う型を限定する
        書き方を学んでみよう！(FruitsPairクラスの作成)
        */
        /* System.out.println(applePair1.getClass());
        System.out.println(fpair1.getClass());
        System.out.println(apair1.getClass()); */
    }
}

