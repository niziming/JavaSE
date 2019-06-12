# 第2章 基本程序设计
## 2-1 计算圆的面积
ComputeArea

## 2.3 从控制台读取输入
### 2-2 键盘读取计算
从键盘读入一个数值，并且将该数值赋给radius。程序清单2-2 重写程序清单2-1 , 提示用户输入一个半径.
语法new Scanner (System.in)表明创建了一个Scanner 类型的对象。可以调用nextDoubleO 方法来读取一个double值
``` java
Scanner input = new Scanner(System.in);
double radius = input.nextDouble();
```
WelcomeWithThreeMessage

### 计算平均值
读取三个数值，然后显示它们的平均值.
ComputeAverage

## 2.4 标识符
标识符必须遵从以下规则
- 标识符是由字母、数字、下划线（-) 和美元符号（$) 构成的字符序列。
- 标识符必须以字母、下划线（_)或美元符号（$) 开头，不能以数字开头。
- 标识符不能是保留字（参见附录A 中的保留字列表)。
- 标识符不能是true、false 或null。
- 标识符可以为任意长度。
例如，$2、ComputeArea、area、radius 和print 都是合法的标识符，而2A 和d+4 都是
非法的，因为它们不符合标识符的命名规则。Java 编译器会检测出非法标识符，并且报语法
错误。

## 2.5 变量

变量用于表示特定类型的数据。为了使用变量，可以通过告诉编译器变量的名字及其可
以存储的数据类型来声明该变量, 变量声明告知编译器根据数据类型为变量分配合适的内存
空间。声明变量的语法如下：
datatype variableName;

例如: `int a;` , `double radius;` , ` double interestRate;` , `int i = 1, j = 2;` , `int count;count = 1;`

## 2.6 赋值语句和赋值表达式

i = j = k = 1;
等价于
k = 1;
j = k;
i = j;

## 2.7 命名常量
例如 2.3的WelcomeWithThreeMessage中的PI的值
~~~ java
//PI的值
final double PI = 3.1415926;
~~~

## 2.8 命名习惯
变量、常量、方法和类的命名
- 使用小写字母命名变量和方法。如果一个名字包含多个单词，就将它们连在一起，第一个单词的字母小写，而后面的每个单词的首字母大写，例如，变量radius 和 area 以及方法print。
- 类名中的每个单词的首字母大写，例如，类名ComputeArea 和System。
- 大写常量中的所有字母，两个单词间用下划线连接，例如，常童PI 和常量MAX_VALUE.
严格遵循Java 的命名习惯是非常重要的，这样可以让你的程序易于理解。

## 2.9 数值数据类型和操作
要点提示：Java 针对整数和浮点数有六种数值类型，以及+ - * / 和 %(余) 等操作符。
### 2.9.1 数值类型
| 类型  | 范围 | 存储大小 |
| ----- | ---- | -------- |
| byte  |      |8 位带符号数|
| short |      |16 位带符号数|
| int   |      |32 位带符号败|
| long  |      |64 位带符号数|
| float |      |32 位，标准IEEE 754|
| double|      |64 位，标准IEEE 754|

### 2.9.2 从键盘读取数值

表2-2 Scanner 对象的方法
方法                  描述
nextByte()      读取一个byte 类型的整数
nextShort()     读取一个short 类型的整数
nextInt()       读取一个int 类型的整数
nextLong()      读取一个long 类型的整数
nextFloat()     读取一个float 类铟的数
nextDouble()    读取一个double 类型的数

### 2.9.3 数值操作符
Java 针对整数和浮点数有六种数值类型，以及+ - * / 和 %(余) 等操作符。

### 2.9.4 幂运算
使用方法Math.pow(a,b)来计算a的b平方
System.out.println(Math.pow(2 , 3));
结果为8;

## 2 .10 数值型直接量
一个直接量（literal) 是一个程序中直接出现的常量值。

例如，下面的语句中34 和0.30S 都是直接量：
int numberOfYears = 34;
double weight = 0.30S;

### 2.10.1 整型直接量
- 十进制整数直接量,用整型直接表示。
- 二进制整数直接量，使用0b 或者0B ( 零B) 开头；
- 八进制整数直接量，就用0 ( 零）开头，
- 十六进制整数直接量，就用0x 或0X ( 零x) 开头。

例如:
System.out.println(0Bllll); // Displays 15
System.out,print1n(07777); // Displays 4095
System.out.println(0XFFFF); // Displays 65535

### 2.10.2 浮点型直接量

浮点型直接量带小数点，默认情况下是double 型的。例如：5.0 被认为是double 型而
不是float 型。可以通过在数字后面加字母f 或F 表示该数为float 型直接量，也可以在数
字后面加d 或D 表示该数为double 型直接量。
例如：
- 可以使用100.2f 或100.2F 表示float 型值，
- 用100.2d 或100.2D 表示double 型值。

### 2.10.3 科学记数法

浮点型直接量也可以用a x 10的b次方 形式的科学记数法表示，例如，123.456 的科学记数法
形式是1.23456 x l0的2次方, 0.012 345 6 的科学记数法是1.23456 x 10的—2次方.一种特定的语法可以用
于表示科学记数法的数值。例如，1.23456 X 10的2次方可以写成1.234SSE2 或者l.234SeE+2，而
1.23456 xl0的-2次方 等于1.23456E-2。E (或e) 表示指数，既可以是大写的也可以是小写的。

为了提高可读性，Java 允许在数值直接量的两个数字间使用下划线。例如，下面的
直接量是正确的：

~~~ java
long ssn = 232_45_4519;
long creditCardNumber = 2324_4545_4519_3415L;
		
System.out.println(ssn);
System.out.println(creditCardNumber);
~~~
