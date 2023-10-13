package com.roomBooking.controller;

import com.roomBooking.model.Room;
import com.roomBooking.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {
//    private final RoomRepository roomRepository;
//
//    @Autowired
//    public RoomController(RoomRepository roomRepository) {
//        this.roomRepository = roomRepository;
//    }

    @GetMapping("/home")
    public String home()
    {
        return "home";
    }

}
