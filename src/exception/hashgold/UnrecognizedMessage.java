package exception.hashgold;

@SuppressWarnings("serial")
public class UnrecognizedMessage extends Exception{
	public UnrecognizedMessage(int type) {
		super("Uncognized message type" + type);
	}
}
