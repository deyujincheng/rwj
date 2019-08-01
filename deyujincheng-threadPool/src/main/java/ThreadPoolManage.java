import java.util.concurrent.*;

public class ThreadPoolManage {

    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();

        // 构造一个线程池
        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 6, 3,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(3)
        );

        for (int i = 1; i <= 10; i++) {
            try {
                String task = "task=" + i;
                System.out.println("创建任务并提交到线程池中：" + task);
                threadPool.execute(new ThreadPoolTask(task));

                //Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            //等待所有线程执行完毕当前任务。
            threadPool.shutdown();

            boolean loop = true;
            do {
                //等待所有线程执行完毕当前任务结束
                loop = !threadPool.awaitTermination(2, TimeUnit.SECONDS);//等待2秒
            } while (loop);

            if (loop != true) {
                System.out.println("所有线程执行完毕");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("耗时：" + (System.currentTimeMillis() - currentTimeMillis));
        }

    }
}
