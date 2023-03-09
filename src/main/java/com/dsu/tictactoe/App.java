package com.dsu.tictactoe;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Que idioma quieres utilizar : \n 1.Espanol \n 2.Ingles");
        new TictactoeApp(2).runGame();
    }
}
