package co.kr1lo.platzigram.views.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import co.kr1lo.platzigram.R;
import co.kr1lo.platzigram.adapter.PictureAdapterRecyclerView;
import co.kr1lo.platzigram.model.Picture;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        showToolBar(getResources().getString(R.string.tab_home),false,view);
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buildPictures(), R.layout.cardview_picture,getActivity());

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){

        ArrayList<Picture> pictures = new ArrayList<>();

        pictures.add(new Picture("http://s.hswstatic.com/gif/mt-everest-tourism-171676392.jpg","Kristian Lopez","4 dias", "3 Me gusta"));
        pictures.add(new Picture("http://img1.meristation.com/files/imagenes/general/tonyhawkairtime.jpg","David Lopez","5 dias", "13 Me gusta"));
        pictures.add(new Picture("http://www.cancunyatesenrenta.com/lib/images/cancun-yacht-rental-4.jpg","Elizabeth Lopez","1 dias", "7 Me gusta"));

        return pictures;
    }

    public void showToolBar(String tittle, boolean upButton, View view) {

        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }
}
