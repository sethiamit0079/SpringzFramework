package com.spring.database.database.jdbc;

import java.security.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.database.database.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbc;
	
	public List<Person>findAll(){
	return 	jdbc.query("select * from person",
				new BeanPropertyRowMapper(Person.class));
	}
	
	public int deleteById(int id){
		return jdbc.update("delete from person where id = ?",
				new Object[]{id});
		}
	
//	public int insert(Person person){
//		return jdbc.update("\r\n"
//				+ "INSERT INTO PERSON(ID,NAME,LOCATION,BIRTH_DATE)"
//				+ "VALUES(?,?,?,?)",
//new Object[]{
//person.getId(),person.getName(),person.getLocation(),
//new Timestamp(person.getBirthDate().getTime()) 
//});
//		} 
	
//	public Person findById(int id){
//		return jdbc.queryForObject("select * from person where id = ?",
//				new Object[]{id},
//					new BeanPropertyRowMapper<Person>(Person.class));
//		}
//	
	
}
