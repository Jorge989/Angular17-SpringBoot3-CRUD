package com.mycompany.itemsservice.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mycompany.itemsservice.dto.ItemDTO;
import com.mycompany.itemsservice.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    ItemDTO addItem(ItemDTO itemDTO);
    List<ItemDTO> allItems();
    List<ItemDTO> searchItemByTitle(String title);
    ItemDTO getDetail(Long id);
    ItemDTO updateItem(Long id, ItemDTO itemDTO);
    ItemDTO updateItemTitle(Long id, String title);
    void deleteItem(Long id);
}