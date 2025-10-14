package Homework14

import java.util.concurrent.atomic.AtomicInteger

/*
Task 1
Вам нужно создать класс Counter, который будет иметь метод increment и метод decrement.
Эти методы должны увеличивать и уменьшать значение переменной count в многопоточном режиме.
Для синхронизации доступов используйте внешний объект (не объект класса).
 */

fun main() {
    val lock = Any()
    val counter = Counter(lock)

    val threadFist = Thread {
        repeat(1000) { counter.increment() }
    }
    val threadSecon = Thread {
        repeat(1000) { counter.decrement() }
    }

    threadFist.start()
    threadSecon.start()
    threadFist.join()
    threadSecon.join()

    println("result counter: ${counter.count}")
    atomOftasks()
    secondOfflow()
}

class Counter(private val lock: Any) {
    var count = 0

    fun increment() {
        synchronized(lock) {
            count++
        }
    }

    fun decrement() {
        synchronized(lock) {
            count--
        }
    }
}

/*
Task 2
Напишите программу, в которой два потока одновременно увеличивают счетчик.
Вместо синхронизации используйте класс AtomicInteger, чтобы избежать блокировок.
 */

fun atomOftasks() {
    val count = AtomicInteger(0)

    val thread1 = Thread {
        repeat(1000) { count.incrementAndGet() }
    }

    val thread2 = Thread {
        repeat(1000) { count.incrementAndGet() }
    }

    thread1.start()
    thread2.start()
    thread1.join()
    thread2.join()

    println("AtomicInteger result: ${count.get()}")
}

/*
Task 3
Напишите программу с двумя потоками, которые одновременно увеличивают и уменьшают значение счетчика.
Ваша задача — обеспечить, чтобы операция увеличения и уменьшения была выполнена безопасно с помощью синхронизации.
*/

fun secondOfflow() {
    val counter = SafeCounter()

    val incThread = Thread {
        repeat(1000) { counter.increment() }
    }

    val decThread = Thread {
        repeat(1000) { counter.decrement() }
    }

    incThread.start()
    decThread.start()
    incThread.join()
    decThread.join()

    println("safety result: ${counter.getCount()}")
}

class SafeCounter {
    private var count = 0
    private val lock = Any()

    fun increment() {
        synchronized(lock) {
            count++
        }
    }

    fun decrement() {
        synchronized(lock) {
            count--
        }
    }

    fun getCount(): Int = synchronized(lock) { count }
}