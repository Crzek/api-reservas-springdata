package com.cruzerick.reservations.mapper;

import com.cruzerick.reservations.dto.ReservationDTO;
import com.cruzerick.reservations.model.Reservation;
import org.springframework.core.convert.converter.Converter;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper extends Converter<Reservation, ReservationDTO> {

    @Override
    ReservationDTO convert(Reservation source);

}