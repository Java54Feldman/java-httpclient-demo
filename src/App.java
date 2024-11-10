import java.net.URI;
import java.net.http.*;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(new URI("https://giezidydk5.execute-api.us-east-1.amazonaws.com/Prod/range?patientId=123")).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
