package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.EventType;
import ma.adm.easyeve.bean.history.EventTypeHistory;
import ma.adm.easyeve.dao.criteria.core.EventTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.EventTypeHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.EventTypeAdminService;
import ma.adm.easyeve.ws.converter.EventTypeConverter;
import ma.adm.easyeve.ws.dto.EventTypeDto;
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

@Api("Manages eventType services")
@RestController
@RequestMapping("/api/admin/eventType/")
public class EventTypeRestAdmin  extends AbstractController<EventType, EventTypeDto, EventTypeHistory, EventTypeCriteria, EventTypeHistoryCriteria, EventTypeAdminService, EventTypeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all eventTypes")
    @GetMapping("")
    public ResponseEntity<List<EventTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all eventTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<EventTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a eventType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EventTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  eventType")
    @PostMapping("")
    public ResponseEntity<EventTypeDto> save(@RequestBody EventTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  eventType")
    @PutMapping("")
    public ResponseEntity<EventTypeDto> update(@RequestBody EventTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of eventType")
    @PostMapping("multiple")
    public ResponseEntity<List<EventTypeDto>> delete(@RequestBody List<EventTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified eventType")
    @DeleteMapping("")
    public ResponseEntity<EventTypeDto> delete(@RequestBody EventTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified eventType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple eventTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds eventTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EventTypeDto>> findByCriteria(@RequestBody EventTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated eventTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EventTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports eventTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EventTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets eventType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EventTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets eventType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets eventType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EventTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports eventType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EventTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets eventType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EventTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EventTypeRestAdmin (EventTypeAdminService service, EventTypeConverter converter) {
        super(service, converter);
    }


}