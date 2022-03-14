package ficha5;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LoadFromFile {
    
    // código para ler a partir dos resources encontrado aqui: https://kodejava.org/how-do-i-read-json-file-using-json-java-org-json-library/
    // código para fazer parsing dos objectos encontrado aqui: https://stackoverflow.com/a/10926379
    public List<Pessoa> obterInformacaoFicheiro(String ficheiro) {
        try {
            InputStream is = getFileAsIOStream(ficheiro);
            String conteudoFicheiro = getFileContent(is);
            return convertStringToPessoa(conteudoFicheiro);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    private InputStream getFileAsIOStream(String ficheiro) throws NullPointerException {
        // para ir buscar a partir dos resources, os ficheiros têm que estar no caminho /src/main/resources
        // pasta "ficha5" adicionada para poder diferenciar para que projetos os resources são
        String resourceName = "/ficha5/" + ficheiro;

        // ler ficheiro a partir dos resources
        InputStream is = Main.class.getResourceAsStream(resourceName);
        if (is == null) {
            // quando o ficheiro não é encontrado, envia uma excepção
            throw new NullPointerException("Cannot find resource file " + resourceName);
        }
        return is;
    }

    private String getFileContent(InputStream is) throws IOException {
        InputStreamReader inStrReader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(inStrReader);

        StringBuilder conteudoFicheiro = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            conteudoFicheiro.append(line);
            line = br.readLine();
        }
        return conteudoFicheiro.toString();
    }

    private ArrayList<Pessoa> convertStringToPessoa(String texto) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(texto);

        // iterar o arreio encontrado para cada objecto
        for (Object object : jsonArray) {
            try {
                // converter o object num JSONObject (para poder fazer parse das propriedades)
                JSONObject jsonObject = (JSONObject) object;

                // tirar os valores encontrados nas propriedades
                String primeiroNome = jsonObject.getString("Primeiro_nome");
                String ultimoNome = jsonObject.getString("Ultimo_nome");
                int idade = jsonObject.getInt("Idade");
                double saldo = jsonObject.getDouble("Saldo");

                // Criar uma nova pessoa usando os valores encontrados
                Pessoa pessoa = new Pessoa(primeiroNome, ultimoNome, idade, saldo);
                // adicionar nova pessoa a lista para poder devolver tudo de uma vez
                pessoas.add(pessoa);
            } catch (JSONException e) {
                System.out.println(e);
            }
        }

        return pessoas;
    }
}


