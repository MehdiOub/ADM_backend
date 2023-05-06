package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.TelePeayage;
import ma.adm.easyeve.bean.history.TelePeayageHistory;
import ma.adm.easyeve.dao.criteria.core.TelePeayageCriteria;
import ma.adm.easyeve.dao.criteria.history.TelePeayageHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.TelePeayageAdminService;
import ma.adm.easyeve.ws.converter.TelePeayageConverter;
import ma.adm.easyeve.ws.dto.TelePeayageDto;
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

@Api("Manages telePeayage services")
@RestController
@RequestMapping("/api/admin/telePeayage/")
public class TelePeayageRestAdmin  extends AbstractController<TelePeayage, TelePeayageDto, TelePeayageHistory, TelePeayageCriteria, TelePeayageHistoryCriteria, TelePeayageAdminService, TelePeayageConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all telePeayages")
    @GetMapping("")
    public ResponseEntity<List<TelePeayageDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all telePeayages")
    @GetMapping("optimized")
    public ResponseEntity<List<TelePeayageDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a telePeayage by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TelePeayageDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  telePeayage")
    @PostMapping("")
    public ResponseEntity<TelePeayageDto> save(@RequestBody TelePeayageDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  telePeayage")
    @PutMapping("")
    public ResponseEntity<TelePeayageDto> update(@RequestBody TelePeayageDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of telePeayage")
    @PostMapping("multiple")
    public ResponseEntity<List<TelePeayageDto>> delete(@RequestBody List<TelePeayageDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified telePeayage")
    @DeleteMapping("")
    public ResponseEntity<TelePeayageDto> delete(@RequestBody TelePeayageDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified telePeayage")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple telePeayages by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds telePeayages by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TelePeayageDto>> findByCriteria(@RequestBody TelePeayageCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated telePeayages by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TelePeayageCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports telePeayages by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TelePeayageCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets telePeayage data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TelePeayageCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets telePeayage history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets telePeayage paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TelePeayageHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports telePeayage history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TelePeayageHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets telePeayage history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TelePeayageHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TelePeayageRestAdmin (TelePeayageAdminService service, TelePeayageConverter converter) {
        super(service, converter);
    }


}