##  hello world
编写hello.java,使用javac hello.java 生成 class 虚拟机能认识的java文件
```java
// hello.java
class Demo 
{
	public static void main(String[] args){
		System.out.printLn("hello world");
	}
}
```

```bash
javac hello.java // 编译器做的事
java Demo // 虚拟机做的事

```
`printLn` 和 `print` 前者会多一空行

`classpath` 执行其他路径下的 `class` 文件,任意目录下执行 `class` 文件,虚拟会找 `classpath`,如果 set 的时候 `classpath=【】；` 有分号，则先找 `classpath` 没找到，找当前目录;无分号，找不到或报错
```bash
set classpath=【文件路径】；
java Demo
```
## exercise 
### demo1
默认int 两个int变量相加 默认会转换 最大值2的32次方减1
### demo2 
两个byte类型变量相加可能会损失精度 -128~127之间
### demo3
算术运算 
```java
 int x = 6370;
        x = x /1000 * 1000;
        System.out.println(x); // 6000
```
### demo4
赋值动作会默认强制转换
```java
class Operate {
    public static void main(String[] args){
        short x = 3;
        //x += 4; //7   先计算 底层会默认计算,相当于 x = (short)(x + 4); // 强制转换
        x = x + 4; //  x是不确定变量 报错
        System.out.println(x);
    }
}

```
### demo5 逻辑运算符

#### 逻辑运算
- &：且(两边都运算)
- &&： (左边为假，右边不运算)，结果都一样
- |：或
- ||：(左边为真，右边不运算)，结果都一样
- ^: 异或（符号两边结果一样为false）
-  !:非

### 位运算
指的是二进制

