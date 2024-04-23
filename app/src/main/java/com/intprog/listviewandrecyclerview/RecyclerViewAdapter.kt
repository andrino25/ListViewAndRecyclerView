import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.intprog.listviewandrecyclerview.R

class RecyclerViewAdapter(private val context: Context, private val data: List<RecyclerItems>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    // ViewHolder class to hold the views
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.img)
        val titleTextView: TextView = itemView.findViewById(R.id.title)
        val statusTextView: TextView = itemView.findViewById(R.id.status)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflate the item layout and create a new ViewHolder
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.custom_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Bind data to the views in each item
        val currentItem = data[position]
        holder.imageView.setImageResource(currentItem.imageRes)
        holder.titleTextView.text = currentItem.title
        holder.statusTextView.text = currentItem.status
    }

    override fun getItemCount(): Int {
        // Return the size of the dataset
        return data.size
    }
}

data class RecyclerItems(
    val title: String,
    val status: String,
    val imageRes: Int
)
