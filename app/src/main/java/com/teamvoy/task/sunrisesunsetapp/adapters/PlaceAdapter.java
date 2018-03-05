//package com.teamvoy.task.sunrisesunsetapp.adapters;
//
//import android.content.Context;
//import android.support.annotation.NonNull;
//import android.widget.ArrayAdapter;
//
//import com.teamvoy.task.sunrisesunsetapp.models.CurrentPlace;
//
//import java.util.List;
//
//
//public class PlaceAdapter extends ArrayAdapter<CurrentPlace> {
//    public PlaceAdapter(@NonNull Context context, @NonNull List<CurrentPlace> objects) {
//        super(context, 0, objects);
//    }
//
////    private Context mContext;
//
////    public PlaceAdapter(@NonNull Context context, int resource) {
////        super(context, resource);
//////        mContext = context;
////    }
//
//
////    @SuppressLint("ResourceType")
////    @NonNull
////    @Override
////    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
////        View listItemView = convertView;
////
////        if (listItemView == null) {
////            listItemView = LayoutInflater.from(getContext()).inflate(R.id.place_i, parent, false);
////        }
////        CurrentPlace place = getItem(position);
////
////        TextView place_name_view = listItemView.findViewById(R.id.place_name);
////        place_name_view.setText("Current place coordinates : " + place.getPlaceName());
////        TextView place_address_view = listItemView.findViewById(R.id.place_address);
////        place_address_view.setText("Place address: " + place.getPlaceAddress());
////
////        return listItemView;
////
////
////    }
//}
