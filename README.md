# hello world
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


## function
函数的重载
1. 同一个类
2. 同名
3. 参数个数不同 or 参数类型不同
## ticket
多线程买票实例