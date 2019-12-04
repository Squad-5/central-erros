package br.com.codenation.centralerros.enums;

public enum LevelEnum {

        WARNING("Warning"),

        TRACE("Trace"),

        ERROR("Error");

        private String value;

        LevelEnum(String value) {
            this.value = value;
        }
}
