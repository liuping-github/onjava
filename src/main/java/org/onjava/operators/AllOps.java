package org.onjava.operators;

/**
 * 操作符小结
 * 下面这个示例展示了哪些基本数据类型能用于哪些特定的操作符。
 * 基本上这是一个不断重复的示例，只是每次使用了不同的基本数据类型。程序能正常编译，因为那些会导致编译失败的行已经用//-注释掉了。
 */
public class AllOps {
    // 对每个基本数据类型都测试一遍所有操作符
    // 以此显示哪些能被Java编译器所接受
    // boolean类型测试
    void f(boolean b) {
    }

    void boolTest(boolean x, boolean y) {
        // 算术操作符：
        //- x = x * y;
        //- x = x / y;
        //- x = x % y;
        //- x = x + y;
        //- x = x - y;
        //- x++;
        //- x--;
        //- x = +y;
        //- x = -y;
        // 关系操作符和逻辑操作符：
        //- f(x > y);
        //- f(x >= y);
        //- f(x < y);
        //- f(x <= y);
        f(x == y);
        f(x != y);
        f(!y);
        x = x && y;
        x = x || y;
        // 按位操作符：
        //- x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        //- x = x << 1;
        //- x = x >> 1;
        //- x = x >>> 1;
        // 复合赋值：
        //- x += y;
        //- x -= y;
        //- x *= y;
        //- x /= y;
        //- x %= y;
        //- x <<= 1;
        //- x >>= 1;
        //- x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- char c = (char)x;
        //- byte b = (byte)x;
        //- short s = (short)x;
        //- int i = (int)x;
        //- long l = (long)x;
        //- float f = (float)x;
        //- double d = (double)x;
    }

    void charTest(char x, char y) {
        // 算术操作符：
        x = (char) (x * y);
        x = (char) (x / y);
        x = (char) (x % y);
        x = (char) (x + y);
        x = (char) (x - y);
        x++;
        x--;
        x = (char) +y;
        x = (char) -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        x = (char) ~y;
        x = (char) (x & y);
        x = (char) (x | y);
        x = (char) (x ^ y);
        x = (char) (x << 1);
        x = (char) (x >> 1);
        x = (char) (x >>> 1);
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        byte b = (byte) x;
        short s = (short) x;
        int i = x;
        long l = x;
        float f = x;
        double d = x;
    }

    void byteTest(byte x, byte y) {
        // 算术操作符：
        x = (byte) (x * y);
        x = (byte) (x / y);
        x = (byte) (x % y);
        x = (byte) (x + y);
        x = (byte) (x - y);
        x++;
        x--;
        x = (byte) +y;
        x = (byte) -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        x = (byte) ~y;
        x = (byte) (x & y);
        x = (byte) (x | y);
        x = (byte) (x ^ y);
        x = (byte) (x << 1);
        x = (byte) (x >> 1);
        x = (byte) (x >>> 1);
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        short s = x;
        int i = x;
        long l = x;
        float f = x;
        double d = x;
    }

    void shortTest(short x, short y) {
        // 算术操作符：
        x = (short) (x * y);
        x = (short) (x / y);
        x = (short) (x % y);
        x = (short) (x + y);
        x = (short) (x - y);
        x++;
        x--;
        x = (short) +y;
        x = (short) -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        x = (short) ~y;
        x = (short) (x & y);
        x = (short) (x | y);
        x = (short) (x ^ y);
        x = (short) (x << 1);
        x = (short) (x >> 1);
        x = (short) (x >>> 1);
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        int i = x;
        long l = x;
        float f = x;
        double d = x;
    }

    void intTest(int x, int y) {
        // 算术操作符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        short s = (short) x;
        long l = x;
        float f = (float) x;
        double d = x;
    }

    void longTest(long x, long y) {
        // 算术操作符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系操作符与逻辑运算符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        x = ~y;
        x = x & y;
        x = x | y;
        x = x ^ y;
        x = x << 1;
        x = x >> 1;
        x = x >>> 1;
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x ^= y;
        x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        float f = (float) x;
        double d = (double) x;
    }

    void floatTest(float x, float y) {
        // 算术操作符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        //- x = ~y;
        //- x = x & y;
        //- x = x | y;
        //- x = x ^ y;
        //- x = x << 1;
        //- x = x >> 1;
        //- x = x >>> 1;
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //- x <<= 1;
        //- x >>= 1;
        //- x >>>= 1;
        //- x &= y;
        //- x ^= y;
        //- x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        double d = x;
    }

    void doubleTest(double x, double y) {
        // 算术操作符：
        x = x * y;
        x = x / y;
        x = x % y;
        x = x + y;
        x = x - y;
        x++;
        x--;
        x = +y;
        x = -y;
        // 关系操作符与逻辑操作符：
        f(x > y);
        f(x >= y);
        f(x < y);
        f(x <= y);
        f(x == y);
        f(x != y);
        //- f(!x);
        //- f(x && y);
        //- f(x || y);
        // 按位操作符：
        //- x = ~y;
        //- x = x & y;
        //- x = x | y;
        //- x = x ^ y;
        //- x = x << 1;
        //- x = x >> 1;
        //- x = x >>> 1;
        // 复合赋值：
        x += y;
        x -= y;
        x *= y;
        x /= y;
        x %= y;
        //- x <<= 1;
        //- x >>= 1;
        //- x >>>= 1;
        //- x &= y;
        //- x ^= y;
        //- x |= y;
        // 类型转换：
        //- boolean bl = (boolean)x;
        char c = (char) x;
        byte b = (byte) x;
        short s = (short) x;
        int i = (int) x;
        long l = (long) x;
        float f = (float) x;
    }
}
/*
注意boolean类型是有限制的。我们只能赋予它true和false值，并测试它是真还是假，但不能将boolean值相加，或对boolean值执行其他任何运算。
 */