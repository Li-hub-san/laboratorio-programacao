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

    public List<Pessoa> obterInformacaoFicheiro(String ficheiro) {
        String resourceName = "/ficha5/" + ficheiro;
        InputStream is = Main.class.getResourceAsStream(resourceName);
        if (is == null) {
            throw new NullPointerException("Cannot find resource file " + resourceName);
        }

        List<Pessoa> pessoas = new ArrayList<>();

        JSONTokener tokener = new JSONTokener(is);
        JSONArray array = new JSONArray(tokener);

        for (Object o : array) {
            try {
                JSONObject object = (JSONObject) o;

                String primeiroNome = object.getString("Primeiro_nome");
                String ultimoNome = object.getString("Ultimo_nome");
                int idade = object.getInt("Idade");
                double saldo = object.getDouble("Saldo");

                Pessoa pessoa = new Pessoa(primeiroNome, ultimoNome, idade, saldo);
                pessoas.add(pessoa);
            } catch (JSONException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        System.out.println(pessoas);

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

