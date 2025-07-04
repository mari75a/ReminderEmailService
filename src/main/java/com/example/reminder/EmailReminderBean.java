package com.example.reminder;

import jakarta.ejb.Schedule;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;

@Startup
@Singleton
public class EmailReminderBean {

    @Schedule(minute = "*/1", hour = "*", persistent = false)
    public void sendReminder() {
        System.out.println("📧 Sending reminder email at: " + new java.util.Date());

    }
}
