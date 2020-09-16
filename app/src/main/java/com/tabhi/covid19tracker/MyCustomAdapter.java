package com.tabhi.covid19tracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<CountryClass> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     */

    private Context context;
    private List<CountryClass> countryClassList;
    private List<CountryClass> countryClassListFiltered;

    public MyCustomAdapter(@NonNull Context context, List<CountryClass> countryClassList) {
        super(context, R.layout.custom_list_item,countryClassList);
        this.context=context;
        this.countryClassList = countryClassList;
        this.countryClassListFiltered=countryClassList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,null,true);
        TextView tvCountryName= view.findViewById(R.id.textCountryName);
        ImageView imageView=view.findViewById(R.id.imageFlag);

        tvCountryName.setText(countryClassListFiltered.get(position).getCountry());
        Glide.with(context).load(countryClassListFiltered.get(position).getFlag()).into(imageView);
        return view;
    }

    @Override
    public int getCount() {
        return countryClassListFiltered.size();
    }

    @Nullable
    @Override
    public CountryClass getItem(int position) {
        return countryClassListFiltered.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults filterResults = new FilterResults();
                if (constraint == null || constraint.length() == 0)
                {
                    filterResults.count=countryClassList.size();
                    filterResults.values=countryClassList;
                }
                else
                {
                    List<CountryClass> resultModel = new ArrayList<>();
                    String searchStr = constraint.toString().toLowerCase();
                    for(CountryClass itemModel:countryClassList)
                    {
                        if(itemModel.getCountry().toLowerCase().contains(searchStr))
                        {
                            resultModel.add(itemModel);
                        }
                        filterResults.count=resultModel.size();
                        filterResults.values=resultModel;
                    }
                }
                return filterResults;
            }
            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                countryClassListFiltered = (List<CountryClass>) results.values;
                AffectedCountries.countryClassList=(List<CountryClass>) results.values;
                notifyDataSetChanged();
            }
        };
        return filter;
    }
}
