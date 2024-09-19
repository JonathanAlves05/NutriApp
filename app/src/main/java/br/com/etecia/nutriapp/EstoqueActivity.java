package br.com.etecia.nutriapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.com.etecia.nutriapp.databinding.ActivityMainBinding;

public class EstoqueActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EstoqueAdapter estoqueAdapter;
    private List<Produto> produtoList;
    private ActivityMainBinding binding;
    private NavHostFragment navHostFragment;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estoque_layout);

        binding = ActivityMainBinding.inflate(getLayoutInflater());


       // initNavigation();

        recyclerView = findViewById(R.id.idRecView);


        produtoList = new ArrayList<>();
        produtoList.add(new Produto("Arroz",  50, 20.50));
        produtoList.add(new Produto("Feijão", 30, 40.50));
        produtoList.add(new Produto("Batata", 25, 30.40));




        estoqueAdapter = new EstoqueAdapter(getApplicationContext(), produtoList);


        recyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 1));

        //fixador de tamanho da lista - deixar a lista mais rápida
        recyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        recyclerView.setAdapter(estoqueAdapter);


    }

    //private void initNavigation(){
      //  navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.idFragmentEstoque);
       // navController = navHostFragment.getNavController();

   // }

    }
