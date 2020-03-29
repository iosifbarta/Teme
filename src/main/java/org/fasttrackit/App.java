package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        OperatiiMatematice operatii = new OperatiiMatematice();
        operatii.adunarea(14, 7);
        operatii.adunarea(14.00, 7.00);
        operatii.scaderea(14,7);
        operatii.scaderea(13.00, 12.00);
        operatii.inmultirea(14,7);
        operatii.inmultirea(8.00, 9.5);
        operatii.impartirea(15,7);
        operatii.impartirea(15.5, 2.8);




    }
}
