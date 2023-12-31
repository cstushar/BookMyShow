package com.bookmyshow.bms.service;

import org.springframework.ui.Model;
import com.bookmyshow.bms.model.ReserveSeatConfiguration;

import java.security.Principal;

public interface ReservationService {

    String showMovieReservationPage(final String movieName, final Model model);

    String showSpectacleReservationPage(final String spectacleName, final Model model);

    String showMovieReservationSeatPage(final String movieName, final Long repertoireId, final Model model);

    String spectacleReservationSeatPage(final String spectacleName, final Long repertoireId, final Model model);

    String reservation(final ReserveSeatConfiguration reserveSeatConfiguration, final Long repertoireId, final Principal principal);
}