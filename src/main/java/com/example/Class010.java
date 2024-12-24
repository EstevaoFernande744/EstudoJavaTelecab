package com.example;

public class Class010 {

    public static void main(String[] args) {


        String original = "abcd FGHIJ ABC abc DEFG   ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j  = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("Trim: -" + s03 + "-");
        System.out.println("substring" + s04);
        System.out.println("substring em um limite" + s04);
        System.out.println("Replace trocando a p/ x"+ s06 +"-");
        System.out.println("Replace trocando abc p/ xy"+ s07 +"-");
        System.out.println("Index of 'bc': "+ i );
        System.out.println("Last Index of 'bc': "+ j );

        /*
   Formatar: toLowerCase(), toUpperCase(), trim();
   Recortar: substring(inicio), substring(inicio, final);
   Substituir: Replace(char, char), Replace(string, string);
   Buscar: indexOf, LastlndexOF;
   str.Split("");
   */


    }
}
