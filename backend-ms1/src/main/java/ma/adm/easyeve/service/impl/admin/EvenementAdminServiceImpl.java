package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.*;
import ma.adm.easyeve.bean.history.EvenementHistory;
import ma.adm.easyeve.dao.criteria.core.EvenementCriteria;
import ma.adm.easyeve.dao.criteria.history.EvenementHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.EvenementDao;
import ma.adm.easyeve.dao.facade.history.EvenementHistoryDao;
import ma.adm.easyeve.dao.specification.core.EvenementSpecification;
import ma.adm.easyeve.service.facade.admin.EvenementAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.ZoneId;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.adm.easyeve.service.facade.admin.StationAdminService ;
import ma.adm.easyeve.service.facade.admin.VoieAdminService ;
import ma.adm.easyeve.service.facade.admin.EventTypeAdminService ;
import ma.adm.easyeve.service.facade.admin.TelePeayageAdminService ;
import ma.adm.easyeve.service.facade.admin.AnomalieAdminService ;
import ma.adm.easyeve.service.facade.admin.MessageTypeAdminService ;
import ma.adm.easyeve.service.facade.admin.TypeEquipementAdminService ;
import org.springframework.web.multipart.MultipartFile;


import java.util.List;
import java.util.Optional;

@Service
public class EvenementAdminServiceImpl extends AbstractServiceImpl<Evenement,EvenementHistory, EvenementCriteria, EvenementHistoryCriteria, EvenementDao,
EvenementHistoryDao> implements EvenementAdminService {


    public Evenement findByReferenceEntity(Evenement t){
        return  dao.findByCode(t.getCode());
    }

    public List<Evenement> findByVoieId(Long id){
        return dao.findByVoieId(id);
    }
    public int deleteByVoieId(Long id){
        return dao.deleteByVoieId(id);
    }
    public List<Evenement> findByMessageTypeId(Long id){
        return dao.findByMessageTypeId(id);
    }
    public int deleteByMessageTypeId(Long id){
        return dao.deleteByMessageTypeId(id);
    }
    public List<Evenement> findByTelePeayageId(Long id){
        return dao.findByTelePeayageId(id);
    }
    public int deleteByTelePeayageId(Long id){
        return dao.deleteByTelePeayageId(id);
    }
    public List<Evenement> findByTypeEquipementId(Long id){
        return dao.findByTypeEquipementId(id);
    }
    public int deleteByTypeEquipementId(Long id){
        return dao.deleteByTypeEquipementId(id);
    }
    public List<Evenement> findByEventTypeId(Long id){
        return dao.findByEventTypeId(id);
    }
    public int deleteByEventTypeId(Long id){
        return dao.deleteByEventTypeId(id);
    }
    public List<Evenement> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }
    public List<Evenement> findByAnomalieId(Long id){
        return dao.findByAnomalieId(id);
    }
    public int deleteByAnomalieId(Long id){
        return dao.deleteByAnomalieId(id);
    }

    public void configure() {
        super.configure(Evenement.class,EvenementHistory.class, EvenementHistoryCriteria.class, EvenementSpecification.class);
    }
    public int upload(MultipartFile file) throws IOException {
        InputStream inputStream = new BufferedInputStream(file.getInputStream());
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);
        // List<Evenement> evenements = new ArrayList<>();
        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue;
            }
            Evenement evenement = new Evenement();
            //Station
            String libelle = row.getCell(0).getStringCellValue();
            Station station = stationServiceImpl.findByLibelle(libelle);
            evenement.setStation(station);

            //Voie
            String codeVoie = row.getCell(1) .getStringCellValue() ;
            Voie voie =  voieServiceImpl.findByLibelleAndStationLibelle(codeVoie,libelle) ;
            evenement.setVoie(voie);

            //date
            evenement.setJourneytDate(row.getCell(2).getDateCellValue().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());

            //TypeVoie
            String libTypeVoie = row.getCell(3) .getStringCellValue() ;
            TypeVoie typeVoie = typeVoieAdminServiceImpl.findByLibelle(libTypeVoie);
            voie.setTypeVoie(typeVoie);

            //message type
            String libMessageType = row.getCell(4) .getStringCellValue() ;
            MessageType messageType = messageTypeServiceImpl.findByLibelle(libMessageType);
            evenement.setMessageType(messageType);


            voie.setCode(row.getCell(5).getStringCellValue());

            //telepeage
            String codeTelePeage = row.getCell(6) .getStringCellValue() ;
            TelePeayage telePeayage = telePeayageServiceImpl.findByCode(codeTelePeage );
            evenement.setTelePeayage(telePeayage);


            //EventType
            String codeEventType= row.getCell(7) .getStringCellValue() ;
            EventType eventType = eventTypeServiceImpl.findByCode(codeEventType );
            evenement.setEventType(eventType);

            //l equipement
            String codeEquipement= row.getCell(8) .getStringCellValue() ;
            TypeEquipement typeEquipement = typeEquipementAdminServiceImpl.findByCode( codeEquipement );
            evenement.setTypeEquipement(typeEquipement);


            evenement.setCode(row.getCell(9).getStringCellValue());
            evenement.setEventDetails(row.getCell(10).getStringCellValue());

            dao.save(evenement) ;
        }
        workbook.close();
        return 1 ;
    }
    @Autowired
    private TypeEquipementAdminServiceImpl typeEquipementAdminServiceImpl ;
    @Autowired
    private  TypeVoieAdminServiceImpl typeVoieAdminServiceImpl ;
    @Autowired
    private StationAdminServiceImpl stationServiceImpl ;
    @Autowired
    private VoieAdminServiceImpl voieServiceImpl ;
    @Autowired
    private EventTypeAdminServiceImpl eventTypeServiceImpl ;
    @Autowired
    private TelePeayageAdminServiceImpl telePeayageServiceImpl ;
    @Autowired
    private AnomalieAdminServiceImpl anomalieServiceImpl ;
    @Autowired
    private MessageTypeAdminServiceImpl messageTypeServiceImpl ;

    public EvenementAdminServiceImpl(EvenementDao dao, EvenementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}