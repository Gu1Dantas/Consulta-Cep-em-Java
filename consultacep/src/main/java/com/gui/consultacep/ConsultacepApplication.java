package com.gui.consultacep;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

@SpringBootApplication
public class ConsultacepApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um cep: ");
		String lugar = sc.nextLine();

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://viacep.com.br/ws/" + lugar + "/json/"))
				.build();
		HttpResponse<String> response = client
				.send(request, HttpResponse.BodyHandlers.ofString());
		String json = response.body();
		System.out.println(json);

		if (json.contains("Erro")) {
			System.out.println("Cep nao encontrado");
		} else {
			ObjectMapper mapper = new ObjectMapper();
			Endereco endereco = mapper.readValue(json, Endereco.class);
			System.out.println(endereco);
		}
	}

}
