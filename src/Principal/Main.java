package Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {


     /*   Gson gson = new GsonBuilder()
                .setPrettyPrinting().create();
        String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/mxn/usd/200";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        catching micatching = gson.fromJson(json, catching.class);
        Monedas miMoneda = new Monedas(micatching);
        miMoneda.imprime();*/


/*
        while(true){
            System.out.println("Bienvenido al conversor de Monedas");
            System.out.println("Elija una opcion correcta: ");
            System.out.println("1. Pesos Mexicanos (MXN) a Euros (EUR)");
            System.out.println("2. Pesos Mexicanos (MXN) a Dolar (USD)");
            System.out.println("3. Dolar (USD) a Real Brasileno (BRL)");
            System.out.println("4. Libra Esterlina (GBP) a Franco Suizo (CHF)");
            System.out.println("5. Peso Argentino (ARS) a Quetzal Guatemala (GTQ)");
            System.out.println("6. Salir");
            Scanner opcion = new Scanner(System.in);
            int seleccion = opcion.nextInt();
            if(seleccion == 1) {
                System.out.println("Introduza la cantidad de dinero a convertir: ");


            }

            else if(seleccion == 6)
               break;
        }

    }

*/
while(true)
{
        System.out.println("Bienvenido al conversor de Monedas");
        int opcion = 0;
        System.out.println("*****************************************************************");
        System.out.println("Elija una opcion correcta ");
        System.out.println("Bienvenido al conversor de Monedas");
        System.out.println("Elija una opcion correcta: ");
        System.out.println("1. Pesos Mexicanos (MXN) a Euros (EUR)");
        System.out.println("2. Pesos Mexicanos (MXN) a Dolar (USD)");
        System.out.println("3. Dolar (USD) a Real Brasileno (BRL)");
        System.out.println("4. Libra Esterlina (GBP) a Franco Suizo (CHF)");
        System.out.println("5. Peso Argentino (ARS) a Quetzal Guatemala (GTQ)");
        System.out.println("6. Otra conversion");
        System.out.println("7. Salir");
        System.out.println("*****************************************************************");
        Scanner teclado = new Scanner(System.in);
        opcion = teclado.nextInt();

        if(opcion== 1)
        {
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: Pesos Mexicanos (MXN)");
            System.out.println("Moneda destino: Euro (EUR)");
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/mxn/eur/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
           // System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            miMoneda.imprime();
        }
        else if (opcion == 2) {
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: Pesos Mexicanos (MXN)");
            System.out.println("Moneda destino: Dolar (USD)");
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/mxn/usd/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            //System.out.println(cantidad+ " MXN");
            miMoneda.imprime();


        }
        else if (opcion == 3) {
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: Dolar (USD)");
            System.out.println("Moneda destino: Real Brasileno (BRL)");
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/usd/brl/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            miMoneda.imprime();
        }
        else if (opcion == 4) {
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: Libra Esterlina (GBP)");
            System.out.println("Moneda destino: Franco Suizo (CHF)");
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/gbp/chf/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
           // System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            miMoneda.imprime();
        }
        else if (opcion == 5) {
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: Peso Argentino (ARS)");
            System.out.println("Moneda destino: Quetzal Guatemalteco (GTQ)");
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/ars/gtq/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            miMoneda.imprime();
        }
            else if (opcion == 6) {

            System.out.println("Escriba el valor de la Moneda Origen");
            Scanner A = new Scanner(System.in);
            String prefijoA = A.nextLine();
            System.out.println("Escriba el valor de la Moneda Destino");
            Scanner B = new Scanner(System.in);
            String prefijoB = A.nextLine();
            System.out.println("Introduzca el valor a convertir: ");
            Scanner teclado1 = new Scanner(System.in);
            String cantidad = teclado1.nextLine();
            System.out.println("*****************************************");
            System.out.println("Moneda Base: " + prefijoA);
            System.out.println("Moneda destino: " +prefijoB);
            //int valor = teclado.nextLine();
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting().create();
            String direccion = "https://v6.exchangerate-api.com/v6/d790cc48659cc1c4cebb4b4f/pair/"+prefijoA+"/"+prefijoB+"/"+ cantidad;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            //System.out.println(json);

            catching micatching = gson.fromJson(json, catching.class);
            Monedas miMoneda = new Monedas(micatching);
            miMoneda.imprime();
        }
        else if (opcion == 7) {
            break;
        }

}

        }
    }
