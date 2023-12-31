import proxy.ProxyUserLayer;

public class Proxy {
	public static void main(String[] args) throws Exception {
		System.out.println("Proxy launching with args: " + String.join(", ", args));
		int listenPort = Integer.parseInt(args[0]);
		boolean debugIndicator = Boolean.parseBoolean(args[2]);
		boolean looseIndicator = Boolean.parseBoolean(args[1]);
		ProxyUserLayer userLayer = new ProxyUserLayer(listenPort, debugIndicator, looseIndicator);
		userLayer.startListening();
	}
}
