package guru.springframework.spring6webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.spring6webapp.domains.Author;

/*
 * CrudRepository เป็น interface ที่ใช้สำหรับการจัดการข้อมูลใน database โดยมี method พื้นฐาน ๆ ให้ใช้งานอยู่แล้ว
 */
@Repository // annotation สำหรับระบุว่าเป็น class ที่ใช้สำหรับการจัดการข้อมูลใน database
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
