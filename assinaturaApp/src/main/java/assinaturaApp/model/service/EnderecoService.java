package assinaturaApp.model.service;

import assinaturaApp.model.domain.Endereco;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EnderecoService {
	private static Map<Integer, Endereco> enderecos = new HashMap<Integer, Endereco>();
	private static Integer id = 0;
	
    public static Endereco obterEnderecoPorCep(String cep) throws Exception {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";

        HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder responseBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                responseBuilder.append(line);
            }
            reader.close();
            
            JSONObject json = new JSONObject(responseBuilder.toString());
            Endereco endereco = new Endereco();
            endereco.setCep(json.getString("cep"));
            endereco.setLogradouro(json.getString("logradouro"));
            endereco.setComplemento(json.optString("complemento"));
            endereco.setBairro(json.getString("bairro"));
            endereco.setLocalidade(json.getString("localidade"));
            endereco.setUf(json.getString("uf"));

            return endereco;
        } else {
            throw new Exception("Erro ao obter dados de endereço para o CEP: " + cep);
        }
    }
    
    public static void incluir(Endereco endereco) {
    	endereco.setId(++id);
		enderecos.put(endereco.getId(), endereco);
	}

	public static void excluir(int id) {
		enderecos.remove(id);
	}

	public static Collection<Endereco> obterLista() {
		return enderecos.values();
	}
	
	public static Endereco obterPorId(Integer id) {
		return enderecos.get(id);
	}
}
