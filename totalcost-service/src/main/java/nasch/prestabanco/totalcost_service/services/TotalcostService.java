package nasch.prestabanco.totalcost_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Service
public class TotalcostService {
    public double totalCostCalculation(long amount, float interest_rate, int term) {
        float r = (interest_rate / 12) / 100;
        int n = term * 12;
        double monthly_fee = amount * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));

        double sec_desgravament = amount * (0.03 / 100);

        double fire_insurance = 20000;

        double admin_com = amount * 0.01;

        double monthly_cost = monthly_fee + sec_desgravament + fire_insurance;

        return monthly_cost + admin_com;
    }
}