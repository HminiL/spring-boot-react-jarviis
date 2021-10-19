package shop.jarviis.api.backend.item.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.api.backend.item.service.ItemService;

@RestController
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;
}
