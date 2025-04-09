package com.example.todolist.ui.Favoris;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.todolist.databinding.FragmentFavorisBinding;


public class FavorisFragment extends Fragment {


    private FragmentFavorisBinding binding;// It allows you to directly access views from the layout(fragment_favoris.xml) without using findViewById().

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        //FavorisViewModel is a class that stores and manages UI-related data.
        FavorisViewModel favorisViewModel =
                new ViewModelProvider(this).get(FavorisViewModel.class);

        binding = FragmentFavorisBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        favorisViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}