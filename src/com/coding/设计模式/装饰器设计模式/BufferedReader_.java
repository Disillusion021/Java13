package com.coding.设计模式.装饰器设计模式;

// 装饰器模式: 通过组合的方式实现多态, 除了可以调用各种实现类本身的功能, 还可以对原功能进行扩展
// 最关键的在于, reader_的类型是抽象的, 可以自由装入任意实现或继承了Reader_的实现类, 从而实现不同的功能
public class BufferedReader_ extends Reader_{

    public static void main(String[] args) {
        new BufferedReader_(new FileReader_()).read();
        new BufferedReader_(new StringReader_()).read();
        new BufferedReader_(new FileReader_()).multiRead(5);
        new BufferedReader_(new StringReader_()).multiRead(5);
    }

    // 组合的方式，将Reader_对象传入
    private Reader_ reader_;

    public BufferedReader_(Reader_ reader_){
        this.reader_ = reader_;
    }

    // 根据reader_对象的不同，实现不同的read()方法
    @Override
    public void read() {
        reader_.read();
    }

    // 增强功能
    // 对Reader_对象的read()方法进行扩展,实现多次读取
    public void multiRead (int num){
        while (num-- > 0){
            reader_.read();
        }
    }
}