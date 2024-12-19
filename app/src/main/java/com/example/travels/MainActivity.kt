package com.example.travels

import android.os.Bundle
import android.widget.ImageSwitcher
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * Actividad principal de la aplicación Travels.
 *
 * Muestra una lista de imágenes en un `RecyclerView` y permite al usuario
 * seleccionar una imagen para verla en pantalla completa en un `ImageSwitcher`.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var imageSwitcher: ImageSwitcher
    private lateinit var recyclerView: RecyclerView

    /**
     * Se llama cuando se crea la actividad.
     *
     * Inicializa la interfaz de usuario, carga las imágenes y configura el
     * `RecyclerView` y el `ImageSwitcher`.
     *
     * @param savedInstanceState Estado de la instancia guardada, si existe.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Lista de imágenes (puedes añadir más recursos en drawable)
        val imageList = listOf(
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
        )

        // Inicializar ImageSwitcher
        imageSwitcher = findViewById(R.id.imageSwitcher)
        imageSwitcher.setFactory {
            ImageView(this).apply {
                scaleType = ImageView.ScaleType.FIT_CENTER
            }
        }

        // Inicializar RecyclerView
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = ImageAdapter(imageList) { imageResId ->
            imageSwitcher.setImageResource(imageResId)
        }
    }
}