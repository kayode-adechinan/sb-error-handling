package com.adechinan.sberrorhandling.item;


import com.adechinan.sberrorhandling.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/items")
@RequiredArgsConstructor
public class ItemAPI {
    private final ItemRepository itemRepository;


    @PostMapping
    public Item save(@RequestBody @Valid Item item){
        return this.itemRepository.save(item);
    }

    @GetMapping
    public List<Item> all(){
        return this.itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Item find(@PathVariable Long id){
        return this.itemRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }
}
