package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.StationTypeEquipement;
import ma.adm.easyeve.bean.history.StationTypeEquipementHistory;
import ma.adm.easyeve.dao.criteria.core.StationTypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.StationTypeEquipementHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.StationTypeEquipementAdminService;
import ma.adm.easyeve.ws.converter.StationTypeEquipementConverter;
import ma.adm.easyeve.ws.dto.StationTypeEquipementDto;
import ma.adm.easyeve.zynerator.controller.AbstractController;
import ma.adm.easyeve.zynerator.dto.AuditEntityDto;
import ma.adm.easyeve.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.adm.easyeve.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.adm.easyeve.zynerator.dto.FileTempDto;

@Api("Manages stationTypeEquipement services")
@RestController
@RequestMapping("/api/admin/stationTypeEquipement/")
public class StationTypeEquipementRestAdmin  extends AbstractController<StationTypeEquipement, StationTypeEquipementDto, StationTypeEquipementHistory, StationTypeEquipementCriteria, StationTypeEquipementHistoryCriteria, StationTypeEquipementAdminService, StationTypeEquipementConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all stationTypeEquipements")
    @GetMapping("")
    public ResponseEntity<List<StationTypeEquipementDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a stationTypeEquipement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StationTypeEquipementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  stationTypeEquipement")
    @PostMapping("")
    public ResponseEntity<StationTypeEquipementDto> save(@RequestBody StationTypeEquipementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  stationTypeEquipement")
    @PutMapping("")
    public ResponseEntity<StationTypeEquipementDto> update(@RequestBody StationTypeEquipementDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of stationTypeEquipement")
    @PostMapping("multiple")
    public ResponseEntity<List<StationTypeEquipementDto>> delete(@RequestBody List<StationTypeEquipementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified stationTypeEquipement")
    @DeleteMapping("")
    public ResponseEntity<StationTypeEquipementDto> delete(@RequestBody StationTypeEquipementDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified stationTypeEquipement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple stationTypeEquipements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by station id")
    @GetMapping("station/id/{id}")
    public List<StationTypeEquipement> findByStationId(@PathVariable Long id){
        return service.findByStationId(id);
    }
    @ApiOperation("delete by station id")
    @DeleteMapping("station/id/{id}")
    public int deleteByStationId(@PathVariable Long id){
        return service.deleteByStationId(id);
    }
    @ApiOperation("find by typeEquipement id")
    @GetMapping("typeEquipement/id/{id}")
    public List<StationTypeEquipement> findByTypeEquipementId(@PathVariable Long id){
        return service.findByTypeEquipementId(id);
    }
    @ApiOperation("delete by typeEquipement id")
    @DeleteMapping("typeEquipement/id/{id}")
    public int deleteByTypeEquipementId(@PathVariable Long id){
        return service.deleteByTypeEquipementId(id);
    }
    @ApiOperation("Finds stationTypeEquipements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<StationTypeEquipementDto>> findByCriteria(@RequestBody StationTypeEquipementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated stationTypeEquipements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StationTypeEquipementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports stationTypeEquipements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody StationTypeEquipementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets stationTypeEquipement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StationTypeEquipementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets stationTypeEquipement history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets stationTypeEquipement paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StationTypeEquipementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports stationTypeEquipement history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StationTypeEquipementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets stationTypeEquipement history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StationTypeEquipementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StationTypeEquipementRestAdmin (StationTypeEquipementAdminService service, StationTypeEquipementConverter converter) {
        super(service, converter);
    }


}