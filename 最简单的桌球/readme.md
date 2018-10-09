## Java学习总结

>其实呢，我是在大一暑假的时候听过开始学了点Java，看的是传智播客的视频，那时候
安卓开发相当火，2015的时候，后来学了点基础，没空继续深入学，也就搁置了，所以一
个工具要经常用太能很熟练，应了那句"熟能生巧"。


### 前言

#### 现在Python这么火，为什么还要学Java呢？

1.Java所拥有的生态太庞大了，是不可能短时间内被其他语言所替代的。
2.Java作为后端语言高并发、安全性、跨平台等都是相当好的。
3.Java现在还是编程语言的第一名。
4.Java是真正的面向对象，并没有面向过程部分，学习Java，更有利于培养面向对象的
思想。

#### 什么是JDK、JRE、JVM？他们之间又有什么联系？

JDK : Java Development ToolKit(Java开发工具包)。JDK是整个JAVA的核心，
包括了Java运行环境（Java Runtime Envirnment），一堆Java工具（javac/
java/jdb等）和Java基础的类库（即Java API 包括rt.jar）。

JDK有以下三种版本：
- J2SE，standard edition，标准版，是我们通常用的一个版本.
- J2EE，enterpsise edtion，企业版，使用这种JDK开发J2EE应用程序.
- J2ME，micro edtion，主要用于移动设备、嵌入式设备上的java应用程序。


JRE:Java  Runtime  Enviromental(java运行时环境)。也就是我们说的JAVA
平台，所有的Java程序都要在JRE下才能运行。包括JVM和JAVA核心类库和支持文件。
与JDK相比，它不包含开发工具——编译器、调试器和其它工具。

JVM：Java Virtual Mechinal(JAVA虚拟机)。JVM是JRE的一部分，它是一个虚
构出来的计算机，是通过在实际的计算机上仿真模拟各种计算机功能来实现的。JVM有
自己完善的硬件架构，如处理器、堆栈、寄存器等，还具有相应的指令系统。JVM 的主
要工作是解释自己的指令集（即字节码）并映射到本地的 CPU 的指令集或 OS 的系统
调用。

JDK,JRE,JVM三者间的关系：

![](https://ws1.sinaimg.cn/mw690/005Pf0eLgy1fupdwp2bg1g30hy0b0752.gif)

### 基础

#### 变量

1.局部变量
>方法或者语句块内部定义的变量。生命周期是从声明位置开始到方法或者语句块执行完毕
为止。
__
注意点：

局部变量要声明并赋值，否则会报错Error:(19, 28) java: 可能尚未初始化变量age；

2.成员变量
>也叫实例变量，方法外部、类内部定义的变量。属于对象，生命周期伴随对象始终。

注意点：

成员变量,无需初始化赋值，直接声明即可。

3.静态变量
>使用static定义，从属类，生命周期伴随类始终，从类加载到卸载。

```java
public class TestComment {
    //成员变量
    int a;
    //这是一个单行注释
    /**
     * 这是多行注释
     *
     * */
    {
        //局部变量
        int age = 12;
    }
    public static void main(String[] args){
        //局部变量
        int age = 23;
        System.out.println(age);
    }

}
```

#### 常量
>不可更改的叫常量

符号常量

final Name = "Zenquan";