package edu.iis.mto.multithread;


public class ReactionTask implements Runnable {

    private Runnable task;
    private PatriotBattery battery;

    public ReactionTask(Runnable task, PatriotBattery battery) {
        this.task = task;
        this.battery = battery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            battery.launchPatriot();
    }


}
