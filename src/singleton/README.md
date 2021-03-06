# 单例模式

### 概念

单例即单一实例，一个类有且只有一个类对象的情况

### 思路

1. 无法新建 → 私有构造方法

2. 无法修改 → 私有终态实例对象

3. 可以调用 → 公开获取该类对象的方法

### 问题

何时初始化这个单一实例？

1. 什么时候用什么时候新建 → 懒汉
2. 不管三七二十一，类加载时就新建 → 饿汉

### 拓展

对多线程的支持
1. volatile 关键字修饰实例对象
2. synchronized 关键字修饰公开获取该类对象的方法