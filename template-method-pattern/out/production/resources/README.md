# 模板方法模式
## 定义
**模板方法模式** 在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以在不改变算法结构的情况下
重新定义算法中的某些步骤

这个模式是用来创建一个算法的模板。什么是模板？模板就是一个方法。更具体地说，这个方法将算法定义成一组步骤；

## 认识钩子
**钩子**是一种声明在抽象类中的方法，但只有空的或者默认的实现。钩子的存在，可以让子类有能力对算法的不同点进行挂钩。
要不要挂钩，由子类自行决定。
