package com.example.meeting_room.controller.equipment;

import com.example.meeting_room.models.equipment.Category;
import com.example.meeting_room.models.equipment.Equipment;
import com.example.meeting_room.service.ICategoryService;
import com.example.meeting_room.service.IEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class EquipmentController {
    @Autowired
    private IEquipmentService iEquipmentService;

    @Autowired
    private ICategoryService iCategoryService;

    @PostMapping("/add-equipment") //,consumes = MediaType.APPLICATION_JSON_VALUE
    public ResponseEntity<Equipment> saveEquipment(@RequestBody Equipment equipment) {
        iEquipmentService.save(equipment);
        return new ResponseEntity<Equipment>(HttpStatus.OK);
    }

    @GetMapping("/get-equipment")
    public ResponseEntity<List<Equipment>> listEquipment() {
        List<Equipment> equipmentList = iEquipmentService.getAll();
        return new ResponseEntity<>(equipmentList, HttpStatus.OK);
    }

    @DeleteMapping("/delete-equipment/{id}")
    public ResponseEntity<Equipment> deleteEquipment(@PathVariable("id") UUID id) {
        Optional<Equipment> equipment = iEquipmentService.getById(id);
        if (equipment.isPresent()) {
            iEquipmentService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

//-----------------category---------------

    @PostMapping("/add-category")
    public ResponseEntity<Category> saveCategory(@RequestBody Category category) {
        iCategoryService.save(category);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //    @GetMapping("/get-category")
//    public List<Category> list(){
//        return iCategoryService.getAll();
//    }
    @GetMapping("/get-category")
    public ResponseEntity<List<Category>> listCategory() {
        List<Category> categoryList = iCategoryService.getAll();
        return new ResponseEntity<>(categoryList, HttpStatus.OK);
    }
}
