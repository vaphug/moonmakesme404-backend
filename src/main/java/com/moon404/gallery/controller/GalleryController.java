package com.moon404.gallery.controller;

import com.moon404.gallery.model.GalleryItem;
import com.moon404.gallery.repository.GalleryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gallery")
@CrossOrigin(origins = "*")
public class GalleryController {

    private final GalleryRepository galleryRepository;

    public GalleryController(GalleryRepository galleryRepository) {
        this.galleryRepository = galleryRepository;
    }

    @GetMapping
    public List<GalleryItem> getAllGalleryItems() {
        return galleryRepository.findAll();
    }

    @PostMapping
    public GalleryItem save(@RequestBody GalleryItem item) {
        return galleryRepository.save(item);
    }

//    @GetMapping
//    public List<String> getImages() {
//        return List.of(
//                "https://res.cloudinary.com/dijs3akyi/image/upload/v1744235726/moon-logo_ugcyfm.png",
//                "https://res.cloudinary.com/dijs3akyi/image/upload/v1744235805/ChatGPT_Image_04_11_30_10_thg_4_2025_feh4z9.png"
//        );
//    }

}
