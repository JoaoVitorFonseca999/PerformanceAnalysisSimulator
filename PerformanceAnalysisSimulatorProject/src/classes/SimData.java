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
public class SimData {
    private double avgArrivalTime;       //tempo médio de chegada
    private double avgServiceTime;       //tempo médio de serviço
    private double totalSimulationTime;  //tempo total de simulação

    public SimData(double avgArrivalTime, double avgServiceTime, double totalSimulationTime) {
        this.avgArrivalTime = avgArrivalTime;
        this.avgServiceTime = avgServiceTime;
        this.totalSimulationTime = totalSimulationTime;
    }
    
}
