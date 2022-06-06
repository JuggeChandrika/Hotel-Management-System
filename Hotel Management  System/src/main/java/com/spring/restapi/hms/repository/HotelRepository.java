package com.spring.restapi.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.restapi.hms.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {

	 

	/*void delete(String hotel_name);
@Query("SELECT h FROM HOTEL h WHERE CONCAT(h.hotel_name,h.hotel_city) LIKE %?1%")
	public List<Hotel> search(String keyword);

	 public Hotel findByHotelId(int hotelId);*/

} 
