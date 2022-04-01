package odev2.codes;

import java.util.Random;

import static odev2.codes.Util.datedPrint;

public class Customer extends Thread {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        InternetCafe internetCafe = InternetCafe.getInstance();
        Random random = new Random();
        int usageInterval = 10000 + random.nextInt(5) * 10000; // 10-60 sec
        int waitingInterval = 5000 + random.nextInt(5) * 1000; // 5-10 sec
        datedPrint(name + ", " + usageInterval/1000 + " dakikalık masa açmak istiyor.");
        while (internetCafe.checkIn(this) == null) {
            //datedPrint(name + " boş masa bulamadı. Bekliyor... ");
            safeSleep(waitingInterval);
        }
        safeSleep(usageInterval);
        internetCafe.checkOut(this);
    }

    private void safeSleep(int interval) {
        try {
            Thread.sleep(interval);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
