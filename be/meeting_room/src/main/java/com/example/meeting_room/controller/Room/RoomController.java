package com.example.meeting_room.controller.Room;

import com.example.meeting_room.models.room.Area;
import com.example.meeting_room.models.room.Room;
import com.example.meeting_room.models.room.RoomType;
import com.example.meeting_room.service.IAreaService;
import com.example.meeting_room.service.IRoomService;
import com.example.meeting_room.service.IRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class RoomController {
    @Autowired
    private IRoomService iroomService;

    @Autowired
    private IAreaService iAreaService;

    @Autowired
    private IRoomTypeService iRoomTypeService;

    @PostMapping("/add-room")
    public ResponseEntity<Room> saveRoom(@RequestBody Room room) {
        iroomService.save(room);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/get-room")
    public ResponseEntity<List<Room>> listRoom() {
        List<Room> roomList = iroomService.getAll();
        return new ResponseEntity<>(roomList, HttpStatus.OK);
    }

    @DeleteMapping("/delete-room/{id}")
    public ResponseEntity<Room> deleteRoom(@PathVariable("id") UUID id) {
        Optional<Room> room = iroomService.getById(id);
        if (room.isPresent()) {
            iroomService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    //-----------------area---------------
    @PostMapping("/add-area")
    public ResponseEntity<Area> saveArea(@RequestBody Area area) {
        iAreaService.save(area);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/get-area")
    public ResponseEntity<List<Area>> listArea() {
        List<Area> areaList = iAreaService.getAll();
        return new ResponseEntity<>(areaList, HttpStatus.OK);
    }

    //-----------------room type---------------

    @PostMapping("/add-roomtype")
    public ResponseEntity<RoomType> saveRoomType(@RequestBody RoomType roomType) {
        iRoomTypeService.save(roomType);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping("/get-roomtype")
    public ResponseEntity<List<RoomType>> listRoomType() {
        List<RoomType> roomTypeList = iRoomTypeService.getAll();
        return new ResponseEntity<>(roomTypeList, HttpStatus.OK);
    }
}
