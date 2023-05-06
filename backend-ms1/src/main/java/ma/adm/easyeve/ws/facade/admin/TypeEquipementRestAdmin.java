package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.TypeEquipement;
import ma.adm.easyeve.bean.history.TypeEquipementHistory;
import ma.adm.easyeve.dao.criteria.core.TypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeEquipementHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.TypeEquipementAdminService;
import ma.adm.easyeve.ws.converter.TypeEquipementConverter;
import ma.adm.easyeve.ws.dto.TypeEquipementDto;
import ma.adm.easyeve.zynerator.controller.AbstractController;
import ma.adm.easyeve.zynerator.dto.AuditEntityDto;
import ma.adm.easyeve.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpStatus;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.adm.easyeve.zynerator.process.Result;

import org.springframework.web.multipart.MultipartFile;
import ma.adm.easyeve.zynerator.dto.FileTempDto;

@Api("Manages typeEquipement services")
@RestController
@RequestMapping("/api/admin/typeEquipement/")
public class TypeEquipementRestAdmin  extends AbstractController<TypeEquipement, TypeEquipementDto, TypeEquipementHistory, TypeEquipementCriteria, TypeEquipementHistoryCriteria, TypeEquipementAdminService, TypeEquipementConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all typeEquipements")
    @GetMapping("")
    public ResponseEntity<List<TypeEquipementDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all typeEquipements")
    @GetMapping("optimized")
    public ResponseEntity<List<TypeEquipementDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a typeEquipement by id")
    @GetMapping("id/{id}")
    public ResponseEntity<TypeEquipementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  typeEquipement")
    @PostMapping("")
    public ResponseEntity<TypeEquipementDto> save(@RequestBody TypeEquipementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  typeEquipement")
    @PutMapping("")
    public ResponseEntity<TypeEquipementDto> update(@RequestBody TypeEquipementDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of typeEquipement")
    @PostMapping("multiple")
    public ResponseEntity<List<TypeEquipementDto>> delete(@RequestBody List<TypeEquipementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified typeEquipement")
    @DeleteMapping("")
    public ResponseEntity<TypeEquipementDto> delete(@RequestBody TypeEquipementDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified typeEquipement")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple typeEquipements by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds typeEquipements by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<TypeEquipementDto>> findByCriteria(@RequestBody TypeEquipementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated typeEquipements by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeEquipementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeEquipements by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeEquipementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets typeEquipement data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeEquipementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets typeEquipement history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets typeEquipement paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeEquipementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports typeEquipement history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeEquipementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets typeEquipement history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeEquipementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    @ApiOperation("Gets typeEquipement next ordre value")
    @GetMapping(value = "/getNextOrdre")
    public ResponseEntity<Long> getNextOrdre() {
        Long nextOrdre = service.getNextOrdre();
        return new ResponseEntity<>(nextOrdre, HttpStatus.OK);
    }
    public TypeEquipementRestAdmin (TypeEquipementAdminService service, TypeEquipementConverter converter) {
        super(service, converter);
    }


}