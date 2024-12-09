package nasch.prestabanco.totalcost_service.controllers;

import nasch.prestabanco.services.TotalcostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/total_cost")
public class TotalcostController {
    @PostMapping("/")
    public ResponseEntity<Double> costCalculation(@PathVariable long amount,
                                                  @PathVariable float interest_rate,
                                                  @PathVariable int term,
                                                  @PathVariable float desgravament,
                                                  @PathVariable float admin_cor_por,
                                                  @RequestParam(required = false) int... secure) {
        return ResponseEntity.ok(loanService.totalCostCalculation(amount, interest_rate, term, desgravament, admin_cor_por, secure));
    }
}