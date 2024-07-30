class IpAddresNotFound extends Exception{
    public IpAddresNotFound(String msg)
    {
        super(msg);
    }

    public void checkip(String ip) throws IpAddresNotFound
    {
        if (ip == "192.168.2.2"){
            System.out.println("Connected");
        }
        else {
            throw new IpAddresNotFound("Enter Proper IP Address");
        }

    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        IpAddresNotFound ipAddres=new IpAddresNotFound("Not valid IP address");
        try {
            ipAddres.checkip("198.168.3.2");
        } catch (IpAddresNotFound e) {
            throw new RuntimeException(e);
        }
    }
}