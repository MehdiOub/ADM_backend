package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class TelePeayageDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public TelePeayageDto(){
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






}
