package ficha5;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class LoadFromFile {

    public LoadFromFile() {
    }

    // código para ler a partir dos resources encontrado aqui: https://kodejava.org/how-do-i-read-json-file-using-json-java-org-json-library/
    // código para fazer parsing dos objectos encontrado aqui: https://stackoverflow.com/a/10926379
    public List<Pessoa> obterInformacaoFicheiro(String ficheiro) {
        // para ir buscar a partir dos resources, os ficheiros têm que estar no caminho /src/main/resources
        // pasta "ficha5" adicionada para poder diferenciar para que projectos os resources são
        String resourceName = "/ficha5/" + ficheiro;

        // ler ficheiro a partir dos resources
        InputStream is = Main.class.getResourceAsStream(resourceName);
        if (is == null) {
            // quando o ficheiro não é encontrado, envia uma excepção
            throw new NullPointerException("Cannot find resource file " + resourceName);
        }

        // preparar a leitura do ficheiro
        JSONTokener tokener = new JSONTokener(is);
        // começar o parsing a partir de um arreio
        JSONArray jsonArray = new JSONArray(tokener);

        // lista de pessoas que vão ser criadas a partir do ficheiro
        List<Pessoa> pessoas = new ArrayList<>();

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
                // apanhar possiveis erros quando estiver a fazer parse dos objectos ou propriedades
                System.out.println("Erro de parse: " + e.getMessage());
            }
        }

        return pessoas;
    }

//    public void getFileAsIOStream() {
//
//    }
//
//    public void getFileContent() {
//
//    }
//
//    public void convertStringToPessoa() {
//
//    }
}

