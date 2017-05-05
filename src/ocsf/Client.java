package ocsf;

import java.io.IOException;
import java.util.Scanner;

import com.lloseng.ocsf.client.AbstractClient;
import com.lloseng.ocsf.client.ObservableClient;

public class Client extends ObservableClient {

	public Client(String host, int port) {
		super(host, port);
	}
	
	public void handleMessageFromServer(Object message) {
		System.out.println("Message: " + message);
	}
	
	public static void main(String[] args) throws IOException {
		Client client = new Client("158.108.235.127", 5555);
		Scanner scan = new Scanner(System.in);
		client.openConnection();
		while(client.isConnected()) {
			client.sendToServer(scan.nextLine());
		}
	}
	

}
