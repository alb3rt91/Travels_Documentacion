package com.example.travels

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

/**
 * Adaptador para mostrar una lista de imágenes en un RecyclerView.
 *
 * Esta clase se encarga de:
 *
 * * Cargar las imágenes desde una lista de IDs de recursos.
 * * Mostrar las imágenes en un RecyclerView horizontal.
 * * Gestionar la interacción del usuario con las imágenes.
 *
 * @param imageList Lista de IDs de recursos de imágenes a mostrar.
 * @param onItemClick Función lambda que se ejecuta al hacer clic en una imagen. Recibe como parámetro el ID del recurso de la imagen seleccionada.
 *
 * @sample com.example.travels.ImageAdapter.sampleUsage
 */

class ImageAdapter(
    private val imageList: List<Int>,
    private val onItemClick: (Int) -> Unit
) : RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {

    /**
     * ViewHolder para cada elemento de la lista de imágenes.
     *
     * @param view Vista del elemento.
     */
    inner class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        /**
         * ImageView que muestra la imagen dentro del item del RecyclerView.
         */
        val imageView: ImageView = view.findViewById(R.id.itemImage)
    }

    /**
     * Crea una nueva instancia de `ImageViewHolder`.
     *
     * Este método infla la vista del item del RecyclerView y crea una instancia del ViewHolder para enlazar los datos.
     *
     * @param parent ViewGroup padre del ViewHolder.
     * @param viewType Tipo de vista del ViewHolder.
     * @return Una nueva instancia de `ImageViewHolder`.
     */

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ImageViewHolder(view)
    }

    /**
     * Enlaza los datos de la imagen al ViewHolder.
     *
     * Este método toma el recurso de imagen correspondiente al `position` y lo asigna al `ImageView` del `ViewHolder`.
     * Además, se configura un listener de clics que invoca el lambda `onItemClick` con el ID de la imagen.
     *
     * @param holder ViewHolder al que se le van a enlazar los datos.
     * @param position Posición del elemento en la lista de imágenes.
     */

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.imageView.setImageResource(imageList[position])
        holder.itemView.setOnClickListener {
            onItemClick(imageList[position])
        }
    }

    /**
     * Devuelve el número de elementos en la lista de imágenes.
     *
     * @return El número de elementos en la lista.
     */
    override fun getItemCount(): Int = imageList.size
}
