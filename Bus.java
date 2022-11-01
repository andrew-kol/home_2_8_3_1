package hw3.Task1.Car;


import hw3.Task1.DiagnosticsException;
import hw3.Task1.Transport;
import hw3.Task1.Сompeting;

public class Bus extends Transport implements Сompeting {
    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void pitStop() {
        System.out.println("Я на Пит-Стопе 30 сек");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга 2 мин. 45 сек.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость 120 км/ч");
    }

    @Override
    public String toString() {
        return "Автобус: " +
                "\nмарка " + getBrand() +
                ",\nмодель " + getModel() +
                ",\nобъем двигателя " + getEngineVolume();
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус отправился от остановки");
    }

    @Override
    public void endMoving() {
        System.out.println("Автобус прибыл на конечную остановку");
    }

    @Override
    public boolean passDiagnostics() {
        try {
            throw new DiagnosticsException("Buses do not pass diagnostics");
        } catch (DiagnosticsException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void repair() {
        System.out.println("Автобус: " + getBrand() + " " + getModel() + " отремонтирован.");
    }
}