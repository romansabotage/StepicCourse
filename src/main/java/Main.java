import com.sun.xml.internal.ws.api.policy.PolicyResolver;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Main {
    public static void main(String[] args) throws Exception {
        Frontend frontend = new Frontend();
        Server server = new Server(8080);
        ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
        server.setHandler(servletContextHandler);
        servletContextHandler.addServlet(new ServletHolder(frontend), '/authform');

        server.start();
        server.join();
    }
}
