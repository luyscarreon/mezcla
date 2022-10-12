/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mezcla;

import java.util.Scanner;

/**
 *
 * @author luyscarreon
 */
public class Mezcla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, m;
        int nv[];
        int mv[];
        String l1, l2;
        Scanner sc = new Scanner(System.in);

        //Lectura
        n = sc.nextInt();
        nv = new int[n];
        for (int i = 0; i < n; i++) {
            nv[i] = sc.nextInt();
        }
        m = sc.nextInt();
        mv = new int[m];
        for (int i = 0; i < m; i++) {
            mv[i] = sc.nextInt();
        }

        l1 = sc.next();
        l2 = sc.next();

        //Mezcla
        if (l1.equals("inicio") && l2.equals("inicio")) {
            if (n > m) {
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[i]);
                    if (i < m) {
                        System.out.println(mv[i]);
                    }
                }
            }
            if (m > n) {
                for (int i = 0; i < m; i++) {
                    if (i < n) {
                        System.out.println(nv[i]);
                    }
                    System.out.println(mv[i]);
                }
            }
            if(n==m){
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[i]);
                    System.out.println(mv[i]);
                }
            }
        }
        
        if (l1.equals("fin") && l2.equals("fin")) {
            if (n > m) {
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[n-i-1]);
                    if (i < m) {
                        System.out.println(mv[m-i-1]);
                    }
                }
            }
            if (m > n) {
                for (int i = 0; i < m; i++) {
                    if (i < n) {
                        System.out.println(nv[n-i-1]);
                    }
                    System.out.println(mv[m-i-1]);
                }
            }
            if(n==m){
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[n-i-1]);
                    System.out.println(mv[m-i-1]);
                }
            }
        }
        
        if(l1.equals("inicio") && l2.equals("fin")){
            if (n > m) {
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[i]);
                    if (i < m) {
                        System.out.println(mv[m-i-1]);
                    }
                }
            }
            if (m > n) {
                for (int i = 0; i < m; i++) {
                    if (i < n) {
                        System.out.println(nv[i]);
                    }
                    System.out.println(mv[m-i-1]);
                }
            }
            if(n==m){
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[i]);
                    System.out.println(mv[m-i-1]);
                }
            }
        }
        
        if(l1.equals("fin") && l2.equals("inicio")){
            if (n > m) {
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[n-i-1]);
                    if (i < m) {
                        System.out.println(mv[i]);
                    }
                }
            }
            if (m > n) {
                for (int i = 0; i < m; i++) {
                    if (i < n) {
                        System.out.println(nv[n-i-1]);
                    }
                    System.out.println(mv[i]);
                }
            }
            if(n==m){
                for (int i = 0; i < n; i++) {
                    System.out.println(nv[n-i-1]);
                    System.out.println(mv[i]);
                }
            }
        }

    }
}
