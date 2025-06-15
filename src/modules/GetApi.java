package modules;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetApi {

    Gson gson =new Gson();

    public ValuesApi getValues(String base){

        URI direction = URI.create("https://v6.exchangerate-api.com/v6/9912cc2c7f4cdd90e1d87f23/latest/"+base);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direction)
                .build();

        HttpResponse<String> response;

        {
            try {
                response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException | InterruptedException e) {
                System.err.println("An error occurred: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
        System.out.println(response.body());
        return new Gson().fromJson(response.body(), ValuesApi.class);
    }



}
