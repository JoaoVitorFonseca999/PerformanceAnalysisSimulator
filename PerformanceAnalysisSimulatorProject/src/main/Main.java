package main;
import classes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 2020.1.08.003
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer timer;
        SimData simData;
        RandomGenerator randomGenerator;
        //list of clients in the queue
        List<Client> clientList = new ArrayList<Client>();
        //list of clients in the service
        List<Client> serviceList = new ArrayList<Client>();


        
        //Leitura dos dados de entrada
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tempo de simulação:");
        double totalSimulationTime = input.nextDouble();
        System.out.println("Informe o tempo médio de chegada:");
        double avgArrivalTime = input.nextDouble();
        System.out.println("Informe o tempo médio de serviço:");
        double avgServiceTime = input.nextDouble();
        
        //Inicialização dos dados de simulação
        
    }
    
}
