package oop.inner_classes_anonymous;

public class Monitoring {
    public static void main(String[] args){
        int currentErrorsCount = 10;

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Start general monitoring!");
                getCurrentErrorsCount();
            }

            public void getCurrentErrorsCount(){
                System.out.println("Current errors count: " + currentErrorsCount);
            }
        };

        MonitoringSystem errorModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Start errors monitoring!");
            }
        };

        generalModule.startMonitoring();
        errorModule.startMonitoring();
    }
}
