package com.example.designpattern.声明式编程.响应式编程.观察者模式;

import com.example.designpattern.声明式编程.响应式编程.观察者模式.impl.BinaryObserver;
import com.example.designpattern.声明式编程.响应式编程.观察者模式.impl.HexaObserver;
import com.example.designpattern.声明式编程.响应式编程.观察者模式.impl.OctalObserver;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        //生产者
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        reactive();
    }


    static void reactive() {
        Flux<Integer> stringFlux = Flux.just(15);
        //订阅方式一
        stringFlux.subscribe(val -> {
            log.info("开始消费数据");
            log.info("Binary String: {}", Integer.toBinaryString(val));
        });

    }
}
