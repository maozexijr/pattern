# 设计模式


#### 模式分类

1. 按目的分
- 创建型模式：单例、原型、工厂方法、抽象工厂、建造者
- 结构型模式：代理、适配器、桥接、装饰、外观、享元、组合
- 行为型模式：模板方法、策略、命令、职责链、状态、观察者、中介者、迭代器、访问者、备忘录、解释器

2. 按作用范围分
- 类模式：工厂方法、（类）适配器、模板方法、解释器
- 对象模式：除了以上 4 种


#### 设计原则
1. 开闭原则
- 定义：需求变更时，不修改原代码的前提下，可以拓展模块功能，使其满足新需求
- 方法：接口或抽象类定义稳定抽象层，具体类定义多变实现层
- 优点：提高代码复用性，增强程序可维护性

2. 里氏替换原则

- 定义：子类可以扩展父类的功能，但不能改变父类原有的功能
- 方法：避免重写父类方法
- 优点：减少错误，提高可复用性

3. 依赖倒置原则

- 定义：抽象不依赖实现
- 方法：（1）所有类都尽量提供接口或抽象类
  （2）具体类不派生子类（3）变量声明使用接口或抽象类（4）不重写父类方法
- 优点：降低耦合，提高稳定性，规避风险，提高可读性和可维护性

4. 单一职责原则

- 定义: 一个类只实现一个功能
- 方法：按功能拆分类
- 优点：降低复杂度，提高可读性，增强可维护性，降低变更风险

5. 接口隔离原则

- 定义: 
- 方法：按实现拆分接口，提高方法兼容
- 优点：降低复杂度，提高可读性，增强可维护性，降低变更风险

6. 迪米特法则

- 定义：又名“最小知道原则”，只依赖应该依赖的对象，只暴露应该暴露的方法
- 方法：优先定义终态类，私有化成员变量，降低对其他类的引用，避免使用序列化
- 优点：降低耦合

7. 合成复用原则

- 类复用：继承复用和合成复用，继承复用的缺点是破坏了父类的封装性，增加了耦合性，降低复用的灵活性
- 定义： 
- 方法：已有对象作为新对象的属性
- 优点：维持了稳定性，降低耦合性，提高复用的灵活性
