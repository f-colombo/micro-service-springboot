package com.ordersystem.inventoryservice.service;

import com.ordersystem.inventoryservice.model.InventoryItem;
import com.ordersystem.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public List<InventoryItem> getAllInventoryItems() {
        return inventoryRepository.findAll();
    }

    public InventoryItem getInventoryItemById(String id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public InventoryItem createInventoryItem(InventoryItem inventoryItem) {
        return inventoryRepository.save(inventoryItem);
    }

    public void deleteInventoryItem(String id) {
        inventoryRepository.deleteById(id);
    }
}
