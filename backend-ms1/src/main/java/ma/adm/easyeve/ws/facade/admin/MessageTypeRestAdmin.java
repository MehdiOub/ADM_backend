package  ma.adm.easyeve.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.adm.easyeve.bean.core.MessageType;
import ma.adm.easyeve.bean.history.MessageTypeHistory;
import ma.adm.easyeve.dao.criteria.core.MessageTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.MessageTypeHistoryCriteria;
import ma.adm.easyeve.service.facade.admin.MessageTypeAdminService;
import ma.adm.easyeve.ws.converter.MessageTypeConverter;
import ma.adm.easyeve.ws.dto.MessageTypeDto;
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

@Api("Manages messageType services")
@RestController
@RequestMapping("/api/admin/messageType/")
public class MessageTypeRestAdmin  extends AbstractController<MessageType, MessageTypeDto, MessageTypeHistory, MessageTypeCriteria, MessageTypeHistoryCriteria, MessageTypeAdminService, MessageTypeConverter> {



    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }

    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all messageTypes")
    @GetMapping("")
    public ResponseEntity<List<MessageTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all messageTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<MessageTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a messageType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<MessageTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  messageType")
    @PostMapping("")
    public ResponseEntity<MessageTypeDto> save(@RequestBody MessageTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  messageType")
    @PutMapping("")
    public ResponseEntity<MessageTypeDto> update(@RequestBody MessageTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of messageType")
    @PostMapping("multiple")
    public ResponseEntity<List<MessageTypeDto>> delete(@RequestBody List<MessageTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified messageType")
    @DeleteMapping("")
    public ResponseEntity<MessageTypeDto> delete(@RequestBody MessageTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified messageType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple messageTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds messageTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<MessageTypeDto>> findByCriteria(@RequestBody MessageTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated messageTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody MessageTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports messageTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody MessageTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets messageType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody MessageTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets messageType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets messageType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody MessageTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports messageType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody MessageTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets messageType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody MessageTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public MessageTypeRestAdmin (MessageTypeAdminService service, MessageTypeConverter converter) {
        super(service, converter);
    }


}