import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Receiver5 extends Thread {
	Socket socket;
	BufferedReader in = null;
	
	//Socket을 매개변수로 받는 생성자
	public Receiver5(Socket socket) {
		this.socket = socket;
		
		try {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			System.out.println("예외1:"+e);
		}
	}
	//run()메소드 재정의
	@Override
	public void run() {
		while (in != null) {
			try {
				System.out.println("Thread Receive : " + in.readLine());
			} catch (java.net.SocketException ne) {
				break;
			} catch (IOException e) {
				System.out.println("예외2:"+e);
			}

		}
		try {
			in.close();
		} catch (IOException e) {
			System.out.println("예외3:"+e);
		}
	}
	

	
	
}
