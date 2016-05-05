package JavaproTest.TestPackage;

import java.util.Date;

/**
 * Created by Hyman on 2015/5/16.
 */
public class ThreadDemo {

    public static void main(String[] args){
        ThreadPriority th1 = new ThreadPriority();
        ThreadPriority th2 = new ThreadPriority();
        ThreadPriority th3 = new ThreadPriority();

//        th1.setName("东方不败");
//        th2.setName("岳不群");
//        th3.setName("林平之");
//
//        th1.start();
//        th2.start();
//        th3.start();
//
//        System.out.println(th1.getPriority()+"--"+th1.getName());
//        System.out.println(th2.getPriority()+"--"+th2.getName());
//        System.out.println(th3.getPriority()+"--"+th3.getName());
//
////        th1.setPriority(3);
        th1.start();
        th2.start();
        th3.start();

//        th1.sleep(3000);

    }
}


 class ThreadPriority extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+":"+i+new Date());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



//class  Method{
//    public void getData(){
//
//    }
//}
