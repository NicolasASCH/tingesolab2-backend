package nasch.prestabanco.simulation_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Service
public class SimulationService {
    public double mortgageCreditSimulation(long amount, float interest_rate, int term) {
        float r = (interest_rate / 12) / 100;
        int n = term * 12;

        return amount * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));
    }
}