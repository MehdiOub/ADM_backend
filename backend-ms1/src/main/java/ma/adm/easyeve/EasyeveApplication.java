package  ma.adm.easyeve;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.cache.annotation.EnableCaching;


import ma.adm.easyeve.bean.core.*;
import ma.adm.easyeve.service.facade.admin.*;

import ma.adm.easyeve.zynerator.security.common.AuthoritiesConstants;
import ma.adm.easyeve.zynerator.security.bean.User;
import ma.adm.easyeve.zynerator.security.bean.Permission;
import ma.adm.easyeve.zynerator.security.bean.Role;
import ma.adm.easyeve.zynerator.security.service.facade.UserService;
import ma.adm.easyeve.zynerator.security.service.facade.RoleService;


import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCaching
//@EnableFeignClients("ma.adm.easyeve.required.facade")
public class EasyeveApplication {
    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(EasyeveApplication.class, args);
    }


    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @Autowired
    private ObjectMapper objectMapper;

    @Bean
    ObjectMapper objectMapper(){
        return new ObjectMapper();
    }
    public static ConfigurableApplicationContext getCtx() {
        return ctx;
    }

    @Bean
    public CommandLineRunner demo(UserService userService, RoleService roleService) {
    return (args) -> {
        if(true){

            createEventType();
            createStationTypeEquipement();
            createTypeEquipement();
            createEvenement();
            createTypeVoie();
            createMessageType();
            createTelePeayage();
            createAnomalie();


    // Role admin

        User userForAdmin = new User("admin");

        Role roleForAdmin = new Role();
        roleForAdmin.setAuthority(AuthoritiesConstants.ADMIN);
        List<Permission> permissionsForAdmin = new ArrayList<>();
        addPermissionForAdmin(permissionsForAdmin);
        roleForAdmin.setPermissions(permissionsForAdmin);
        if(userForAdmin.getRoles()==null)
            userForAdmin.setRoles(new ArrayList<>());

        userForAdmin.getRoles().add(roleForAdmin);
        userService.save(userForAdmin);
            }
        };
    }



    private void createEventType(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            EventType item = new EventType();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            eventTypeService.create(item);
        }
    }
    private void createStationTypeEquipement(){
        for (int i = 1; i < 100; i++) {
            StationTypeEquipement item = new StationTypeEquipement();
            stationTypeEquipementService.create(item);
        }
    }
    private void createTypeEquipement(){
        String code = "code";
        String libelle = "libelle";
         String entree = "entree";
        String description = "description";
        for (int i = 1; i < 100; i++) {
            TypeEquipement item = new TypeEquipement();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            item.setEntree(fakeBoolean(entree, i));
            item.setDescription(fakeString(description, i));
            typeEquipementService.create(item);
        }
    }
    private void createEvenement(){
        String code = "code";
        String journeytDate = "journeytDate";
        String eventDetails = "eventDetails";
        for (int i = 1; i < 100; i++) {
            Evenement item = new Evenement();
            item.setCode(fakeString(code, i));
            item.setJourneytDate(fakeLocalDateTime(journeytDate, i));
            item.setEventDetails(fakeString(eventDetails, i));
            evenementService.create(item);
        }
    }
    private void createTypeVoie(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TypeVoie item = new TypeVoie();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            typeVoieService.create(item);
        }
    }
    private void createMessageType(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            MessageType item = new MessageType();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            messageTypeService.create(item);
        }
    }
    private void createTelePeayage(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            TelePeayage item = new TelePeayage();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            telePeayageService.create(item);
        }
    }
    private void createAnomalie(){
        String code = "code";
        String libelle = "libelle";
        for (int i = 1; i < 100; i++) {
            Anomalie item = new Anomalie();
            item.setCode(fakeString(code, i));
            item.setLibelle(fakeString(libelle, i));
            anomalieService.create(item);
        }
    }

    private static String fakeString(String attributeName, int i) {
        return attributeName + i;
    }

    private static Long fakeLong(String attributeName, int i) {
        return  10L * i;
    }
    private static Integer fakeInteger(String attributeName, int i) {
        return  10 * i;
    }

    private static Double fakeDouble(String attributeName, int i) {
        return 10D * i;
    }

    private static BigDecimal fakeBigDecimal(String attributeName, int i) {
        return  BigDecimal.valueOf(i*1L*10);
    }

    private static Boolean fakeBoolean(String attributeName, int i) {
        return i % 2 == 0 ? true : false;
    }
    private static LocalDateTime fakeLocalDateTime(String attributeName, int i) {
        return LocalDateTime.now().plusDays(i);
    }
    private static void addPermissionForAdmin(List<Permission> permissions){
        permissions.add(new Permission("EventType.edit"));
        permissions.add(new Permission("EventType.list"));
        permissions.add(new Permission("EventType.view"));
        permissions.add(new Permission("EventType.add"));
        permissions.add(new Permission("EventType.delete"));
        permissions.add(new Permission("Station.edit"));
        permissions.add(new Permission("Station.list"));
        permissions.add(new Permission("Station.view"));
        permissions.add(new Permission("Station.add"));
        permissions.add(new Permission("Station.delete"));
        permissions.add(new Permission("StationTypeEquipement.edit"));
        permissions.add(new Permission("StationTypeEquipement.list"));
        permissions.add(new Permission("StationTypeEquipement.view"));
        permissions.add(new Permission("StationTypeEquipement.add"));
        permissions.add(new Permission("StationTypeEquipement.delete"));
        permissions.add(new Permission("TypeEquipement.edit"));
        permissions.add(new Permission("TypeEquipement.list"));
        permissions.add(new Permission("TypeEquipement.view"));
        permissions.add(new Permission("TypeEquipement.add"));
        permissions.add(new Permission("TypeEquipement.delete"));
        permissions.add(new Permission("Evenement.edit"));
        permissions.add(new Permission("Evenement.list"));
        permissions.add(new Permission("Evenement.view"));
        permissions.add(new Permission("Evenement.add"));
        permissions.add(new Permission("Evenement.delete"));
        permissions.add(new Permission("TypeVoie.edit"));
        permissions.add(new Permission("TypeVoie.list"));
        permissions.add(new Permission("TypeVoie.view"));
        permissions.add(new Permission("TypeVoie.add"));
        permissions.add(new Permission("TypeVoie.delete"));
        permissions.add(new Permission("Voie.edit"));
        permissions.add(new Permission("Voie.list"));
        permissions.add(new Permission("Voie.view"));
        permissions.add(new Permission("Voie.add"));
        permissions.add(new Permission("Voie.delete"));
        permissions.add(new Permission("MessageType.edit"));
        permissions.add(new Permission("MessageType.list"));
        permissions.add(new Permission("MessageType.view"));
        permissions.add(new Permission("MessageType.add"));
        permissions.add(new Permission("MessageType.delete"));
        permissions.add(new Permission("TelePeayage.edit"));
        permissions.add(new Permission("TelePeayage.list"));
        permissions.add(new Permission("TelePeayage.view"));
        permissions.add(new Permission("TelePeayage.add"));
        permissions.add(new Permission("TelePeayage.delete"));
        permissions.add(new Permission("Anomalie.edit"));
        permissions.add(new Permission("Anomalie.list"));
        permissions.add(new Permission("Anomalie.view"));
        permissions.add(new Permission("Anomalie.add"));
        permissions.add(new Permission("Anomalie.delete"));
    }

    @Autowired
    EventTypeAdminService eventTypeService;
    @Autowired
    StationTypeEquipementAdminService stationTypeEquipementService;
    @Autowired
    TypeEquipementAdminService typeEquipementService;
    @Autowired
    EvenementAdminService evenementService;
    @Autowired
    TypeVoieAdminService typeVoieService;
    @Autowired
    MessageTypeAdminService messageTypeService;
    @Autowired
    TelePeayageAdminService telePeayageService;
    @Autowired
    AnomalieAdminService anomalieService;
}