![http://images.liuweibo.cn/image/common/位运算_1551796590440_144822_1551796717082.png](http://images.liuweibo.cn/image/common/位运算_1551796590440_144822_1551796717082.png)

左移
3 << 2 =12 相当于 3 * 2（2） = 12；

![http://images.liuweibo.cn/image/common/左右移_1551797265128_297511_1551797272435.png](http://images.liuweibo.cn/image/common/左右移_1551797265128_297511_1551797272435.png)

## array
### demo1
数组格式 遍历 找出最大值
### demo2 
数组排序 选择排序
### demo3 demo4
数组应用 进制转换
[![http://images.liuweibo.cn/image/common/array进制计算_1552638384346_29449_1552889597183.png](http://images.liuweibo.cn/image/common/array进制计算_1552638384346_29449_1552889597183.png)](![http://images.liuweibo.cn/image/common/array进制计算_1552638384346_29449_1552889597183.png](http://images.liuweibo.cn/image/common/array进制计算_1552638384346_29449_1552889597183.png))

## faceObject
面向对象
### demo1
面向对象
### demo2
引用数据类型参数引用 会改变原来
### demo3
封装 private
### demo4
构造函数
### demo5
static 外部也可以访问 不在栈和堆存储，在方法区存储，也叫对象方法共享数据. 静态方法只能访问静态成员
### demo6
主函数
```java
/**
 * public:因为权限必须是最大的
 * static:不需要对象的，直接用珠海市所属类名调用即可
 * main:函数名，还是关键字，只是一个jvm识别的固定的名字
 * string[] args:这是主函数的参数列表，而且元素都是字符串类型 运行的时候可以
 * 带上参数 如：java MainDemo haha lili 
 */
class MainDemo {
    public static void main(String[] args){ // new String[0]
        System.out.println(args); // [Ljava.lang.String;@15db9742
        // System.out.println(args[0]);
        // System.out.println(args);

    }
}
```
### demo7
- 静态代码块。作用：用于给类初始化
- 构造代码块。可以给所有对象初始化
### demo8
静态基本使用 工具类的提出，privite私有的使用，文档注释javadoc
### demo9
设计模式 单例
```java
class Single{// 类一加载，对象就已经存在了
    private static Single s = new Single();
    private Single(){};
    public static Single getInstance(){
        return s;
    }
}
class Single2{// 类加载进来，没有对象，只有调用了getInstance方法，才会创建对象
                // 延迟加载形式 懒汉式
    private static Single s = null;
    private Single(){};
    public static Single getInstance(){
        if(s == null){
            return s =  new Single2();
        }
        return s;
    }
}
class SingleDemo{
    public static void main(String[] args){
        Single ss = Single.getInstance();
    }
}
```

### demo10
基本继承 单继承 多继承
### demo11
- this代表本类
- super代表父类
- 相同变量或者方法，子类权限必须大于等于父类权限，才会覆盖父类方法
- 静态子涵覆盖静态，或被静态覆盖
- 继承 // super() // 默认调用父类 super()

### demo12
final关键字
- 继承弊端：因为会覆盖，打破封装性
- final 是一个修饰符，可以修饰类，方法，变量
- final 修饰的方法不可以被覆盖
- final 修饰的变量是一个常量，只能赋值一次

### demo13
抽象类 例子

### demo14
接口 interface
- 接口的成员都是公共的权限。
- 修饰符可以省略，interface权限会自动加上去，但是不建议，阅读性不强

### demo15
实现 implements


### demo16
多实现
- java多继承记性了改良，变为了多实现

### demo17
实现继承的例子

### demo18
多态：类型转换 转型

### demo19
多态：类型转换 转型

 * 1.成员变量
 *    编译时：参考引用类型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
 *    运行时：参考引用类型变量所属的类中的是否有调用的成员变量，并运行该所属类中的成员变量。
 *    简单说：编译和运行都参考等号的左边
 * 2.成员函数
 *    编译时：参考引用类型变量所属的类中的是否有调用的成员变量，有，编译通过，没有，编译失败。
 *    运行时：参考的是对象所属的类中是否有调用的函数
 *    简单说：编译看等号的左边，运行看右边
 * 
 * 3.静态函数
 *    编译时：参考引用类型变量所属的类中的是否有调用的静态方法
 *    运行时：参考引用类型变量所属的类中的是否有调用的静态方法
 *    简单说：编译和运行都参考等号的右边
 * 
 *    其实对于静态方法，是不需要对象的，直接调用类名即可。

### demo20
内部类：生成Outer$Inner.class
### demo21
内部类：
- 直接访问外部类中的内部类中的成员  
- 如果内部类是静态的 相当于外部的
### demo22
- 面向对象(Object类-equals方法覆盖)
- 03-面向对象(Object类-hashCode方法)
- 04-面向对象(Object类-getClass方法)
- 05-面向对象(Object类-toString方法)
## error
### demo1
异常处理
[java文档](http://www.matools.com/api/java8)
### demo2
自定义异常，要么继承Exception,要么继承RuntimeException
### demo3
异常处理的捕捉形式 try{}catch(){}finally{}
### demo4
异常例子
## function
函数的重载
1. 同一个类
2. 同名
3. 参数个数不同 or 参数类型不同
## ticket
多线程买票实例
### demo1
单线程实例
### demo2
单线程实例=》多线程
- 创建多线程的第一种方式，继承Thread类
### demo3
- 创建多线程的第二中方式：实现Runnable接口
 * 1.定义类实现Runnable接口
 * 2.覆盖接口的run方法
 * 3.通过THread类创建线程对象，并传递参数
 * 4.通过start开启线程
 ### demo4
 多线程安全问题demo
 - 产生原因一个线程没结束，另外一个进行了运算
 -解决办法使用同步
  * 弊端：相对降低了效率，因为同步外的线程都会判断同步锁
  * 前提：必须右多个线程并使用同一个锁

### demo5
线程安全例子示例
- 同步函数的锁是this
- 同步代码块的锁是任意的对象
## 包 package
### demo1
包的基础使用
## thread 多线程通信
多线程详细看 ticket 卖票示例
### demo1
多线程通信示例
### demo2 多线程示例生产者消费者
多线程示例生产者消费者
 * 多生产者，多消费者的问题
 * if判断标记，只有一次，会导致不该运行的线程运行，出现了错误的情况
 * while判断标记，解决了线程执行权后，是否要运行
 * 
 * notify:只能唤醒一个线程，如果只唤醒了本方就没有意义，而且while判断标记+notify会导致死锁。
 * notifyAll:本线程一定会唤醒对方线程

dk1.5以后
 * await();
 * signal();
 * signalAll();
 
线程停止方式

1. 控制循环结束标记
2. 可以使用interrupt()方法将线程从冻结强制恢复到运行状态

## String
### StringBuffer
特点

- 长度是可变的
- 可以存储不同类型的数据
- 最终要变成字符串进行处理
- 可以对字符串进行修改

### StringBuilder
和 StringBuffer 是一样的,不过 StringBuffer 是同步的，更安全。
StringBuilder的StringBuilder不能安全使用多线程。 如果需要同步， 那么建议使用StringBuffer 。
### java.long

- String()
- String(byte[] bytes)
- String(byte[] bytes, int offset, int length)
- String(char[] value)

### demo1 按照字典排序
练习 按照字典排序
### demo2 一个字符串在整数中出现的次数
练习

## 基本包装类型

- Byte
- Short
- Integer
- Long
- Float
- Double
- Character
- Boolean

### 之间的转化
基本类型=》字符串

1. 基本类型+ """
2. 用String类中的静态方法valueOf(基本类型数值)

字符串=》基本类型

1. 使用 xxx parseXxx ("xxx类型的字符串);
2. 使用intValue()将一个Integer对象转为基本类型

```java
int parseInt("123");
long parseLong
boolean parseBoolean
//只有Character没有parse方法

```

进制转换

- toBinaryString(int i)
- toHexString(int i)
- toOctalString(int i)
- toString(int i, int radix)
- parseInt(String s, int radix) // 其他进制转为十进制

## 自动装箱
### demo1 演示自动装箱

## map
集合特点

- 用于存储对象到容器
- 集合的长度是可变的
- 集合中不可以存储基本数据类型

collection的常见方法

- 添加
    - boolean add(object obj)
    - boolean addAll(Collection coll)
- 删除
    - boolean remove(object obj)
    - boolean removeAll(Collection coll)
    - void clear();
- 判断
    - boolean contains(object obj)
    - boolean containsAll(Collection coll)
    - boolean isEmpty()
- 获取
    - int size() 获取元素个数
    - Iterator iterator() 迭代器
- 其他
    - boolean	retainAll(Collection<?> c) 取交集
    - Object[]	toArray() 将集合转化为数组
    
- Collection
    - List 有序，存入和取出的顺序一致，元素都有索引，元素可以重复
    - Set 无序，元素不能重复
        - `HashSet`:内部数据结构是哈希表，是不同步的，方法和Collection一样，只有Iterator迭代器
            - linkedHashSet: 有序的
        - `TreeSet`:可以对set集合中的元素进行排序，是不同步的
            判断元素惟一的方式就是根据比较方法的返回值是否是0，是0就是相同元素，不存
            让元素自身具备比较功能，元素就需要实现`comparable`接口，覆盖`compareTo`方法
            如果不按照自然排序，可以使用`TreeSet`集合第二种排序，让集合自身具备功能，
            定义一个实现`Comparator`接口，覆盖`compare`方法。
            将该类对象作为参数传递给`TreeSet`集合的构造函数
    
### demo1 Collection集合演示1
- 
### demo2 List 演示
- 添加
    - void add(index,element)
    - void add(index,collection)
- 删除
    - Object remove(index)
- 修改
    - Object set(index,element)
- 获取
    - Object get(index)
    - int indexOf(Object)
    - lastIndex(Object)
    
List集合是可以完成对元素的增删改查

- Vector 内部是数组数据结构，是同步的，增删查询都很慢！
- ArrayList 内部是素组的数据结构，是不同步的，替代了Vector。查询的速度快
- LinkedList 内部是链表结构，是不同步的，增删很快，查询慢

### demo3 演示Iterator 和 ListIterator<E>
- iterate遍历的同时不能add，用ListIterator<E>代替
### demo4 演示Vector 
- Vector jdk1.0 之后被Iterator替代

### demo5 演示LinkedList
- addFirst
- addLast jdk1.6
- offsetFirst
- offsetLast

- getFirst  // 获取但不移除，如果为空，报出异常NoSuchElementException
- getLast jdk1.6
- peekFirst // 获取但不移除，如果为空，返回null
- peekLast

- removeFirst
- isEmpty
### demo6 演示ArrayList
- 提升的Object要转为Persion对象
### demo7 演示TreeSet
- 字符串比较是按照字典比较的
- 复写`java.lang.Comparable`的`compareTo`方法， 字典比较字符串
### demo8 演示TreeSet集合第二种排序，让集合自身具备功能
- 构造一个新的，空的树集，根据指定的比较器进行排序。

## 泛型
jdk 1.5出现的安全机制

1. 将运行时期的问题ClassCastException赚到了编译时期
2. 避免了强制转换的麻烦

在程序中，只要用到了带有<>的类或者借口，就要明确传入的具体引用数据类型

- 上线 `？extends E:` 接收 `E` 类型或者E的子类型对象。
- 下线 `？super E:` 接收 `E` 类型或者 `E` 的父类型

## io
输入输出
1. FileWriter
2. FileReader

Map

- Hashtable
    - Properties 特点，键和值都是字符串，可以保存在流中，或者从流获取
     
### demo1 输出一个txt文件
- new FileWriter(String fileName, boolean append) //布尔值的文件名，表示是否附加写入的数据。
- write
- flush
- close 
- system.getProperty('line.separator'); 获得系统的换行符
- 异常 throws IOException或者 try catch finally

### demo2 读取一个txt文件

- FileReader
- read() 可以读字符也可以读数组

## net
### demo1 InetAddress
- InetAddress
- getHostAddress
- getHostName
- UnknownHostException

### demo2 udp 发送接收
- DatagramSocket;
- DatagramPacket;
- InetAddress;
- UnknownHostException;
- IOException;

### demo3 udp 聊天室

- DatagramSocket;
- DatagramPacket;
- InetAddress;
- BufferedReader;
- InputStreamReader;

### demo4 tcp 聊天

- Socket;
- ServerSocket;
- UnknownHostException;
- OutputStream;
- IOException;
- InputStream;

### demo5 tcp 转换字母

## example 例子
### demo1 字符串数组排序
- StringBuilder
- append
- toString
- parseInt
- split

### demo2 计算字符串中每个字符出现的次数
计算字符串中每个字符出现的次数 返回 a(2)b(3)...

- Iterator
- TreeMap
- toCharArray
- StringBuilder

### demo3  实现星期的对应关系 输入星期一 显示mon

- hashMap

### demo4 复制一个文件

- FileReader
- FileWriter

### demo5 复制一个文件2

- FileReader
- FileWriter

### demo6 流复制一个文件

- FileReader
- FileWriter
- BufferedReader
- BufferedWriter

### demo7 字节复制文件媒体

- FileInputStream;
- BufferedInputStream;
- FileOutputStream;
- BufferedOutputStream;
- IOException;
- available 返回从此输入流中可以读取文件大小字节数

### demo8 键盘输入输出

- BufferedReader;
- BufferedWriter;
- InputStreamReader;
- OutputStreamWriter;
- IOException;
- System.in
- System.out

### demo9 对指定目录进行进行深度遍历，并列出

- File
    - isDirectory
    - getAbsolutePath
- StringBuilder

### demo10  操作配置文件
定义功能：获取一个应用程序运行的次数，如果超过5次，给出提示，不让运行程序

- File
- FileInputStream
- FileOutputStream
- Properties
    - load
    - getProperty
    - store

### demo11 获取指定目录下，指定扩展名的文件，并写入txt
获取指定目录下，指定扩展名的文件（包含子目录中的）
这些文件的绝对路径写入到一个文本文件中

- File
- FilenameFilter
- BufferedWriter

### demo12 分割文件 合并文件

- FileInputStream;
- FileOutputStream;
- IOException;
- File;
- SequenceInputStream;
- Collection;
- Collections;
- ArrayList;
- Enumeration;

### demo13 tcp 上传文件