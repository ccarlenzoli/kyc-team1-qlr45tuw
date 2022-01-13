package com.kyc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Anagrafica {

    @Id
    private Long ndg;

    private String data_inserimento;
    private String data_ultima_modifica;
    private String email;
    private String first_name;
    private String name;
    private String ndg_type;
    private String vat_number;

    public Anagrafica() {
    }

    public Anagrafica(Long ndg, String data_inserimento, String data_ultima_modifica, String email, String first_name, String name, String ndg_type, String vat_number) {
        this.ndg = ndg;
        this.data_inserimento = data_inserimento;
        this.data_ultima_modifica = data_ultima_modifica;
        this.email = email;
        this.first_name = first_name;
        this.name = name;
        this.ndg_type = ndg_type;
        this.vat_number = vat_number;
    }


    public Long getNdg() {
        return ndg;
    }

    public void setNdg(Long ndg) {
        this.ndg = ndg;
    }

    public String getData_inserimento() {
        return data_inserimento;
    }

    public void setData_inserimento(String data_inserimento) {
        this.data_inserimento = data_inserimento;
    }

    public String getData_ultima_modifica() {
        return data_ultima_modifica;
    }

    public void setData_ultima_modifica(String data_ultima_modifica) {
        this.data_ultima_modifica = data_ultima_modifica;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNdg_type() {
        return ndg_type;
    }

    public void setNdg_type(String ndg_type) {
        this.ndg_type = ndg_type;
    }

    public String getVat_number() {
        return vat_number;
    }

    public void setVat_number(String vat_number) {
        this.vat_number = vat_number;
    }
}
