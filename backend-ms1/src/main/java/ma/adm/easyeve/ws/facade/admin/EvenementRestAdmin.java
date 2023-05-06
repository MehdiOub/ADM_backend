package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.Evenement;
import ma.adm.easyeve.bean.history.EvenementHistory;
import ma.adm.easyeve.dao.criteria.core.EvenementCriteria;
import ma.adm.easyeve.dao.criteria.history.EvenementHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.EvenementAdminService;
import ma.adm.easyeve.service.impl.admin.EvenementAdminServiceImpl;
import ma.adm.easyeve.ws.converter.EvenementConverter;
import ma.adm.easyeve.ws.dto.EvenementDto;
import ma.adm.easyeve.zynerator.controller.AbstractController;
import ma.adm.easyeve.zynerator.dto.AuditEntityDto;
import ma.adm.easyeve.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.adm.easyeve.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.adm.easyeve.zynerator.dto.FileTempDto;

@Api("Manages evenement services")
@RestController
@RequestMapping("/api/admin/evenement/")
public class EvenementRestAdmin  extends AbstractController<Evenement, EvenementDto, EvenementHistory, EvenementCriteria, EvenementHistoryCriteria, EvenementAdminService, EvenementConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all evenements")
    @GetMapping("")
    public ResponseEntity<List<EvenementDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all evenements")
    @GetMapping("optimized")
    public ResponseEntity<List<EvenementDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a evenement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EvenementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  evenement")
    @PostMapping("")
    public ResponseEntity<EvenementDto> save(@RequestBody EvenementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  evenement")
    @PutMapping("")
    public ResponseEntity<EvenementDto> update(@RequestBody EvenementDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of evenement")
    @PostMapping("multiple")
    public ResponseEntity<List<EvenementDto>> delete(@RequestBody List<EvenementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified evenement")
    @DeleteMapping("")
    public ResponseEntity<EvenementDto> delete(@RequestBody EvenementDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified evenement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple evenements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by voie id")
    @GetMapping("voie/id/{id}")
    public List<Evenement> findByVoieId(@PathVariable Long id){
        return service.findByVoieId(id);
    }
    @ApiOperation("delete by voie id")
    @DeleteMapping("voie/id/{id}")
    public int deleteByVoieId(@PathVariable Long id){
        return service.deleteByVoieId(id);
    }
    @ApiOperation("find by messageType id")
    @GetMapping("messageType/id/{id}")
    public List<Evenement> findByMessageTypeId(@PathVariable Long id){
        return service.findByMessageTypeId(id);
    }
    @ApiOperation("delete by messageType id")
    @DeleteMapping("messageType/id/{id}")
    public int deleteByMessageTypeId(@PathVariable Long id){
        return service.deleteByMessageTypeId(id);
    }
    @ApiOperation("find by telePeayage id")
    @GetMapping("telePeayage/id/{id}")
    public List<Evenement> findByTelePeayageId(@PathVariable Long id){
        return service.findByTelePeayageId(id);
    }
    @ApiOperation("delete by telePeayage id")
    @DeleteMapping("telePeayage/id/{id}")
    public int deleteByTelePeayageId(@PathVariable Long id){
        return service.deleteByTelePeayageId(id);
    }
    @ApiOperation("find by typeEquipement id")
    @GetMapping("typeEquipement/id/{id}")
    public List<Evenement> findByTypeEquipementId(@PathVariable Long id){
        return service.findByTypeEquipementId(id);
    }
    @ApiOperation("delete by typeEquipement id")
    @DeleteMapping("typeEquipement/id/{id}")
    public int deleteByTypeEquipementId(@PathVariable Long id){
        return service.deleteByTypeEquipementId(id);
    }
    @ApiOperation("find by eventType id")
    @GetMapping("eventType/id/{id}")
    public List<Evenement> findByEventTypeId(@PathVariable Long id){
        return service.findByEventTypeId(id);
    }
    @ApiOperation("delete by eventType id")
    @DeleteMapping("eventType/id/{id}")
    public int deleteByEventTypeId(@PathVariable Long id){
        return service.deleteByEventTypeId(id);
    }
    @ApiOperation("find by station id")
    @GetMapping("station/id/{id}")
    public List<Evenement> findByStationId(@PathVariable Long id){
        return service.findByStationId(id);
    }
    @ApiOperation("delete by station id")
    @DeleteMapping("station/id/{id}")
    public int deleteByStationId(@PathVariable Long id){
        return service.deleteByStationId(id);
    }
    @ApiOperation("find by anomalie id")
    @GetMapping("anomalie/id/{id}")
    public List<Evenement> findByAnomalieId(@PathVariable Long id){
        return service.findByAnomalieId(id);
    }
    @ApiOperation("delete by anomalie id")
    @DeleteMapping("anomalie/id/{id}")
    public int deleteByAnomalieId(@PathVariable Long id){
        return service.deleteByAnomalieId(id);
    }
    @ApiOperation("Finds evenements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EvenementDto>> findByCriteria(@RequestBody EvenementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated evenements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EvenementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports evenements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EvenementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets evenement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EvenementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets evenement history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets evenement paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EvenementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports evenement history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EvenementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets evenement history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EvenementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EvenementRestAdmin (EvenementAdminService service, EvenementConverter converter) {
        super(service, converter);
    }
    @Autowired                   // Injects the MyService instance into this controller
    private EvenementAdminServiceImpl myService;

        @PostMapping("/upload")
        public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
            try {
                int result = myService.upload(file);
                if (result == 1) {
                    return ResponseEntity.ok("File uploaded successfully");
                } else {
                    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
                }
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error uploading file: " + e.getMessage());
            }
        }



}