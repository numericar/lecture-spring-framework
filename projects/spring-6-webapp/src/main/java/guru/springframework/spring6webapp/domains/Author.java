package guru.springframework.spring6webapp.domains;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

/*
 * POJO (Plain Old Java Object) เป็น class ของ java ที่ไม่มีการ implement interface หรือ extend class ใดๆ นอกจาก java.lang.Object
 * โดยมักจะพบเห็นได้ใน Entity class หรือ DTO (Data Transfer Object) class ที่ใช้สำหรับเก็บข้อมูล
 */

@Entity // annotation สำหรับระบุว่า class นี้คือ entity class ซึ่งเป็นตัวแทนของ table ใน database
@Table(name = "authors") // annotation สำหรับระบุชื่อของ table ใน database
public class Author {
    @Id // annotation สำหรับระบุว่า field นี้คือ primary key ของ table
    @GeneratedValue(strategy = GenerationType.AUTO) // annotation สำหรับระบุว่า field นี้จะถูก generate โดยใช้ strategy ที่กำหนดไว้
    @Column(name = "id") // annotation สำหรับระบุชื่อของ column ใน table
    private Long id;

    @Column(name = "first_name") // annotation สำหรับระบุชื่อของ column ใน table
    private String firstName;

    @Column(name = "last_name") // annotation สำหรับระบุชื่อของ column ใน table
    private String lastName;

    @ManyToMany(mappedBy = "authors") // annotation สำหรับระบุว่าเป็นการ map ความสัมพันธ์ของ entity นี้กับ entity อื่น โดยใช้ field ที่กำหนดไว้ โดยในที่นี้คือ field authors ของ entity Book
    private Set<Book> books = new HashSet<>(); // ตัวแปรชนิด Set ที่ใช้เก็บข้อมูลของ Book

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    // ใช้เพื่อแสดงข้อมูลของ object ในรูปแบบของ String
    @Override
    public int hashCode() {
        final int prime = 31; // กำหนดค่า prime เป็น 31
        int result = 1; // กำหนดค่า result เป็น 1
        result = prime * result + ((id == null) ? 0 : id.hashCode()); // คำนวณ hash code ของ id แล้วเก็บไว้ใน result
        return result; // return result
    }

    // ใช้เพื่อเปรียบเทียบ object ว่าเท่ากันหรือไม่
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // ถ้า object ที่เข้ามาเป็น object เดียวกันกับ object นี้ ให้ return true
            return true;
        if (obj == null) // ถ้า object ที่เข้ามาเป็น null ให้ return false
            return false;
        if (getClass() != obj.getClass()) // ถ้า object ที่เข้ามาไม่ใช่ instance ของ class นี้ ให้ return false
            return false;
        Author other = (Author) obj; // แปลง object ที่เข้ามาเป็น object ของ class นี้
        if (id == null) {
            if (other.id != null) // ถ้า id ของ object นี้เป็น null แต่ id ของ object อื่นไม่เป็น null ให้ return false
                return false;
        } else if (!id.equals(other.id))// ถ้า id ของ object นี้ไม่เท่ากับ id ของ object อื่น ให้ return false
            return false;
        return true;
    }

    // ใช้เพื่อแสดงข้อมูลของ object ในรูปแบบของ String
    @Override
    public String toString() {
        return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", books=" + books + "]";
    }
}
