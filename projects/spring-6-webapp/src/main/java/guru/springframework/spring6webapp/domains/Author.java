package guru.springframework.spring6webapp.domains;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
}
