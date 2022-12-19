package com.turgay;

public class RoketAnimasyonu {
    public static void RoketAnimasyonu() throws InterruptedException {

        // get current system time and end the while loop after 3 seconds pass
        long t= System.currentTimeMillis();
        long end = t+3000;
        while(System.currentTimeMillis() < end) {
            // first spacing between frames
            System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();

            // first frame
            System.out.println("    *        *                *            ");
            System.out.println("                           ()              ");
            System.out.println("          *        |                       ");
            System.out.println("  *               (|)       *       {}     ");
            System.out.println("        *        /   \\                    ");
            System.out.println("    ()          [|||||]             *      ");
            System.out.println("                ( ( ) )      *             ");
            System.out.println(" *               (( ))              {}     ");

            //time between frames
            Thread.sleep(200);

            // second spacing between frames
            System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();

            // second frame
            System.out.println("    {}             |                  {}   ");
            System.out.println("  *               (|)       *              ");
            System.out.println("        *        /   \\                    ");
            System.out.println("    ()       *  [|||||]             *      ");
            System.out.println("        *       ( ( ) )      *             ");
            System.out.println(" *               (( ))              {}     ");
            System.out.println("           *            *                  ");
            System.out.println("         {}                ()         *    ");

            Thread.sleep(200);
        }
        System.out.println("aracınız istenilen gezegene ulaştı!");
    }
}