package ficha5;

import org.json.JSONObject;

import java.util.UUID;

public class Pessoa {
    private final UUID id;
    private final String firstName;
    private final String lastName;
    private final int idade;
    private final double saldo;

    public Pessoa(String firstName, String lastName, int idade, double saldo) {
        this.id = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.idade = idade;
        this.saldo = saldo;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIdade() {
        return idade;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return new JSONObject(this).toString(2);
    }
}

