package br.com.codenation.centralerros.enums;

public enum AmbienteEnum {

    PRODUCAO("Produção"),

    DEV("Desenvolvimento"),

    HOMOLOGACAO("Homologação");

    private String value;

    AmbienteEnum(String value) {
        this.value = value;
    }
}
