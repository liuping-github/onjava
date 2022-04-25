package org.onjava.operators;

import java.util.Random;

/**
 * @discussion 算术操作符
 * Java的基本算术操作符与其他大多数编程语言相同，包括加法（+）、减法（-）、除法（/）、乘法（*） 和取模（%，它从除法中产生余数）。
 * 整数除法的结果会舍弃小数位，而非四舍五入。
 * Java还使用一种来自C和C++的快捷运算符，可以同时进行运算和赋值操作。
 * 这种快捷运算符通过在操作符后紧跟一个等号来表示，它对Java中的所有操作符都适用，只要合情合理就可以。
 * 比如，把x加4，然后将结果赋回给x，可以这么写：x += 4。
 */
public class MathOps {
    public static void main(String[] args) {
        // 创建一个种子随机数生成器
        Random rand = new Random(47);
        int i, j, k;
        // 从1~100的范围中选择：
        j = rand.nextInt(100) + 1;
        System.out.println("j : " + j);
        k = rand.nextInt(100) + 1;
        System.out.println("k : " + k);
        i = j + k;
        System.out.println("j + k : " + i);
        i = j - k;
        System.out.println("j - k : " + i);
        i = k / j;
        System.out.println("k / j : " + i);
        i = k * j;
        System.out.println("k * j : " + i);
        i = k % j;
        System.out.println("k % j : " + i);
        j %= k;
        System.out.println("j %= k : " + j);
        // 单精度浮点数（float）测试：
        float u, v, w; // 同样适用于双精度浮点数（double）
        v = rand.nextFloat();
        System.out.println("v : " + v);
        w = rand.nextFloat();
        System.out.println("w : " + w);
        u = v + w;
        System.out.println("v + w : " + u);
        u = v - w;
        System.out.println("v - w : " + u);
        u = v * w;
        System.out.println("v * w : " + u);
        u = v / w;
        System.out.println("v / w : " + u);
        // 以下对char、byte、short、int、long和double都适用
        u += v;
        System.out.println("u += v : " + u);
        u -= v;
        System.out.println("u -= v : " + u);
        u *= v;
        System.out.println("u *= v : " + u);
        u /= v;
        System.out.println("u /= v : " + u);
        //一元加操作符和一元减操作符
        //一元减（-）和一元加（+）与二元加减法使用的是相同的符号。编译器会根据表达式的书写形式自动判断出使用的是哪一种。以下列语句为例：
        int x = 5, a = 2 , b = 3;
        x = -a;
        //它的含义很明显。编译器能正确识别下面的语句：
        x = a * -b;
        //但读者可能会被搞糊涂，所以应该更明确地写成：
        x = a * (-b);
        //一元减号会反转数据的符号。一元加号和一元减号相对应，它唯一的作用就是将较小类型的操作数提升为int类型。
    }
    //为了生成随机数，上面的程序首先创建了一个Random对象。
    // 如果创建时没有传递任何参数，Java会使用当前时间作为随机数生成器的种子，这样就能在程序每次执行时产生不同的输出。
    // 但是，让本书每个示例的末尾输出尽可能保持一致很重要，因为这样就可以用外部工具来验证这些示例的输出了。
    // 通过在创建Random对象时提供种子（用作随机数生成器的初始值，随机数生成器对于特定的种子值总是产生相同的序列），
    // 可以在每次执行程序时都生成相同的随机数，这样输出就是可验证的。2如果想要生成更多不同的输出，可以移除本书示例里的种子。
    //通过调用Random对象的nextInt()方法和nextFloat()方法，程序可以生成许多不同类型的随机数。
    // 还可以调用nextLong()或者nextDouble()。
    // nextInt()方法的参数设置了所生成随机数的上限，其下限为0，这并不是我们想要的，因为这会产生除以0的可能性，因此我们对生成结果做了加1操作。
}
