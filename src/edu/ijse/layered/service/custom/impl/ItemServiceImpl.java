/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.service.custom.impl;

import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.entity.ItemEntity;
import edu.ijse.layered.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author Anjana
 */
public class ItemServiceImpl implements ItemService{

    @Override
    public String saveItem(ItemDto itemDto) throws Exception {
        ItemEntity entity = getItemEntity(itemDto);
        return null;
    }

    @Override
    public String updateItem(ItemDto itemDto) throws Exception {
        ItemEntity entity = getItemEntity(itemDto);
        return null;
    }

    @Override
    public String deleteItem(String code) throws Exception {
        return null;
    }

    @Override
    public ItemDto searchItem(String code) throws Exception {
        ItemEntity itemEntity = null;
        if(itemEntity != null){
            return getItemDto(itemEntity);
        }
        return null;
    }

    @Override
    public ArrayList<ItemDto> getAll() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        ArrayList<ItemEntity> itemEntities = null;
        for (ItemEntity itemEntity : itemEntities) {
            itemDtos.add(getItemDto(itemEntity));
        }
        return itemDtos;
    }
    
    private ItemDto getItemDto(ItemEntity itemEntity){
        return new ItemDto(itemEntity.getCode(), itemEntity.getDesc(),
                    itemEntity.getPack(), itemEntity.getPrice(), itemEntity.getQoh());
    }
    
    private ItemEntity getItemEntity(ItemDto itemDto){
        return new ItemEntity(itemDto.getCode(), 
                itemDto.getDesc(), itemDto.getPack(), 
                itemDto.getPrice(), itemDto.getQoh());
    }
    
}
