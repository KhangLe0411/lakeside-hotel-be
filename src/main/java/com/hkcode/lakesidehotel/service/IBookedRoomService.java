package com.hkcode.lakesidehotel.service;

import com.hkcode.lakesidehotel.model.BookedRoom;

import java.util.List;

public interface IBookedRoomService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
}
