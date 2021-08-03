package com.chuck.scheduler.batch;

import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

@Component
public class Batch {
    @Scheduled(cron = "0 0 9 * * *")
    public void scrapyData() {
        //Do your job
    }
}
