package com.sairaj.HotelManagement.service.interfac;

import com.sairaj.HotelManagement.dto.LoginRequest;
import com.sairaj.HotelManagement.dto.Response;
import com.sairaj.HotelManagement.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
