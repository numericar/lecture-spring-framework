package guru.springframework.spring6webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import guru.springframework.spring6webapp.services.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller // ระบุว่า class นี้เป็น controller
@RequestMapping("/books") // ระบุว่า path ของ controller นี้คือ /books
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Model เป็น interface ที่ใช้เก็บข้อมูลที่จะส่งไปแสดงผลที่ view
    @GetMapping // ระบุว่า method นี้ใช้ HTTP GET
    public String getBooks(Model model) {
        // model.addAttribute ใช้เพื่อเก็บข้อมูลที่จะส่งไปแสดงผลที่ view
        model.addAttribute("books", bookService.findAll()); 
        return "books";
    }
}
