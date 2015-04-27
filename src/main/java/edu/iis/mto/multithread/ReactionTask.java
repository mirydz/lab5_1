package edu.iis.mto.multithread;


public class ReactionTask implements Runnable {

    private PatriotBattery battery;

    public ReactionTask(PatriotBattery battery) {
        this.battery = battery;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            battery.launchPatriot();
    }


}
