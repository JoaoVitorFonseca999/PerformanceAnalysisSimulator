/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 2020.1.08.003
 */
public class Client {
    private double arrivalTime;//tempo de chegada
    private double serviceTime;//tempo de serviço
    private double departureTime;//tempo de saída
    private double waitingTime;//tempo de espera

    public Client(double arrivalTime, double serviceTime, double departureTime) {
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.departureTime = departureTime;
    }

    public double getArrivalTime() {
        return arrivalTime;
    }
    public double getServiceTime() {
        return serviceTime;
    }
    public double getDepartureTime() {
        return departureTime;
    }
    public double getWaitingTime() {
        return waitingTime;
    }
    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public void setServiceTime(double serviceTime) {
        this.serviceTime = serviceTime;
    }
    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }
    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }
}
