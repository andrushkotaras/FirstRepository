package Threads.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Інтерфейс Lock надає більш гнучкі можливості для блокування, ніж вбудовані механізми синхронізації в Java.

ReentrantLock - це одна з основних реалізацій інтерфейсу Lock.
"Reentrant" означає, що потік не може захопити блокування, яке він вже захопив.
 */
public class LockLecture {
    private final Lock lock = new ReentrantLock();
    private final Object lockObj = new Object();

    public static void main(String[] args) {
        LockLecture example = new LockLecture();
        Thread t1 = new Thread(example::doWork);
        Thread t2 = new Thread(example::doWork);

        t1.start();
        t2.start();
    }

    private void doWork(){
        lock.lock();
        try {
            System.out.println("Work");
        } finally {
            lock.unlock();
        }
    }

    private void doWorkSync(){
        synchronized (lockObj){
            System.out.println("Work");
        }
    }



    /*
    Відмінності від synchronized:

    Гнучкість: Lock дозволяє отримати більш гнучке блокування (наприклад, можливість переривання блокувань,
     спроба захоплення блокування протягом певного часу тощо).

    Ручне керування: З Lock вам потрібно вручну захоплювати та відпускати блокування,
     що збільшує ризик помилок (забути відпустити блокування), але надає більше контролю.

      synchronized, блокування захоплюється автоматично при вході в блок або метод і відпускається при виході.

      ReentrantLock ви можете використовувати Condition (ConditionLockExample) для більш гнучкої умовної синхронізації.
        З synchronized ви маєте обмежені можливості, такі як wait(), notify() та notifyAll().
     */




    /*
    Обидва підходи забезпечують взаємне виключення для критичного розділу коду. Вибір між ними залежить від конкретних потреб вашого застосунку.
     */



}
