package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.TypeVoie;
import ma.adm.easyeve.bean.history.TypeVoieHistory;
import ma.adm.easyeve.dao.criteria.core.TypeVoieCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeVoieHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.TypeVoieAdminService;
import ma.adm.easyeve.ws.converter.TypeVoieConverter;
import ma.adm.easyeve.ws.dto.TypeVoieDto;
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

@Api("Manages typeVoie services")
@RestController
@RequestMapping("/api/admin/typeVoie/")
public class TypeVoieRestAdmin  extends AbstractController<TypeVoie, TypeVoieDto, TypeVoieHistory, TypeVoieCriteria, TypeVoieHistoryCriteria, TypeVoieAdminService, TypeVoieConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeVoies")
    @GetMapping("")
    public ResponseEntity<List<TypeVoieDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeVoies")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeVoieDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeVoie by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeVoieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeVoie")
    @PostMapping("")
    public ResponseEntity<TypeVoieDto> save(@RequestBody TypeVoieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeVoie")
    @PutMapping("")
    public ResponseEntity<TypeVoieDto> update(@RequestBody TypeVoieDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeVoie")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeVoieDto>> delete(@RequestBody List<TypeVoieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeVoie")
    @DeleteMapping("")
    public ResponseEntity<TypeVoieDto> delete(@RequestBody TypeVoieDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeVoie")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeVoies by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeVoies by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeVoieDto>> findByCriteria(@RequestBody TypeVoieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeVoies by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeVoieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeVoies by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeVoieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeVoie data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeVoieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeVoie history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeVoie paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeVoieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeVoie history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeVoieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeVoie history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeVoieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public TypeVoieRestAdmin (TypeVoieAdminService service, TypeVoieConverter converter) {
        super(service, converter);
    }


}