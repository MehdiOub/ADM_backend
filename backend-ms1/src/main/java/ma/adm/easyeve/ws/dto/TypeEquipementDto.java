package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDtoEnhanced;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TypeEquipementDto  extends AuditBaseDtoEnhanced {

    private String code  ;
    private String libelle  ;
    private Boolean entree  ;
    private String description  ;




    public TypeEquipementDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public Boolean getEntree(){
        return this.entree;
    }
    public void setEntree(Boolean entree){
        this.entree = entree;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }






}
