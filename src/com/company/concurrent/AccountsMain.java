package com.company.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AccountsMain {
    public static void main(String[] args) {
        Account a1 = new Account(500);
        Account a2 = new Account(500);

        ExecutorService service =
                Executors.newFixedThreadPool(2);

        List<Future<Boolean>> futures = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Future<Boolean> f1;
            if (i % 2 == 0) {
                f1 = service.submit(new SafeTransferOperation(
                        a1, a2, 300
                ));
            } else {
                f1 = service.submit(new SafeTransferOperation(
                        a2, a1, 300
                ));
            }
            futures.add(f1);
        }


        service.shutdown();
        int success = 0;
        try {
            for (Future<Boolean> future : futures) {
                Boolean result = future.get();
                if (result) success++;
                System.out.println(result);
            }

            System.out.println(a1.getAmount());
            System.out.println(a2.getAmount());
            System.out.println(success);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
