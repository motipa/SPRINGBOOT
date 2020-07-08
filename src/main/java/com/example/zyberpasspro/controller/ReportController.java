package com.example.zyberpasspro.controller;

import com.example.zyberpasspro.model.Answer;
import com.example.zyberpasspro.model.ExamPurchase;
import com.example.zyberpasspro.model.Report;
import com.example.zyberpasspro.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/report")
public class ReportController {
  @Autowired
  private IReportService reportService;

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Report> getAllUsers() {
        // This returns a JSON or XML with the users
        return reportService.findAll();
    }

  @PostMapping(path="/add")
  public @ResponseBody
  Report CreateReport(@RequestBody Report report) {
    // This returns a JSON or XML with the users
    return reportService.createReport(report);
  }
  @PutMapping("/update/{id}")
  public @ResponseBody Report replaceAnswer(@RequestBody Report report, @PathVariable Long id) {

    return  reportService.updateReport(report,id );
  }
  @GetMapping("/{id}")
  public  @ResponseBody Report one(@PathVariable Long id) {

    return  reportService.getReport(id);
  }
  @DeleteMapping("/{id}")
  public  @ResponseBody Long deleteReport(@PathVariable Long id) {

    return  reportService.deleteReport(id);
  }
}
