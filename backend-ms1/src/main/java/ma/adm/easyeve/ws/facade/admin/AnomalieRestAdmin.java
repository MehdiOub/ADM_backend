package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.Anomalie;
import ma.adm.easyeve.bean.history.AnomalieHistory;
import ma.adm.easyeve.dao.criteria.core.AnomalieCriteria;
import ma.adm.easyeve.dao.criteria.history.AnomalieHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.AnomalieAdminService;
import ma.adm.easyeve.ws.converter.AnomalieConverter;
import ma.adm.easyeve.ws.dto.AnomalieDto;
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

@Api("Manages anomalie services")
@RestController
@RequestMapping("/api/admin/anomalie/")
public class AnomalieRestAdmin  extends AbstractController<Anomalie, AnomalieDto, AnomalieHistory, AnomalieCriteria, AnomalieHistoryCriteria, AnomalieAdminService, AnomalieConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all anomalies")
    @GetMapping("")
    public ResponseEntity<List<AnomalieDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all anomalies")
    @GetMapping("optimized")
    public ResponseEntity<List<AnomalieDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a anomalie by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AnomalieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  anomalie")
    @PostMapping("")
    public ResponseEntity<AnomalieDto> save(@RequestBody AnomalieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  anomalie")
    @PutMapping("")
    public ResponseEntity<AnomalieDto> update(@RequestBody AnomalieDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of anomalie")
    @PostMapping("multiple")
    public ResponseEntity<List<AnomalieDto>> delete(@RequestBody List<AnomalieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified anomalie")
    @DeleteMapping("")
    public ResponseEntity<AnomalieDto> delete(@RequestBody AnomalieDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified anomalie")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple anomalies by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds anomalies by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AnomalieDto>> findByCriteria(@RequestBody AnomalieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated anomalies by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AnomalieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports anomalies by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AnomalieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets anomalie data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AnomalieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets anomalie history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets anomalie paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AnomalieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports anomalie history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AnomalieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets anomalie history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AnomalieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AnomalieRestAdmin (AnomalieAdminService service, AnomalieConverter converter) {
        super(service, converter);
    }


}