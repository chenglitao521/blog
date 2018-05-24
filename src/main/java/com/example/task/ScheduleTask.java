package com.example.task;

import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author:chenglitao
 * @Description:
 * @Date:2018/5/18 16:15
 */
/*@Component*/
public class ScheduleTask {
    private int count=0;

    @Scheduled(cron="*/6 * * * * ?")
    private void process(){
        System.out.println("this is scheduler task runing  "+(count++));
    }
}
