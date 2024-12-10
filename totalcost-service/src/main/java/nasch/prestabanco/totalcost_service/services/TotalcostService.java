package nasch.prestabanco.totalcost_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

@Service
public class TotalcostService {
    public double totalCostCalculation(long amount, float interest_rate, int term, float desgravament, float admin_com_por, int... secure) {
        float r = (interest_rate / 12) / 100;
        int n = term * 12;
        double monthly_fee = amount * ((r * Math.pow((1 + r), n)) / (Math.pow((1 + r), n) - 1));

        float sec_desgravament = amount * desgravament;

        double admin_com = amount * admin_com_por;

        double monthly_cost = monthly_fee + sec_desgravament;
        for (int i : secure) monthly_cost += i;

        return monthly_cost + admin_com;
    }
}