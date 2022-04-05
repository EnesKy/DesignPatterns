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
        InternetCafe internetCafe = InternetCafe.getInstance();       // Internet cafe singleton objesi oluşturuluyor.
        Random random = new Random();                                 // Rastgele şekilde bekleme ve kullanma süresi oluşturuluyor.
        int usageInterval = 10000 + random.nextInt(5) * 10000; // 10-60 saniye aralığında kullanma süresi
        int waitingInterval = 5000 + random.nextInt(5) * 1000; // 5-10 saniye aralığında bekleme süresi

        datedPrint(name + ", " + usageInterval/1000 + " dakikalık masa açmak istiyor.");
        while (internetCafe.checkIn(this) == null) {         // Müşteri, yer bulana kadar masa açma isteğinde bulunuyor.
            safeSleep(waitingInterval);                               // Müşteri boş masa bulamamış. WaitingInterval saniye sonra tekrar soracak.
        }
        safeSleep(usageInterval);                                     // Müşteri, usageInterval saniyelik masa açmış ve bilgisayarı kullanıyor.
        internetCafe.checkOut(this);                         // Müşteri işini bitirdi ve bilgisayardan kalktı.
    }

    /**
     *  Güvenli thread.sleep() fonksiyonu kullanımı için yardımcı bir fonksiyon.
     */
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
