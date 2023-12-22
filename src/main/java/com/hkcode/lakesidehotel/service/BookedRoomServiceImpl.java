package com.hkcode.lakesidehotel.service;

import com.hkcode.lakesidehotel.model.BookedRoom;
import com.hkcode.lakesidehotel.repository.BookedRoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookedRoomServiceImpl implements IBookedRoomService{

    private final BookedRoomRepository bookedRoomRepository;
    @Override
    public List<BookedRoom> getAllBookingsByRoomId(Long roomId) {
        return bookedRoomRepository.findByRoomId(roomId);
    }
}
