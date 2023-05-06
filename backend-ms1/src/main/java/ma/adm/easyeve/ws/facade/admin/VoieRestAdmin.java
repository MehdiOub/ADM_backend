package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.Voie;
import ma.adm.easyeve.bean.history.VoieHistory;
import ma.adm.easyeve.dao.criteria.core.VoieCriteria;
import ma.adm.easyeve.dao.criteria.history.VoieHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.VoieAdminService;
import ma.adm.easyeve.ws.converter.VoieConverter;
import ma.adm.easyeve.ws.dto.VoieDto;
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

@Api("Manages voie services")
@RestController
@RequestMapping("/api/admin/voie/")
public class VoieRestAdmin  extends AbstractController<Voie, VoieDto, VoieHistory, VoieCriteria, VoieHistoryCriteria, VoieAdminService, VoieConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all voies")
    @GetMapping("")
    public ResponseEntity<List<VoieDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all voies")
    @GetMapping("optimized")
    public ResponseEntity<List<VoieDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a voie by id")
    @GetMapping("id/{id}")
    public ResponseEntity<VoieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  voie")
    @PostMapping("")
    public ResponseEntity<VoieDto> save(@RequestBody VoieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  voie")
    @PutMapping("")
    public ResponseEntity<VoieDto> update(@RequestBody VoieDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of voie")
    @PostMapping("multiple")
    public ResponseEntity<List<VoieDto>> delete(@RequestBody List<VoieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified voie")
    @DeleteMapping("")
    public ResponseEntity<VoieDto> delete(@RequestBody VoieDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified voie")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple voies by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by typeVoie id")
    @GetMapping("typeVoie/id/{id}")
    public List<Voie> findByTypeVoieId(@PathVariable Long id){
        return service.findByTypeVoieId(id);
    }
    @ApiOperation("delete by typeVoie id")
    @DeleteMapping("typeVoie/id/{id}")
    public int deleteByTypeVoieId(@PathVariable Long id){
        return service.deleteByTypeVoieId(id);
    }
    @ApiOperation("find by telePeayage id")
    @GetMapping("telePeayage/id/{id}")
    public List<Voie> findByTelePeayageId(@PathVariable Long id){
        return service.findByTelePeayageId(id);
    }
    @ApiOperation("delete by telePeayage id")
    @DeleteMapping("telePeayage/id/{id}")
    public int deleteByTelePeayageId(@PathVariable Long id){
        return service.deleteByTelePeayageId(id);
    }
    @ApiOperation("find by station id")
    @GetMapping("station/id/{id}")
    public List<Voie> findByStationId(@PathVariable Long id){
        return service.findByStationId(id);
    }
    @ApiOperation("delete by station id")
    @DeleteMapping("station/id/{id}")
    public int deleteByStationId(@PathVariable Long id){
        return service.deleteByStationId(id);
    }
    @ApiOperation("Finds voies by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<VoieDto>> findByCriteria(@RequestBody VoieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated voies by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody VoieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports voies by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody VoieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets voie data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody VoieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets voie history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets voie paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody VoieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports voie history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody VoieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets voie history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody VoieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public VoieRestAdmin (VoieAdminService service, VoieConverter converter) {
        super(service, converter);
    }


}