package com.app.taxcalculator.Calculator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.app.taxcalculator.R;

public class Card_Calculator_Activity extends AppCompatActivity {

    Spinner spinner;
    String[] categories;
    TextView spinnerTextView;
    Button calculateButton;


    EditText editText1, editText2, editText3, editText4, editText5;

    private double monthlySalary = 0d;
    private double monthlyHouseRent = 0d;
    private double monthlyHealthAllowance = 0d;
    private double monthlyConveyanceAllowance = 0d;
    private double bonus = 0d;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_calculator);

        spinner = findViewById(R.id.spinnerId);
        spinnerTextView = findViewById(R.id.spinnerTextView);

        calculateButton = findViewById(R.id.CalculateButton);

        editText1 = findViewById(R.id.editText1Id);
        editText2 = findViewById(R.id.editText2Id);
        editText3 = findViewById(R.id.editText3Id);
        editText4 = findViewById(R.id.editText4Id);
        editText5 = findViewById(R.id.editText5Id);


        categories = getResources().getStringArray(R.array.Categories);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(Card_Calculator_Activity.this, R.layout.spinner_custom_layout, R.id.spinnerTextView, categories);
        spinner.setAdapter(adapter);
        spinner.setDropDownVerticalOffset(0);


        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedItem = spinner.getSelectedItem().toString();
                System.out.println("Selected Tex : " + selectedItem);

                if (editText1.getText().toString().isEmpty()) {
                    editText1.setError("Enter Amount");
                } else {
                    monthlySalary = Double.parseDouble(editText1.getText().toString());
                }

                if (editText2.getText().toString().isEmpty()) {
                    editText2.setError("Enter Amount");
                } else {
                    monthlyHouseRent = Double.parseDouble(editText2.getText().toString());
                }

                if (editText3.getText().toString().isEmpty()) {
                    editText3.setError("Enter Amount");
                } else {
                    monthlyHealthAllowance = Double.parseDouble(editText3.getText().toString());
                }


                if (editText4.getText().toString().isEmpty()) {
                    editText4.setError("Enter Amount");
                } else {
                    monthlyConveyanceAllowance = Double.parseDouble(editText4.getText().toString());
                }


                if (editText5.getText().toString().isEmpty()) {

                    editText5.setError("Enter Amount");
                } else {
                    bonus = Double.parseDouble(editText5.getText().toString());
                }


                if (selectedItem.equalsIgnoreCase("Male")) {
                    CalculationForMale(monthlySalary, monthlyHouseRent, monthlyHealthAllowance, monthlyConveyanceAllowance, bonus);

                } else if (selectedItem.equalsIgnoreCase("Female & 65 years or Above")) {
                    CalculationForFemale(monthlySalary, monthlyHouseRent, monthlyHealthAllowance, monthlyConveyanceAllowance, bonus);

                } else if (selectedItem.equalsIgnoreCase("Disable Person")) {
                    CalculationForDisable(monthlySalary, monthlyHouseRent, monthlyHealthAllowance, monthlyConveyanceAllowance, bonus);

                } else if (selectedItem.equalsIgnoreCase("Gazetted War-Wounded Freedom Fighters")) {
                    CalculationForFighter(monthlySalary, monthlyHouseRent, monthlyHealthAllowance, monthlyConveyanceAllowance, bonus);

                }


            }
        });

    }


    void CalculationForMale(double salary, double houseRent, double health, double conveyance, double Bonus) {

        double yearlySalary;
        double incomeTax = 0;
        double yearlyPayableTax = 0;
        double halfOfBasicSalary;
        double yearlyHouseRent;
        double yearlyHealthAllowance;
        double tenPercentOfBasicSalary;
        double yearlyConveyanceAllowance;


        //tax on salary calculation
        yearlySalary = salary * 12;
        yearlyPayableTax += yearlySalary;

        halfOfBasicSalary = yearlySalary / 2;


        //tax on house rent
        yearlyHouseRent = houseRent * 12;

        if (halfOfBasicSalary < 300000 && yearlyHouseRent > halfOfBasicSalary) {

            yearlyPayableTax += (yearlyHouseRent - halfOfBasicSalary);
        } else if (halfOfBasicSalary >= 300000 && yearlyHouseRent > 300000) {

            yearlyPayableTax += (yearlyHouseRent - 300000);
        } else {
            yearlyPayableTax += yearlyHouseRent;
        }


        //tax on health allowance
        yearlyHealthAllowance = health * 12;

        tenPercentOfBasicSalary = yearlySalary * 0.10;


        if (tenPercentOfBasicSalary < 120000 && yearlyHealthAllowance > tenPercentOfBasicSalary) {

            yearlyPayableTax += (yearlyHealthAllowance - tenPercentOfBasicSalary);
        } else if (tenPercentOfBasicSalary >= 120000 && yearlyHealthAllowance > 120000) {

            yearlyPayableTax += (yearlyHealthAllowance - 120000);
        } else {
            yearlyPayableTax += yearlyHealthAllowance;
        }


        //tax on Conveyance Allowance

        yearlyConveyanceAllowance = conveyance * 12;

        if (yearlyConveyanceAllowance > 30000) {
            yearlyPayableTax += (yearlyConveyanceAllowance - 30000);
        } else if (yearlyConveyanceAllowance <= 30000) {
            yearlyPayableTax += 0;
        }


        //tax on bonus

        yearlyPayableTax += Bonus;


        if (yearlyPayableTax <= 300000) {
            incomeTax = 0;

        } else if (yearlyPayableTax <= 400000 && yearlyPayableTax > 300000) {
            incomeTax = (yearlyPayableTax - 300000) * 0.05;

        } else if (yearlyPayableTax <= 700000 && yearlyPayableTax > 400000) {
            incomeTax = 5000 + (yearlyPayableTax - 400000) * 0.1;

        } else if (yearlyPayableTax <= 1100000 && yearlyPayableTax > 700000) {
            incomeTax = 5000 + 30000 + (yearlyPayableTax - 700000) * 0.15;

        } else if (yearlyPayableTax <= 1500000 && yearlyPayableTax > 1100000) {
            incomeTax = 5000 + 30000 + 60000 + (yearlyPayableTax - 1100000) * 0.2;

        } else if (yearlyPayableTax > 1500000) {
            incomeTax = 5000 + 30000 + 60000 + 100000 + (yearlyPayableTax - 1500000) * 0.25;
        }

        Intent intent = new Intent(Card_Calculator_Activity.this, Result.class);
        intent.putExtra("totalTaxableIncome", yearlyPayableTax);
        intent.putExtra("ResultTextView2", "Your Total Payable Tax");
        intent.putExtra("totalPayableTax", incomeTax);
        startActivity(intent);

    }

    void CalculationForFemale(double salary, double houseRent, double health, double conveyance, double Bonus) {

        double yearlySalary;
        double incomeTax = 0;
        double yearlyPayableTax = 0;
        double halfOfBasicSalary;
        double yearlyHouseRent;
        double yearlyHealthAllowance ;
        double tenPercentOfBasicSalary;
        double yearlyConveyanceAllowance;


        //tax on salary calculation
        yearlySalary = salary * 12;
        yearlyPayableTax += yearlySalary;

        halfOfBasicSalary = yearlySalary / 2;


        //tax on house rent
        yearlyHouseRent = houseRent * 12;

        if (halfOfBasicSalary < 300000 && yearlyHouseRent > halfOfBasicSalary) {

            yearlyPayableTax += (yearlyHouseRent - halfOfBasicSalary);
        } else if (halfOfBasicSalary >= 300000 && yearlyHouseRent > 300000) {

            yearlyPayableTax += (yearlyHouseRent - 300000);
        } else {
            yearlyPayableTax += yearlyHouseRent;
        }


        //tax on health allowance
        yearlyHealthAllowance = health * 12;

        tenPercentOfBasicSalary = yearlySalary * 0.10;


        if (tenPercentOfBasicSalary < 120000 && yearlyHealthAllowance > tenPercentOfBasicSalary) {

            yearlyPayableTax += (yearlyHealthAllowance - tenPercentOfBasicSalary);
        } else if (tenPercentOfBasicSalary >= 120000 && yearlyHealthAllowance > 120000) {

            yearlyPayableTax += (yearlyHealthAllowance - 120000);
        } else {
            yearlyPayableTax += yearlyHealthAllowance;
        }


        //tax on Conveyance Allowance

        yearlyConveyanceAllowance = conveyance * 12;

        if (yearlyConveyanceAllowance > 30000) {
            yearlyPayableTax += (yearlyConveyanceAllowance - 30000);
        } else if (yearlyConveyanceAllowance <= 30000) {
            yearlyPayableTax += 0;
        }


        //tax on bonus

        yearlyPayableTax += Bonus;


        if (yearlyPayableTax <= 350000) {
            incomeTax = 0;

        } else if (yearlyPayableTax <= 450000 && yearlyPayableTax > 350000) {
            incomeTax = (yearlyPayableTax - 350000) * 0.05;

        } else if (yearlyPayableTax <= 750000 && yearlyPayableTax > 450000) {
            incomeTax = 5000 + (yearlyPayableTax - 450000) * 0.1;

        } else if (yearlyPayableTax <= 1150000 && yearlyPayableTax > 750000) {
            incomeTax = 5000 + 30000 + (yearlyPayableTax - 750000) * 0.15;

        } else if (yearlyPayableTax <= 1550000 && yearlyPayableTax > 1150000) {
            incomeTax = 5000 + 30000 + 60000 + (yearlyPayableTax - 1150000) * 0.2;

        } else if (yearlyPayableTax > 1550000) {
            incomeTax = 5000 + 30000 + 60000 + 100000 + (yearlyPayableTax - 1550000) * 0.25;

        }

        Intent intent = new Intent(Card_Calculator_Activity.this, Result.class);
        intent.putExtra("totalTaxableIncome", yearlyPayableTax);
        intent.putExtra("ResultTextView2", "Your Total Payable Tax");
        intent.putExtra("totalPayableTax", incomeTax);
        startActivity(intent);


    }

    void CalculationForDisable(double salary, double houseRent, double health, double conveyance, double Bonus) {

        double yearlySalary;
        double incomeTax = 0;
        double yearlyPayableTax = 0;
        double halfOfBasicSalary;
        double yearlyHouseRent;
        double yearlyHealthAllowance;
        double tenPercentOfBasicSalary;
        double yearlyConveyanceAllowance;


        //tax on salary calculation
        yearlySalary = salary * 12;
        yearlyPayableTax += yearlySalary;

        halfOfBasicSalary = yearlySalary / 2;


        //tax on house rent
        yearlyHouseRent = houseRent * 12;

        if (halfOfBasicSalary < 300000 && yearlyHouseRent > halfOfBasicSalary) {

            yearlyPayableTax += (yearlyHouseRent - halfOfBasicSalary);
        } else if (halfOfBasicSalary >= 300000 && yearlyHouseRent > 300000) {

            yearlyPayableTax += (yearlyHouseRent - 300000);
        } else {
            yearlyPayableTax += yearlyHouseRent;
        }


        //tax on health allowance
        yearlyHealthAllowance = health * 12;

        tenPercentOfBasicSalary = yearlySalary * 0.10;


        if (tenPercentOfBasicSalary < 120000 && yearlyHealthAllowance > tenPercentOfBasicSalary) {

            yearlyPayableTax += (yearlyHealthAllowance - tenPercentOfBasicSalary);
        } else if (tenPercentOfBasicSalary >= 120000 && yearlyHealthAllowance > 120000) {

            yearlyPayableTax += (yearlyHealthAllowance - 120000);
        } else {
            yearlyPayableTax += yearlyHealthAllowance;
        }


        //tax on Conveyance Allowance

        yearlyConveyanceAllowance = conveyance * 12;

        if (yearlyConveyanceAllowance > 30000) {
            yearlyPayableTax += (yearlyConveyanceAllowance - 30000);
        } else if (yearlyConveyanceAllowance <= 30000) {
            yearlyPayableTax += 0;
        }


        //tax on bonus

        yearlyPayableTax += Bonus;


        if (yearlyPayableTax <= 450000) {
            incomeTax = 0;

        } else if (yearlyPayableTax <= 550000 && yearlyPayableTax > 450000) {
            incomeTax = (yearlyPayableTax - 450000) * 0.05;

        } else if (yearlyPayableTax <= 850000 && yearlyPayableTax > 550000) {
            incomeTax = 5000 + (yearlyPayableTax - 550000) * 0.1;

        } else if (yearlyPayableTax <= 1250000 && yearlyPayableTax > 850000) {
            incomeTax = 5000 + 30000 + (yearlyPayableTax - 850000) * 0.15;

        } else if (yearlyPayableTax <= 1650000 && yearlyPayableTax > 1250000) {
            incomeTax = 5000 + 30000 + 60000 + (yearlyPayableTax - 1250000) * 0.2;

        } else if (yearlyPayableTax > 1650000) {
            incomeTax = 5000 + 30000 + 60000 + 100000 + (yearlyPayableTax - 1650000) * 0.25;

        }

        Intent intent = new Intent(Card_Calculator_Activity.this, Result.class);
        intent.putExtra("totalTaxableIncome", yearlyPayableTax);
        intent.putExtra("ResultTextView2", "Your Total Payable Tax");
        intent.putExtra("totalPayableTax", incomeTax);
        startActivity(intent);

    }


    void CalculationForFighter(double salary, double houseRent, double health, double conveyance, double Bonus) {

        double yearlySalary;
        double incomeTax = 0;
        double yearlyPayableTax = 0;
        double halfOfBasicSalary;
        double yearlyHouseRent;
        double yearlyHealthAllowance;
        double tenPercentOfBasicSalary;
        double yearlyConveyanceAllowance;


        //tax on salary calculation
        yearlySalary = salary * 12;
        yearlyPayableTax += yearlySalary;

        halfOfBasicSalary = yearlySalary / 2;


        //tax on house rent
        yearlyHouseRent = houseRent * 12;

        if (halfOfBasicSalary < 300000 && yearlyHouseRent > halfOfBasicSalary) {

            yearlyPayableTax += (yearlyHouseRent - halfOfBasicSalary);
        } else if (halfOfBasicSalary >= 300000 && yearlyHouseRent > 300000) {

            yearlyPayableTax += (yearlyHouseRent - 300000);
        } else {
            yearlyPayableTax += yearlyHouseRent;
        }


        //tax on health allowance
        yearlyHealthAllowance = health * 12;

        tenPercentOfBasicSalary = yearlySalary * 0.10;


        if (tenPercentOfBasicSalary < 120000 && yearlyHealthAllowance > tenPercentOfBasicSalary) {

            yearlyPayableTax += (yearlyHealthAllowance - tenPercentOfBasicSalary);
        } else if (tenPercentOfBasicSalary >= 120000 && yearlyHealthAllowance > 120000) {

            yearlyPayableTax += (yearlyHealthAllowance - 120000);
        } else {
            yearlyPayableTax += yearlyHealthAllowance;
        }


        //tax on Conveyance Allowance

        yearlyConveyanceAllowance = conveyance * 12;

        if (yearlyConveyanceAllowance > 30000) {
            yearlyPayableTax += (yearlyConveyanceAllowance - 30000);
        } else if (yearlyConveyanceAllowance <= 30000) {
            yearlyPayableTax += 0;
        }


        //tax on bonus

        yearlyPayableTax += Bonus;


        if (yearlyPayableTax <= 475000) {
            incomeTax = 0;

        } else if (yearlyPayableTax <= 575000 && yearlyPayableTax > 475000) {
            incomeTax = (yearlyPayableTax - 475000) * 0.05;

        } else if (yearlyPayableTax <= 875000 && yearlyPayableTax > 575000) {
            incomeTax = 5000 + (yearlyPayableTax - 575000) * 0.1;

        } else if (yearlyPayableTax <= 1275000 && yearlyPayableTax > 875000) {
            incomeTax = 5000 + 30000 + (yearlyPayableTax - 875000) * 0.15;

        } else if (yearlyPayableTax <= 1675000 && yearlyPayableTax > 1275000) {
            incomeTax = 5000 + 30000 + 60000 + (yearlyPayableTax - 1275000) * 0.2;

        } else if (yearlyPayableTax > 1675000) {
            incomeTax = 5000 + 30000 + 60000 + 100000 + (yearlyPayableTax - 1675000) * 0.25;

        }
        Intent intent = new Intent(Card_Calculator_Activity.this, Result.class);
        intent.putExtra("totalTaxableIncome", yearlyPayableTax);
        intent.putExtra("ResultTextView2", "Your Total Payable Tax");
        intent.putExtra("totalPayableTax", incomeTax);
        startActivity(intent);

    }

}