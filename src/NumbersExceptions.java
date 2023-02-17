import java.net.SocketException;
import java.nio.file.AccessDeniedException;
import java.rmi.server.ExportException;

public class NumbersExceptions {
    public NumbersExceptions() {
    }

    public static void raiseExceptoin(Integer ExceptionNumber) throws SocketException, ClassNotFoundException, AccessDeniedException, ExportException {
        switch (ExceptionNumber) {
            case 1:
                throw new SocketException();
            case 2:
                throw new ClassNotFoundException();
            case 3:
                throw new AccessDeniedException("txt");
            case 4:
                throw new ExportException("txt");
            default:
                System.out.println("куда");
        }
    }

    public String raiseException(Integer ExN) {
        try {
            try {
                try {
                    try {
                        raiseExceptoin(ExN);
                    } catch (SocketException var3) {
                        System.out.println("Error: " + var3);
                    }
                } catch (ClassNotFoundException var4) {
                    System.out.println("Error: " + var4);
                }
            } catch (AccessDeniedException var5) {
                System.out.println("Error: " + var5);
            }
        } catch (ExportException var6) {
            System.out.println("Error: " + var6);
        }

        return "куда";
    }
}