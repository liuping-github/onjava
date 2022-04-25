package org.onjava.operators;

/**
 * 字面量里的下划线
 * Java 7中有一个十分有用的新增功能：可以在数字字面量里使用下划线，这样更易于阅读。这对在大数值里分组数字特别有帮助：
 */
public class Underscores {
    public static void main(String[] args) {
        double d = 341_435_936.445_667;
        System.out.println(d);
        int bin = 0b0010_1111_1010_1111_1010_1111_1010_1111;
        System.out.println(Integer.toBinaryString(bin));
        System.out.printf("%x%n", bin);               // [1]
        long hex = 0x7f_e9_b7_aa;
        System.out.printf("%x%n", hex);
    }
}
/*
 * 这里有几条合理的规则：
 * 只能使用单个下划线，不能连续使用多个；
 * 数字的开头或结尾不能有下划线；
 * 像F、D或L这样的后缀周围不能有下划线；
 * 在二进制或十六进制标识符b和x的周围不能有下划线。
 * [1] 注意%n的使用。如果你熟悉C风格的语言，可能已经习惯用\n来表示换行符。
 * 问题在于这是一个“UNIX风格”的换行符。
 * 如果你使用的是Windows平台，就必须改为\r\n。这种差异是一个不必要的麻烦，编程语言应该替你处理这个问题。
 * 这就是Java用%n来实现的功能，它会根据程序运行的平台生成合适的换行符，不过这仅会在使用System.out.printf()或System.out.format()时起作用。
 * 对于System.out.println()，你仍然必须使用\n；如果使用了%n，println()只会输出%n而不是将其当作换行符。
 */