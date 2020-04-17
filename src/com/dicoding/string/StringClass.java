package com.dicoding.string;

public class StringClass {
    public  static void main (String[] args){
        String first = "First";
        System.out.println(first);

        char[] testchar = {'T','E','S','T'};
        String second = new String(testchar);
        System.out.println(second);

        //length() mengetahui panjang atau jumlah karakter dalam string
        int lengthfirst = first.length();
        System.out.println(lengthfirst);

        //charAt(int index) mengambil sebuah karakter berdasarkan indeks tertentu.
        char firstke1 = first.charAt(0);
        System.out.println(firstke1);

        //format(String format, Object… args) memformat sebuah string.
        String third = String.format("ini percobaan %s", second);
        System.out.println(third);

    }
}
