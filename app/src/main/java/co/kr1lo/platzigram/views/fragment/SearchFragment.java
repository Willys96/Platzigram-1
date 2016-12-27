package co.kr1lo.platzigram.views.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import co.kr1lo.platzigram.R;
import co.kr1lo.platzigram.adapter.PictureAdapterRecyclerView;
import co.kr1lo.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_search, container, false);

        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.searchFragment);

        GridLayoutManager gridLayoutManager =
                new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false);
        
        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture, getActivity());

        picturesRecycler.setLayoutManager(gridLayoutManager);
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){

        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture("http://s.hswstatic.com/gif/mt-everest-tourism-171676392.jpg","Kristian Lopez","4 dias", "3 Me gusta"));
        pictures.add(new Picture("http://img1.meristation.com/files/imagenes/general/tonyhawkairtime.jpg","David Lopez","5 dias", "13 Me gusta"));
        pictures.add(new Picture("http://www.cancunyatesenrenta.com/lib/images/cancun-yacht-rental-4.jpg","Elizabeth Lopez","1 dias", "7 Me gusta"));
        pictures.add(new Picture("http://s.hswstatic.com/gif/mt-everest-tourism-171676392.jpg","Kristian Lopez","4 dias", "3 Me gusta"));
        pictures.add(new Picture("http://img1.meristation.com/files/imagenes/general/tonyhawkairtime.jpg","David Lopez","5 dias", "13 Me gusta"));
        pictures.add(new Picture("http://www.cancunyatesenrenta.com/lib/images/cancun-yacht-rental-4.jpg","Elizabeth Lopez","1 dias", "7 Me gusta"));

        return pictures;

    }

}
