package home_work_1;

//1. Побитовые операции:
//        1.1. http://developer.alexanderklimov.ru/android/java/bitwise.php
//        ~	Побитовый унарный оператор NOT
//        &	Побитовый AND
//        &=	Побитовый AND с присваиванием
//        |	Побитовый OR
//        |=	Побитовый OR с присваиванием
//        ^	Побитовый исключающее OR
//        ^=	Побитовый исключающее OR с присваиванием
//        >>	Сдвиг вправо
//        >>=	Сдвиг вправо с присваиванием
//        >>>	Сдвиг вправо с заполнением нулями
//        <<	Сдвиг влево
//        <<=	Сдвиг влево с присваиванием
//        >>>=	Сдвиг вправо с заполнением нулями с присваиванием

//        1.2 Использовать ВСЕ возможные побитовые операции с числами 42 и 15.
//        1.3 Использовать ВСЕ возможные побитовые операции с числами -42 и -15.
//        1.4 В комментариях к каждой операции написать двоичный код каждого числа и результата операции.
//        1.5 Попробуйте сделать побитовую операцию с числом 42.5


public class TaskOne {
    public static void main(String[] args) {
        long a = 42, b = 15;  // в двоичном представлении: 42 - 00101010  | 15 - 00001111
        long test;
        String sep = "-----------------------------------------------------";

//      1.2
//      ~ Побитовый унарный оператор NOT
        System.out.println("\n\ta = 42  |  b = 15\n\n" + sep + "\n ~\t\t| ~42: " + ~a + "  |  ~15: " + ~b + "\n" + sep); //  42 -> -43 - 11010101  |  15 -> -16 - 11110000

//      &	    Побитовый AND
        a = 42; b = 15;                                                  // 42 -   00101010 &
        test = a & b;                                                    // 15 -   00001111
        System.out.println(" &\t\t| 42 & 15: " + test + "\n" + sep);     // 10 -   00001010 - result

//      &=	Побитовый AND с присваиванием
        a = 42; b = 15;
        a &= 159;                        // 10  -  00101010 & 10011111 = 00001010
        b &= 17;                         // 1   -  00001111 & 00010001 = 00000001
        System.out.println(" &=\t\t| 42 &= 159: " + a + "  |  15 &= 17: " + b + "\n" + sep);

//      |	    Побитовый OR
        a = 42; b = 15;                                                  // 42 -   00101010 |
        test = a | b;                                                    // 15 -   00001111
        System.out.println(" |\t\t| 42 | 15: " + test + "\n" + sep);     // 47 -   00101111 - result

//      |=	Побитовый OR с присваиванием
        a |= 159;                        // 191  -  00101010 | 10011111 = 10111111
        b |= 17;                         // 31   -  00001111 | 00010001 = 00011111
        System.out.println(" |=\t\t| 42 |= 159: " + a + "  |  15 |= 17: " + b + "\n" + sep);

//      ^ Побитовый исключающее OR
        a = 42; b = 15;                                                   // 42 -   00101010 ^
        test = a ^ b;                                                     // 15 -   00001111
        System.out.println(" ^\t\t| 42 ^ 15: " + test + "\n" + sep);      // 160 -  00100101 - result

//      ^=	Побитовый исключающее OR с присваиванием
        a ^= 159;                        // 181  -  00101010 | 10011111 = 10110101
        b ^= 17;                         // 30   -  00001111 | 00010001 = 00011110
        System.out.println(" ^=\t\t| 42 ^= 159: " + a + "  |  15 ^= 17: " + b + "\n" + sep);

//      >>	Сдвиг вправо
        a = 42; b = 15;                                                                                   // 42 -> 21  -  00101010 >> 1 = 00010101
        System.out.println(" >>\t\t| 42 >> 1: " + (a >> 1)  + "  |  15 >> 2: " + (b >> 2) + "\n" + sep);  // 15 -> 2   -  00001111 >> 2 = 00000011

//      >>=	Сдвиг вправо с присваиванием
        a = 42; b = 15;
        a >>= 3;                        // 5  -  00101010 >> 3 = 00000101
        b >>= 4;                        // 0  -  00001111 >> 4 = 00000000
        System.out.println(" >>=\t| 42 >>= 3: " + a + "  |  15 >>= 4: " + b + "\n" + sep);

//      >>>	Сдвиг вправо с заполнением нулями
        a = 42; b = 15;                                                                                      // 42 -> 2  -  00101010 >>> 4 = 00000010
        System.out.println(" >>>\t| 42 >>> 4: " + (a >>> 4)  + "  |  15 >>> 3: " + (b >>> 3) + "\n" + sep);  // 15 -> 1  -  00001111 >>> 3 = 00000001

//      >>>=	Сдвиг вправо с заполнением нулями с присваиванием
        a = 42; b = 15;
        a >>>= 1;                        // 21  -  00101010 >>> 1 = 00010101
        b >>>= 1;                        // 7   -  00001111 >>> 1 = 00000111
        System.out.println(" >>>=\t| 42 >>>= 1: " + a + "  |  15 >>>= 1: " + b + "\n" + sep);

//      <<	Сдвиг влево
        a = 42; b = 15;                                                                                   // 42 -> 168  -  00101010 << 2 = 10101000
        System.out.println(" <<\t\t| 42 << 1: " + (a << 2)  + "  |  15 << 2: " + (b << 3) + "\n" + sep);  // 15 -> 120  -  00001111 << 3 = 01111000

//      <<=	Сдвиг влево с присваиванием
        a = 42; b = 15;
        a <<= 4;                        // 672  -  00101010 << 4 = 00000010 10100000
        b <<= 5;                        // 480  -  00001111 << 5 = 00000001 11100000
        System.out.println(" <<=\t| 42 <<= 4: " + a + "  |  15 <<= 5: " + b + "\n" + sep);



//      -------------------------------------------------------------------------------------------------------------------------------------------------------------



//      1.3
        a = -42; b = -15;  // в двоичном представлении: -42 - 11010110  | -15 - 11110001 - это обратный код, к младшему значащему разряду которого прибавлена единица
//                                                                                         такое представление отрицательного числа будет везде в ответах
//      ~ Побитовый унарный оператор NOT
        System.out.println("\n\ta = -42  |  b = -15\n\n" + sep + "\n ~\t\t| ~-42: " + ~a + "  |  ~-15: " + ~b + "\n" + sep); // -42 -> 41 - 00101001  |  -15 -> 14 - 00001110

//      & Побитовый AND
        a = -42; b = -15;                                                  // -42 -   11010110 &
        test = a & b;                                                      // -15 -   11110001
        System.out.println(" &\t\t| -42 & -15: " + test + "\n" + sep);     // -48 -   11010000 - result

//      &=	Побитовый AND с присваиванием
        a = -42; b = -15;
        a &= 159;                        // 150  -  11010110 & 10011111 = 10010110
        b &= 17;                         // 17   -  11110001 & 00010001 = 00010001
        System.out.println(" &=\t\t| -42 &= 159: " + a + "  |  -15 &= 17: " + b + "\n" + sep);

//      |	    Побитовый OR
        a = -42; b = -15;                                                // -42 -   11010110 |
        test = a | b;                                                    // -15 -   11110001
        System.out.println(" |\t\t| -42 | -15: " + test + "\n" + sep);   //  -9 -   11110111 - result

//      |=	Побитовый OR с присваиванием
        a |= 159;                        // -33  -  11010110 | 10011111 = 11011111
        b |= 17;                         // -15  -  11110001 | 00010001 = 11110001
        System.out.println(" |=\t\t| -42 |= 159: " + a + "  |  -15 |= 17: " + b + "\n" + sep);

//      ^ Побитовый исключающее OR
        a = -42; b = -15;                                                 // -42 -  11010110 ^
        test = a ^ b;                                                     // -15 -  11110001
        System.out.println(" ^\t\t| -42 ^ -15: " + test + "\n" + sep);    //  39 -  00100111 - result

//      ^=	Побитовый исключающее OR с присваиванием
        a ^= 159;                        // -183  -  11010110 | 10011111 = 01001001
        b ^= 17;                         // -32   -  11110001 | 00010001 = 11100000
        System.out.println(" ^=\t\t| -42 ^= 159: " + a + "  |  -15 ^= 17: " + b + "\n" + sep);

//      >>	Сдвиг вправо
        a = -42; b = -15;                                                                                   // -42 -> -21  -  11010110 >> 1 = 11101011
        System.out.println(" >>\t\t| -42 >> 1: " + (a >> 1)  + "  |  -15 >> 2: " + (b >> 2) + "\n" + sep);  // -15 -> -4   -  11110001 >> 2 = 11111100

//      >>=	Сдвиг вправо с присваиванием
        a = -42; b = -15;
        a >>= 3;                        // -6  -  11010110 >> 3 = 11111010
        b >>= 4;                        // -1  -  11110001 >> 4 = 11111111
        System.out.println(" >>=\t| -42 >>= 3: " + a + "  |  -15 >>= 4: " + b + "\n" + sep + sep);

//      >>>	Сдвиг вправо с заполнением нулями
        a = -42; b = -15;                                                                                            //  11010110 >>> 4 = 9223372036854775787 - 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11101011
        System.out.println(" >>>\t| -42 >>> 1: " + (a >>> 1)  + "  |  -15 >>> 1: " + (b >>> 1) + "\n" + sep + sep);  //  11110001 >>> 3 = 9223372036854775800 - 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111000

//      >>>=	Сдвиг вправо с заполнением нулями с присваиванием
        a = -42; b = -15;
        a >>>= 4;                        //  11010110 >>> 4 = 1152921504606846973  -  00001111 11111111 11111111 11111111 11111111 11111111 11111111 11111101
        b >>>= 4;                        //  11110001 >>> 4 = 1152921504606846975  -  00001111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(" >>>=\t| -42 >>>= 4: " + a + "  |  -15 >>>= 4: " + b + "\n" + sep);
        a = -42; b = -15;
        a >>>= 8;                        //  11010110 >>> 8 = 72057594037927935  -  00000000 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        b >>>= 8;                        //  11110001 >>> 8 = 72057594037927935  -  00000000 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(" >>>=\t| -42 >>>= 8: " + a + "  |  -15 >>>= 8: " + b + "\n" + sep);
        a = -42; b = -15;
        a >>>= 16;                        //  11010110 >>> 16 = 281474976710655  -   00000000 00000000 11111111 11111111 11111111 11111111 11111111 11111111
        b >>>= 16;                        //  11110001 >>> 16 = 281474976710655  -   00000000 00000000 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(" >>>=\t| -42 >>>= 16: " + a + "  |  -15 >>>= 16: " + b + "\n" + sep);
        a = -42; b = -15;
        a >>>= 32;                        //  11010110 >>> 32 = 4294967295  -  00000000 00000000 00000000 00000000 11111111 11111111 11111111 11111111
        b >>>= 32;                        //  11110001 >>> 32 = 4294967295  -  00000000 00000000 00000000 00000000 11111111 11111111 11111111 11111111
        System.out.println(" >>>=\t| -42 >>>= 32: " + a + "  |  -15 >>>= 32: " + b + "\n" + sep);
        a = -42; b = -15;
        a >>>= 64;                        //  11010110 >>> 64 = -42 - 11010110
        b >>>= 64;                        //  11010110 >>> 64 = -15 - 11010110
        System.out.println(" >>>=\t| -42 >>>= 64: " + a + "  |  -15 >>>= 64: " + b + "\n" + sep);
        a = -42; b = -15;
        a >>>= 65;                        //  11010110 >>> 65 = 9223372036854775787  -  01111111 11111111 11111111 11111111 11111111 11111111 11111111 11101011
        b >>>= 65;                        //  11110001 >>> 65 = 9223372036854775800  -  01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111000
        System.out.println(" >>>=\t| -42 >>>= 65: " + a + "  |  -15 >>>= 65: " + b + "\n" + sep);

//      <<	Сдвиг влево
        a = -42; b = -15;                                                                                   // -42 -> -168  -  11010110 << 2 = 01011000
        System.out.println(" <<\t\t| -42 << 1: " + (a << 2)  + "  |  -15 << 2: " + (b << 3) + "\n" + sep);  // -15 -> -120  -  11110001 << 3 = 10001000

//      <<=	Сдвиг влево с присваиванием
        a = -42; b = -15;
        a <<= 4;                        // -672  -  11010110 << 4 = 11111101 01100000
        b <<= 5;                        // -480  -  11110001 << 5 = 11111110 00100000
        System.out.println(" <<=\t| -42 <<= 4: " + a + "  |  -15 <<= 5: " + b + "\n" + sep);

// ---------------------------------------------------------------------------------------------------------------------------------------------------------
//      1.5
//      Bitwise operators cannot be applied to 'double' !!!!
    }
}
