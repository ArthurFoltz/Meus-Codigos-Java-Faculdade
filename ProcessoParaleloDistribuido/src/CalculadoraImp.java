/**
 * Implementação das funções assinadas na interface
 */

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

//UnicastRemoteObject permite que a implementacao da classe possa ser estabelecida como um servico remoto
public class CalculadoraImp extends UnicastRemoteObject implements Calculadora{

    private double[] memory = new double[10];

    public CalculadoraImp() throws RemoteException{
        super();
    }

    @Override
    public Double soma(double x, double y) throws RemoteException {
        return x + y;
    }

    @Override
    public Double sub(double x, double y) throws RemoteException {
        return x - y;
    }

    @Override
    public Double mult(double x, double y) throws RemoteException {
        return x * y;
    }

    @Override
    public Double div(double x, double y) throws RemoteException {
        return x / y;
    }

    @Override
    public Double fat(int x) throws RemoteException {
        System.out.println("d");
        double temp = x;
		double f = temp;
		while (temp > 1){
            System.out.println("dd");
			f = f *(temp-1); temp--;
		}
        System.out.println("ddd");
		return f; // Aqui exibira o valor final do Fatorial 
    }

    @Override
    public void store(int x, double y) throws RemoteException {
        memory[x] = y;
    }
    
    @Override
    public Double load(int x) throws RemoteException {
        return memory[x];
    }
}
