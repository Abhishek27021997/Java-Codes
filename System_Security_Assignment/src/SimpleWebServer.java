import java.io.*;
import java.net.*;
import java.util.*;

public class SimpleWebServer {

    private static final int PORT = 8080;
    private static ServerSocket serverSocket;
    private static final String ACCESS_LOG_FILE = "access_log.txt";

    public SimpleWebServer() throws Exception {
        serverSocket = new ServerSocket(PORT);
    }

    public void run() throws Exception {
        while (true) {
            Socket clientSocket = serverSocket.accept();
            processRequest(clientSocket);
        }
    }

    public void processRequest(Socket clientSocket) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            OutputStreamWriter osw = new OutputStreamWriter(clientSocket.getOutputStream());

            String request = br.readLine();
            String command = null;
            String pathname = null;

            StringTokenizer st = new StringTokenizer(request, " ");
            command = st.nextToken();
            pathname = st.nextToken();

            if (command.equals("GET")) {
                if (checkPath(pathname)) {
                    serveFile(osw, pathname);
                    logAccess(clientSocket.getInetAddress().getHostAddress(), pathname);
                } else {
                    osw.write("HTTP/1.0 403 Forbidden\n\n");
                    osw.close();
                }
            } else {
                osw.write("HTTP/1.0 501 Not Implemented\n\n");
                osw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void serveFile(OutputStreamWriter osw, String pathname) {
        if (pathname.charAt(0) == '/') {
            pathname = pathname.substring(1);
        }

        if (pathname.equals("")) {
            pathname = "index.html";
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(pathname))) {
            osw.write("HTTP/1.0 200 OK\n\n");
            String line;
            while ((line = fileReader.readLine()) != null) {
                osw.write(line);
            }
        } catch (FileNotFoundException e) {
            try {
                osw.write("HTTP/1.0 404 Not Found\n\n");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean checkPath(String directoryName) {
        
        return true;
    }

    public void logAccess(String originIP, String requestedFile) {
        try {
            PrintWriter accessLog = new PrintWriter(new FileWriter(ACCESS_LOG_FILE, true));
            Date now = new Date();
            accessLog.println("[" + now.toString() + "] " + originIP + " " + requestedFile);
            accessLog.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String argv[]) throws Exception {
        SimpleWebServer webServer = new SimpleWebServer();
        webServer.run();
    }
}

