package com.example.vinvi.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.library.banner.RecyclerViewBannerBase;
import com.example.vinvi.R;
import com.example.vinvi.models.VisitingCard;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VisitingCardAdapter extends RecyclerView.Adapter<VisitingCardAdapter.NormalHolder> {

    private Context context;
    private List<VisitingCard> visitingCards;

    public VisitingCardAdapter(Context context, List<VisitingCard> visitingCards) {
        this.context = context;
        this.visitingCards = visitingCards;

    }

    @Override
    public VisitingCardAdapter.NormalHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalHolder(LayoutInflater.from(context).inflate(R.layout.visiting_cards_item, parent, false));
    }

    @Override
    public void onBindViewHolder(NormalHolder holder, int position) {
        VisitingCard visitingCard = visitingCards.get(position);
        holder.tvName.setText(visitingCard.getName());
        holder.tvDesignation.setText(visitingCard.getDesignation());
        holder.tvAddress.setText(visitingCard.getAddress());
        holder.tvWorkEmail.setText(visitingCard.getWorkEmail());
        holder.tvPersonalEmail.setText(visitingCard.getPersonalEmail());
        holder.tvWorkEmail.setText(visitingCard.getWorkEmail());
        holder.tvHomeNumber.setText(visitingCard.getHomeNumber());
        holder.tvOfficeNumber.setText(visitingCard.getOfficeNumber());
        holder.tvMobileNumber.setText(visitingCard.getMobileNumber());
        holder.ivPersonPhoto.setImageResource(visitingCard.getPhotoId());
    }

    @Override
    public int getItemCount() {
        return visitingCards.size();
    }

    class NormalHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.tv_name)
        TextView tvName;
        @BindView(R.id.tv_desig)
        TextView tvDesignation;
        @BindView(R.id.tv_addr)
        TextView tvAddress;
        @BindView(R.id.tv_work_email)
        TextView tvWorkEmail;
        @BindView(R.id.tv_personal_email)
        TextView tvPersonalEmail;
        @BindView(R.id.tv_home_number)
        TextView tvHomeNumber;
        @BindView(R.id.tv_office_number)
        TextView tvOfficeNumber;
        @BindView(R.id.tv_mobile_number)
        TextView tvMobileNumber;
        @BindView(R.id.riv_person_photo)
        ImageView ivPersonPhoto;

        NormalHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);

        }
    }

}
