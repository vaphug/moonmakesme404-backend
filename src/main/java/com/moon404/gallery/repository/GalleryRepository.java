package com.moon404.gallery.repository;

import com.moon404.gallery.model.GalleryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface GalleryRepository extends JpaRepository<GalleryItem, UUID> {
}
