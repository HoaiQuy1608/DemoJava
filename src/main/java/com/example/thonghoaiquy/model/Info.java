package com.example.thonghoaiquy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String idCard;
    private String major;
}
