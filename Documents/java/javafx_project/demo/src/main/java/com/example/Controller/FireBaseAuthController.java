package com.example.Controller;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FireBaseAuthController {
    private static final String API_KEY = "AIzaSyDEU5_5xMaZXnfOpBdOMdv56kru850Z5-U";

    public static boolean signInWithEmailAndPassword(String email, String password) {
        try {
            // Firebase Auth REST API URL
            URL url = new URL("https://identitytoolkit.googleapis.com/v1/accounts:signInWithPassword?key=" + API_KEY);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // Configure connection
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setDoOutput(true);

            // Create JSON payload
            String payload = String.format(
                "{\"email\":\"%s\",\"password\":\"%s\",\"returnSecureToken\":true}",
                email, password
            );

            // Write payload
            OutputStream os = conn.getOutputStream();
            os.write(payload.getBytes());
            os.flush();
            os.close();

            // Read response
            int responseCode = conn.getResponseCode();
            if (responseCode == 200) {
                // Success
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();
                System.out.println("Success: " + response.toString());
                return true;
            } else {
                // Error
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println("Error: " + line);
                }
                br.close();
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    // Example usage
    public static void main(String[] args) {
        String email = "your_email@example.com";
        String password = "your_password";
        boolean result = signInWithEmailAndPassword(email, password);
        System.out.println("Login success: " + result);
    }

    public boolean handleSignup(String text, String text2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleSignup'");
    }
}

