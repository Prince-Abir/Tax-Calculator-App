package com.PrinceTechSolution.TaxCalculator;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.PrinceTechSolution.TaxCalculator.Models.CustomModelOne;
import com.PrinceTechSolution.TaxCalculator.Tax.CardEtinActivity;
import com.PrinceTechSolution.TaxCalculator.Tax.CardFrequentlyAskedQuestion;
import com.PrinceTechSolution.TaxCalculator.Tax.CardIncomeTaxReturn;
import com.PrinceTechSolution.TaxCalculator.Tax.Card_Calculator_Activity;
import com.PrinceTechSolution.TaxCalculator.Tax.IncomeTaxInfo;
import com.PrinceTechSolution.TaxCalculator.Tax.TaxZoneActivity;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    ArrayList<CustomModelOne> list;


    public RecyclerViewAdapter(Context context, ArrayList<CustomModelOne> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.sample_cardview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(list.get(position).getImageId());
        holder.textView.setText(list.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String text = list.get(holder.getAdapterPosition()).getName();

                if (text.contains(context.getResources().getString(R.string.tax_calculate))) {

                    context.startActivity(new Intent(context, Card_Calculator_Activity.class));
                }


                else if (text.contains(context.getResources().getString(R.string.income_tax_return))) {

                    context.startActivity(new Intent(context, CardIncomeTaxReturn.class));
                }

                else if (text.contains(context.getResources().getString(R.string.e_tin))) {

                    context.startActivity(new Intent(context, CardEtinActivity.class));
                }


                else if (text.contains(context.getResources().getString(R.string.tax_faq))) {


                    context.startActivity(new Intent(context, CardFrequentlyAskedQuestion.class));
                }


                else if (text.contains(context.getResources().getString(R.string.tax_location))) {

                    context.startActivity(new Intent(context, TaxZoneActivity.class));
                }


                else if (text.contains(context.getResources().getString(R.string.tax_paripatra))) {

                    context.startActivity(new Intent(context, IncomeTaxInfo.class));
                }

                else{

                    CustomAlert();
                }



            }
        });



    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public void CustomAlert() {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(LayoutInflater.from(context).inflate(R.layout.custom_alert_dialog, null));
        builder.setCancelable(false);


        AlertDialog alertDialog = builder.create();
        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        alertDialog.show();


        Button button = alertDialog.findViewById(R.id.alertButton);
        button.setOnClickListener(v ->

                alertDialog.dismiss()

        );

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.sample_cardview_Image);
            textView = itemView.findViewById(R.id.sample_cardview_text);
        }
    }
}
