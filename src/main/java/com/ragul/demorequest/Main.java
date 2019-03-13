package com.ragul.demorequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.joda.time.DateTime;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        sendPost();
    }
    // HTTP POST request
    private static void sendPost() throws IOException {

        DateTime dateTime = new DateTime();
        Json json = new Json("PCY947473", 23, 22, dateTime, 44, 23);
        String postUrl = "https://api.mosurance.com/endorsement";// put in your url
//        Gson gson = new Gson();
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String jsonS = ow.writeValueAsString(json);
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost(postUrl);
        StringEntity postingString = new StringEntity(jsonS);
        post.setEntity(postingString);
        post.setHeader("Content-type", "application/Json");
        HttpResponse response = httpClient.execute(post);

        System.out.println("Response  : " +
                response.getEntity());



    }
}
