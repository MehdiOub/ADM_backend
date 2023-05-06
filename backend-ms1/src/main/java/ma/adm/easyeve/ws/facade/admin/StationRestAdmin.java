package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.Station;
import ma.adm.easyeve.bean.history.StationHistory;
import ma.adm.easyeve.dao.criteria.core.StationCriteria;
import ma.adm.easyeve.dao.criteria.history.StationHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.StationAdminService;
import ma.adm.easyeve.ws.converter.StationConverter;
import ma.adm.easyeve.ws.dto.StationDto;
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

@Api("Manages station services")
@RestController
@RequestMapping("/api/admin/station/")
public class StationRestAdmin  extends AbstractController<Station, StationDto, StationHistory, StationCriteria, StationHistoryCriteria, StationAdminService, StationConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all stations")
    @GetMapping("")
    public ResponseEntity<List<StationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all stations")
    @GetMapping("optimized")
    public ResponseEntity<List<StationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a station by id")
    @GetMapping("id/{id}")
    public ResponseEntity<StationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  station")
    @PostMapping("")
    public ResponseEntity<StationDto> save(@RequestBody StationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  station")
    @PutMapping("")
    public ResponseEntity<StationDto> update(@RequestBody StationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of station")
    @PostMapping("multiple")
    public ResponseEntity<List<StationDto>> delete(@RequestBody List<StationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified station")
    @DeleteMapping("")
    public ResponseEntity<StationDto> delete(@RequestBody StationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified station")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple stations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds a station and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<StationDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds stations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<StationDto>> findByCriteria(@RequestBody StationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated stations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody StationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports stations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody StationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets station data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody StationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets station history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets station paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody StationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports station history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody StationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets station history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody StationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public StationRestAdmin (StationAdminService service, StationConverter converter) {
        super(service, converter);
    }


}