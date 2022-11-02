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
        input.close();
        
        //Inicialização dos dados de simulação
        timer = new Timer(totalSimulationTime);
        simData = new SimData(avgArrivalTime, avgServiceTime, totalSimulationTime);
        randomGenerator = new RandomGenerator(avgArrivalTime, avgServiceTime);

        //Loop principal da simulação
        while(timer.currentTime < timer.totalSimulationTime){
            //Chegada de um novo cliente
            
            //Cria um novo cliente
            Client client = new Client(timer.currentTime, randomGenerator.GenerateRandomTime(simData.getAvgServiceTime()));
            //Adiciona o cliente na fila
            clientList.add(client);
            //Incrementa o tempo de simulação
            timer.incrementTime(randomGenerator.arrivalTime);
            //Gera um novo tempo de chegada
            randomGenerator.generateArrivalTime();
        
            //Serviço de um cliente
            
            //Verifica se há clientes na fila
            if(clientList.size() > 0){
                //Remove o primeiro cliente da fila
                Client client = clientList.remove(0);
                //Adiciona o cliente na lista de clientes em serviço
                serviceList.add(client);
                //Incrementa o tempo de simulação
                timer.incrementTime(randomGenerator.serviceTime);
                //Gera um novo tempo de serviço
                randomGenerator.generateServiceTime();
            }
            //Não há clientes na fila
            else{
                //Incrementa o tempo de simulação
                timer.incrementTime(randomGenerator.serviceTime);
                //Gera um novo tempo de serviço
                randomGenerator.generateServiceTime();
            }
            
        }

        
    }
    
}
