package test.it.kittipan.newton.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import test.it.kittipan.newton.model.Camera;
import test.it.kittipan.newton.repository.CameraRepository;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;





@RestController
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    private CameraRepository cameraRepository;

    @GetMapping("")
    public Iterable<Camera> getAll() {
        return cameraRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Camera> getById(@PathVariable int id){
        return cameraRepository.findById(id);
    }

    @GetMapping("/ip/{ip}")
    public Iterable<Camera> getByIpAddress(@PathVariable String ip_address) {
        return cameraRepository.findByIpAddress(ip_address);
    }

    @GetMapping("/location/{location}")
    public Iterable<Camera> getByLocation(@PathVariable String location) {
        return cameraRepository.findByLocationContaining(location);
    }

    
    
}